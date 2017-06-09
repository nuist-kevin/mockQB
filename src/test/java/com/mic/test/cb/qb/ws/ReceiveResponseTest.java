package com.mic.test.cb.qb.ws;

import static com.mic.test.cb.qb.utils.XmlUtil.unmarshall;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.MatcherAssert.assertThat;

import com.mic.test.cb.BaseTest;
import com.mic.test.cb.qb.persist.dao.api.QBWCTaskJpaRepository;
import com.mic.test.cb.qb.persist.dao.cb.QBCustomerJpaRepository;
import com.mic.test.cb.qb.persist.dao.cb.QBShipMethodJpaRespository;
import com.mic.test.cb.qb.persist.dao.cb.QBVendorJpaRepository;
import com.mic.test.cb.qb.persist.domain.api.QBWCTask;
import com.mic.test.cb.qb.persist.domain.api.QBWCTaskType;
import com.mic.test.cb.qb.persist.domain.cb.QBCustomer;
import com.mic.test.cb.qb.persist.domain.cb.QBShipMethod;
import com.mic.test.cb.qb.persist.domain.cb.QBVendor;
import com.mic.test.cb.qb.ws.domain.ReceiveResponseXML;
import com.mic.test.cb.qb.ws.domain.ReceiveResponseXMLResponse;
import com.mic.test.cb.qb.xml.domain.QBXML;
import com.mic.test.cb.qb.xml.domain.response.customer.CustomerQueryRs;
import com.mic.test.cb.qb.xml.domain.response.customer.CustomerRet;
import com.mic.test.cb.qb.xml.domain.response.salesOrder.ShipMethodAddRs;
import com.mic.test.cb.qb.xml.domain.response.vendor.VendorAddRs;
import javax.annotation.Resource;
import javax.xml.bind.JAXBException;
import org.testng.annotations.BeforeMethod;

public class ReceiveResponseTest extends BaseTest {

  @Resource
  QBVendorJpaRepository vendorJpaRepository;

  @Resource
  QBCustomerJpaRepository customerJpaRepository;

  @Resource
  QBShipMethodJpaRespository shipMethodJpaRespository;

  @Resource
  QBWCTaskJpaRepository qbwcTaskJpaRepository;

  ReceiveResponseXML receiveResponseXML;
  ReceiveResponseXMLResponse receiveResponseXMLResponse;
  String requestId = "";

  @BeforeMethod
  public void setReceiveResponseData() {
    receiveResponseXML.setTicket("");
    receiveResponseXML.setHresult("");
    receiveResponseXML.setMessage("");
    receiveResponseXML.setResponse("");
  }

    /*  插入查询客户的任务信息数据 以及 cb 上QB客户的数据
  *   任务成功后更新QB客户数据及任务信息
  * */

  public void testCustomerQuery(String responseXmlData, int resultNum) throws Exception {
    QBXML sendXml = unmarshall(responseXmlData, QBXML.class);
    receiveResponseXMLResponse = (ReceiveResponseXMLResponse) webServiceTemplate
        .marshalSendAndReceive(WSDLLOCATION, sendXml);

    // 检查返回码
    assertThat(receiveResponseXMLResponse.getReceiveResponseXMLResult(), equalTo(resultNum));
    CustomerQueryRs customerQueryRs = (CustomerQueryRs) sendXml.getQbxmlMsgs().getQbxmlBusiMsgList()
        .get(0);

    // 检查任务状态是否为成功 2
    QBWCTask task = qbwcTaskJpaRepository.findByRequestIdAndStatusAndType(
        customerQueryRs.getRequestId(), 2, 5);
    assertThat(task, not(nullValue()));

    // 检查 CB 库中的listId 和 fullname 是否回填进去
    for (CustomerRet customerRet : customerQueryRs.getCustomerRetList()) {
      QBCustomer qbCustomer = customerJpaRepository
          .findByListId(customerRet.getListId());
      assertThat(qbCustomer, not(nullValue()));
      assertThat(qbCustomer.getListId(), equalTo(customerRet.getListId()));
      assertThat(qbCustomer.getFullname(), equalTo(customerRet.getFullName()));
      assertThat(qbCustomer.getAddr1(), equalTo(customerRet.getShipAddress().getAddr1()));
    }

  }



  /*  插入添加货主的任务信息数据 以及 cb 上开通货主的数据
  *   任务成功后更新货主数据及任务信息
  * */

  public void testResponseAddVendor(String responseXmlData, int resultNum) throws JAXBException {
    QBXML sendXml = unmarshall(responseXmlData, QBXML.class);
    receiveResponseXMLResponse = (ReceiveResponseXMLResponse) webServiceTemplate
        .marshalSendAndReceive(WSDLLOCATION, sendXml);

    // 检查返回码
    assertThat(receiveResponseXMLResponse.getReceiveResponseXMLResult(), equalTo(resultNum));

    VendorAddRs vendorAddRs
        = (VendorAddRs) sendXml.getQbxmlMsgs().getQbxmlBusiMsgList().get(0);

    // 检查任务状态是否为成功 2
    QBWCTask task = qbwcTaskJpaRepository.findByRequestIdAndStatusAndType(
        vendorAddRs.getRequestId(), 2, 5);
    assertThat(task, not(nullValue()));

    // 检查 CB 库中的listId 是否回填进去
    QBVendor qbVendor = vendorJpaRepository
        .findByQbVendorId(vendorAddRs.getVendorRet().getListId());
    assertThat(qbVendor, not(nullValue()));
    // 检查 editSequence 是否正确
    assertThat(qbVendor.getEditSequence(), equalTo(vendorAddRs.getVendorRet().getEditSequence()));
  }

    /*  插入添加发货方式的任务信息数据 以及 cb 上发货方式的数据
  *   任务成功后更新发货方式数据及任务信息
  * */

  public void testRsAddShipMethod(String responseXmlData, int resultNum) throws Exception {
    QBXML sendXml = unmarshall(responseXmlData, QBXML.class);
    receiveResponseXMLResponse = (ReceiveResponseXMLResponse) webServiceTemplate
        .marshalSendAndReceive(WSDLLOCATION, sendXml);

    // 检查返回码
    assertThat(receiveResponseXMLResponse.getReceiveResponseXMLResult(), equalTo(resultNum));

    ShipMethodAddRs shipMethodAddRs = (ShipMethodAddRs) sendXml.getQbxmlMsgs().getQbxmlBusiMsgList()
        .get(0);

    // 检查任务状态是否为成功 2
    QBWCTask task = qbwcTaskJpaRepository.findByRequestIdAndStatusAndType(
        shipMethodAddRs.getRequestId(), 2, QBWCTaskType.ADD_SHIP_METHOD.getKey());
    assertThat(task, not(nullValue()));

    // 检查
    QBShipMethod shipMethod = shipMethodJpaRespository
        .findByListId(shipMethodAddRs.getShipMethodRet().getId());
    assertThat(shipMethod, not(nullValue()));
    assertThat(shipMethod.getEditSequence(),
        equalTo(shipMethodAddRs.getShipMethodRet().getEditSequence()));

  }


}
