package com.mic.test.cb.qb.ws;

import com.mic.test.cb.BaseTest;
import com.mic.test.cb.qb.ws.domain.SendRequestXML;
import com.mic.test.cb.qb.ws.domain.SendRequestXMLResponse;
import com.mic.test.cb.qb.xml.domain.QBXML;
import com.mic.test.cb.qb.xml.domain.QBXMLBusiMsg;
import com.mic.test.cb.qb.xml.domain.request.salesOrder.ShipMethodAddRq;
import java.util.List;
import org.junit.Test;
import org.springframework.test.context.jdbc.Sql;

import static com.mic.test.cb.qb.utils.XmlUtil.unmarshall;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasSize;

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
    sendRequestXMLResponse = (SendRequestXMLResponse) webServiceTemplate
        .marshalSendAndReceive(WSDLLOCATION, sendRequestXML);
    String sendRequestXMLResult = sendRequestXMLResponse.getSendRequestXMLResult();
    QBXML qbxml = unmarshall(sendRequestXMLResult, QBXML.class);
    List<QBXMLBusiMsg> busiMsgList = qbxml.getQbxmlMsgs().getQbxmlBusiMsgList();

    assertThat(busiMsgList, hasSize(3));

  }
}
