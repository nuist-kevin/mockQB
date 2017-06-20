package com.mic.test.cb.qb.ws;

import com.mic.test.cb.BaseTest;
import com.mic.test.cb.qb.persist.dao.api.QBWCSessionJpaRepository;
import com.mic.test.cb.qb.persist.dao.api.QBWCTaskJpaRepository;
import com.mic.test.cb.qb.persist.domain.api.QBWCSession;
import com.mic.test.cb.qb.persist.domain.api.QBWCTask;
import com.mic.test.cb.qb.persist.domain.api.QBWCTaskType;
import com.mic.test.cb.qb.persist.domain.cb.eum.ShipMethod;
import com.mic.test.cb.qb.ws.domain.Authenticate;
import com.mic.test.cb.qb.ws.domain.AuthenticateResponse;
import com.mic.test.cb.qb.xml.domain.request.item.inventoryAdjustment.InventoryAdjustmentAddRq;
import com.mic.test.cb.qb.xml.domain.request.salesOrder.SalesOrderModRq;
import com.mic.test.cb.qb.xml.domain.request.salesOrder.ShipMethodAddRq;

import org.springframework.test.context.jdbc.Sql;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.w3c.dom.Node;
import javax.annotation.Resource;
import javax.xml.bind.JAXBException;
import java.util.List;

import static com.mic.test.cb.qb.utils.XmlUtil.getRootNodeFromXml;
import static com.mic.test.cb.qb.utils.XmlUtil.unmarshall;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.*;
import static org.hamcrest.core.IsNot.not;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.hamcrest.core.IsNull.nullValue;
import static org.hamcrest.xml.HasXPath.hasXPath;

public class AuthenticateTest extends BaseTest {

  @Resource
  QBWCSessionJpaRepository qbwcSessionJpaRepository;

  @Resource
  QBWCTaskJpaRepository qbwcTaskJpaRepository;

  private Authenticate authenticate;
  private AuthenticateResponse authenticateResponse;


  @BeforeMethod
  public void getTicket() {
    authenticate = new Authenticate();
    authenticate.setStrUserName(USERNAME);
    authenticate.setStrPassword(PASSWORD);
    authenticateResponse = (AuthenticateResponse) webServiceTemplate
        .marshalSendAndReceive(WSDLLOCATION, authenticate);
    ticket = authenticateResponse.getAuthenticateReturn().getAuthenticateReturn().get(0);
  }

    /* 测试鉴权通过后生成《添加货主》任务
    * */

  @Test
  // sql 进行数据准备
  @Sql
  public void authPassAndAddVendorTask() throws JAXBException {

    // 验证鉴权成功

    assertThat(ticket, not(""));
    System.out.println(ticket);
    assertThat(authenticateResponse.getAuthenticateReturn().getAuthenticateReturn().get(1),
        equalTo(""));

    // 验证 session 表
    QBWCSession qbwcSession = qbwcSessionJpaRepository.findByTicketAndStatus(ticket, 0);
    assertThat(qbwcSession, is(notNullValue()));
    assertThat(qbwcSession.getUsername(), equalTo(USERNAME));

    // 验证查询任务：货主查询，货品查询，客户查询，订单查询
    assertThat(qbwcTaskJpaRepository.findByTicketAndStatusAndType(ticket, 0, 1), not(nullValue()));
    assertThat(qbwcTaskJpaRepository.findByTicketAndStatusAndType(ticket, 0, 4), not(nullValue()));
    assertThat(qbwcTaskJpaRepository.findByTicketAndStatusAndType(ticket, 0, 7), not(nullValue()));
    assertThat(qbwcTaskJpaRepository.findByTicketAndStatusAndType(ticket, 0, 10), not(nullValue()));

    // 验证添加货主任务
    List<QBWCTask> addVendorTaskList = qbwcTaskJpaRepository
        .findByTicketAndStatusAndType(ticket, 0, QBWCTaskType.ADD_VENDOR.getKey());
    assertThat(addVendorTaskList, hasSize(4));
  }

  /*
  *  测试鉴权通过后生成《添加发货方式》任务
  *   验证WMS_QB_SHIP_METHOD 没有记录时添加的任务, 一共17种
  * */
  public void authPassAndAddShippingMethodTask() throws JAXBException {
    // 验证添加发货方式任务
    List<QBWCTask> taskList = qbwcTaskJpaRepository.findByTicketAndStatusAndType(ticket, 0, 13);
    assertThat(taskList, hasSize(17));
  }

  /*
  *   测试鉴权通过后生成《添加发货方式》任务
  *   验证 WMS_QB_SHIP_METHOD 缺少一种记录时添加的任务，如 UPS GROUND
  * */
  @Test
  public void authPassAndAddOneMissingShippingMethodTask() throws JAXBException {
//        this.ticket = "ca4abb1e-f47a-4c3c-b211-28326a1d5fff";
    // 验证添加发货方式任务
    List<QBWCTask> taskList = qbwcTaskJpaRepository.findByTicketAndStatusAndType(ticket, 0, 13);
    assertThat(taskList, hasSize(1));
    // 解析XML内容
    ShipMethodAddRq shipMethodAddRq = unmarshall(taskList.get(0).getQbxmlReq(),
        ShipMethodAddRq.class);

    assertThat(shipMethodAddRq.getShipMethodAdd().getName(),
        equalTo(ShipMethod.UPS_Ground.getName()));
    assertThat(shipMethodAddRq.getShipMethodAdd().isActive(), is(true));
  }

  /*
  *  测试鉴权通过后生成《库存调整》任务
  * */
  public void authPassAndInventoryAjustmentAddTask() throws JAXBException {
    List<QBWCTask> taskList = qbwcTaskJpaRepository.findByTicketAndStatusAndType(ticket, 0, 13);
    assertThat(taskList, hasSize(1));
    InventoryAdjustmentAddRq inventoryAdjustmentAddRq = unmarshall(taskList.get(0).getQbxmlReq(),
        InventoryAdjustmentAddRq.class);

  }


  /*
*  测试鉴权通过后生成《修改订单》任务
* */
  public void authPassAndSalesOrderModTask() throws JAXBException {
    List<QBWCTask> taskList = qbwcTaskJpaRepository.findByTicketAndStatusAndType(ticket, 0, 11);
    assertThat(taskList, hasSize(3));
    SalesOrderModRq salesOrderModRq = unmarshall(taskList.get(0).getQbxmlReq(),
        SalesOrderModRq.class);


  }

  @Test
  public void testXpathAssert() throws Exception {
    String ss = "<ShipMethodAddRq requestID=\"245f068e-4688-4f6c-a057-5eedd84fcc67\">\n" +
        "  <ShipMethodAdd>\n" +
        "    <Name>FedEx 2 Day</Name>\n" +
        "    <IsActive>true</IsActive>\n" +
        "  </ShipMethodAdd>\n" +
        "</ShipMethodAddRq>";
    Node root = getRootNodeFromXml(ss);

    assertThat(root, hasXPath("//IsActive", equalTo("true")));
    assertThat(root, hasXPath("//Name", equalTo("FedEx 2 Day")));

  }


}
