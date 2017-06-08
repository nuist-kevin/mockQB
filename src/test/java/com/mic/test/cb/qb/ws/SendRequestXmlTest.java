package com.mic.test.cb.qb.ws;

import com.mic.test.cb.BaseTest;
import com.mic.test.cb.qb.ws.domain.SendRequestXML;
import com.mic.test.cb.qb.ws.domain.SendRequestXMLResponse;
import com.mic.test.cb.qb.xml.domain.QBXML;
import com.mic.test.cb.qb.xml.domain.QBXMLBusiMsg;
import java.util.List;
import org.junit.Test;
import org.springframework.test.context.jdbc.Sql;
import org.w3c.dom.Node;

import static com.mic.test.cb.qb.utils.XmlUtil.getRootNodeFromXml;
import static com.mic.test.cb.qb.utils.XmlUtil.unmarshall;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.hasXPath;

public class SendRequestXmlTest extends BaseTest {

  SendRequestXML sendRequestXML;
  SendRequestXMLResponse sendRequestXMLResponse;

  //    @Before
  public void getTicket() {
    sendRequestXML = new SendRequestXML();
    sendRequestXML.setTicket("");
    sendRequestXML.setQbXMLCountry("USA");
    sendRequestXML.setQbXMLMajorVers(0);
    sendRequestXML.setQbXMLMinorVers(0);
    sendRequestXML.setStrHCPResponse("HCP");
    sendRequestXML.setStrCompanyFileName("");
  }

  /*  所有任务都为 0 的状态，则首先发送添加发货方式的请求
  *
  *
  * */
  @Test
  @Sql
  // TODO 插入QB同步任务信息

  public void testGetAddShipMethodReq() throws Exception {
    String qbxml = getQbxml();
    Node root = getRootNodeFromXml(qbxml);

    assertThat(root, hasXPath("/QBXML/QBXMLMsgsRq/ShipMethodAddRq[3]/ShipMethodAdd"));

  }

  /*  所有添加发货方式任务为 1 的状态，其它任务为 0  的状态，则首先发送添加货主的请求
*
*
* */
  @Test
  @Sql
  // TODO 插入QB同步任务信息

  public void testGetAddVendorReq() throws Exception {
    String qbxml = getQbxml();
    Node root = getRootNodeFromXml(qbxml);
    assertThat(root, hasXPath("/QBXML/QBXMLMsgsRq/VendorAddRq[3]/VendorAdd"));

  }

  /*  所有添加发货方式、添加货主的任务为 1 的状态，其它任务为 0  的状态，则首先发送查询货主货主的请求
  *
  * */
  @Test
  @Sql
  // TODO 插入QB同步任务信息

  public void testGetQueryVendorReq() throws Exception {
    String qbxml = getQbxml();
    QBXML qbxmlObject = unmarshall(qbxml, QBXML.class);
    Node root = getRootNodeFromXml(qbxml);
    // 查询任务只有一个task，拼装成的请求中只有一条Rq
    assertThat(qbxmlObject.getQbxmlMsgs().getQbxmlBusiMsgList(), hasSize(1));
    assertThat(root, hasXPath("/QBXML/QBXMLMsgsRq/VendorQueryRq/FromModifiedDate"));
  }

  /*  所有添加发货方式、添加货主、查询货主的任务为 1 的状态，其它任务为 0  的状态，则首先发送查询货品的请求
  *
  * */
  @Test
  @Sql
  // TODO 插入QB同步任务信息

  public void testGetQueryItemInventoryReq() throws Exception {
    String qbxml = getQbxml();
    QBXML qbxmlObject = unmarshall(qbxml, QBXML.class);
    Node root = getRootNodeFromXml(qbxml);
    // 查询任务只有一个task，拼装成的请求中只有一条Rq
    assertThat(qbxmlObject.getQbxmlMsgs().getQbxmlBusiMsgList(), hasSize(1));
    assertThat(root, hasXPath("/QBXML/QBXMLMsgsRq/ItemInventoryQueryRq/FromModifiedDate"));
  }


  /*  所有添加发货方式、添加货主、查询货主、查询货品的任务为 1 的状态，其它任务为 0  的状态，
  *     则首先发送 查询客户 的请求
  * */
  @Test
  @Sql
  // TODO 插入QB同步任务信息

  public void testGetQueryCustomerReq() throws Exception {
    String qbxml = getQbxml();
    QBXML qbxmlObject = unmarshall(qbxml, QBXML.class);
    Node root = getRootNodeFromXml(qbxml);
    // 查询任务只有一个task，拼装成的请求中只有一条Rq
    assertThat(qbxmlObject.getQbxmlMsgs().getQbxmlBusiMsgList(), hasSize(1));
    assertThat(root, hasXPath("/QBXML/QBXMLMsgsRq/CustomerQueryRq/FromModifiedDate"));
  }

  /*  所有添加发货方式、添加货主、查询货主、查询货品、查询客户的任务为 1 的状态，其它任务为 0  的状态，
*     则首先发送 查询订单  的请求
* */
  @Test
  @Sql
  // TODO 插入QB同步任务信息

  public void testGetSalesOrderReq() throws Exception {
    String qbxml = getQbxml();
    QBXML qbxmlObject = unmarshall(qbxml, QBXML.class);
    Node root = getRootNodeFromXml(qbxml);
    // 查询任务只有一个task，拼装成的请求中只有一条Rq
    assertThat(qbxmlObject.getQbxmlMsgs().getQbxmlBusiMsgList(), hasSize(1));
    assertThat(root,
        hasXPath("/QBXML/QBXMLMsgsRq/SalesOrderQueryRq/ModifiedDateRangeFilter/FromModifiedDate"));
  }

  /*  所有添加发货方式、添加货主、查询货主、查询货品、查询客户、查询订单的任务为 1 的状态，其它任务为 0  的状态，
*     则首先发送 修改库存  的请求
* */
  @Test
  @Sql
  // TODO 插入QB同步任务信息

  public void testInventoryAdjustmentReq() throws Exception {
    String qbxml = getQbxml();
    Node root = getRootNodeFromXml(qbxml);
    assertThat(root,
        hasXPath(
            "/QBXML/QBXMLMsgsRq/InventoryAdjustmentAddRq[3]/InventoryAdjustmentAdd/InventoryAdjustmentLineAdd/QuantityAdjustment/NewQuantity"));
  }

  /*  所有添加发货方式、添加货主、查询货主、查询货品、查询客户、查询订单、修改库存的任务为 1 的状态，其它任务为 0  的状态，
*     则首先发送 修改订单（添加物流单）  的请求
* */
  @Test
  @Sql
  // TODO 插入QB同步任务信息

  public void testModSalesOrderReq() throws Exception {
    String qbxml = getQbxml();
    Node root = getRootNodeFromXml(qbxml);
    assertThat(root,
        hasXPath(
            "/QBXML/QBXMLMsgsRq/SalesOrderModRq[3]/SalesOrderMod/EditSequence"));
  }

  private String getQbxml() throws javax.xml.bind.JAXBException {
    sendRequestXMLResponse = (SendRequestXMLResponse) webServiceTemplate
        .marshalSendAndReceive(WSDLLOCATION, sendRequestXML);
    String sendRequestXMLResult = sendRequestXMLResponse.getSendRequestXMLResult();
    return sendRequestXMLResult;
  }


}
