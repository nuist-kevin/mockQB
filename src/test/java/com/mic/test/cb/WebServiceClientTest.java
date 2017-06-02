package com.mic.test.cb;

import com.mic.test.cb.qb.persist.dao.QBWCTaskDao;
import com.mic.test.cb.qb.persist.domain.QBWCTask;
import com.mic.test.cb.qb.ws.domain.Authenticate;
import com.mic.test.cb.qb.ws.domain.AuthicateResponse;
import com.mic.test.cb.qb.ws.domain.sendRequestXML.SendRequestXMLRequest;
import com.mic.test.cb.qb.ws.domain.sendRequestXML.SendRequestXMLResponse;
import com.mic.test.cb.qb.xml.domain.QBXML;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ws.client.core.WebServiceTemplate;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;

@ContextConfiguration({"classpath:testApplicationContext.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class WebServiceClientTest {

    @Autowired
    private QBWCTaskDao qbwcTaskDao;

    @Autowired
    WebServiceTemplate webServiceTemplate;

    @Test
    @Transactional
    public void testWs() {
        QBWCTask task = qbwcTaskDao.getOne(1);
        System.out.println("===============================");
        System.out.println(task.getQbxmlReq());
        System.out.println("=================================");
    }

    @Test
    public void testAuthenticateInvalid() {
        Authenticate authenticate = new Authenticate();
        authenticate.setStrUserName("wronguser");
        authenticate.setStrPassword("wrongpass");
        AuthicateResponse authicateResponse = (AuthicateResponse) webServiceTemplate.marshalSendAndReceive("http://localhost:8080/services/qbwcServer?wsdl", authenticate);
        Assert.assertEquals(authicateResponse.getAuthenticateReturn()[0], "");
        Assert.assertEquals(authicateResponse.getAuthenticateReturn()[1], "nvu");
    }

    @Test
    public void testAuthenticatePass() {
        Authenticate authenticate = new Authenticate();
        authenticate.setStrUserName("gzc");
        authenticate.setStrPassword("pass");
        AuthicateResponse authicateResponse = (AuthicateResponse) webServiceTemplate.marshalSendAndReceive("http://localhost:8080/services/qbwcServer?wsdl", authenticate);
        Assert.assertNotNull(authicateResponse.getAuthenticateReturn()[0]);
        Assert.assertEquals(authicateResponse.getAuthenticateReturn()[1], "");
    }

    @Test
//    @Sql({""})
    public void testSendRequestXML() {

        SendRequestXMLRequest sendRequestXMLRequest = new SendRequestXMLRequest();
        sendRequestXMLRequest.setTicket("abe630f1-98b5-4db5-a6f4-1e37742be712");
        sendRequestXMLRequest.setStrHCPResponse("");
        sendRequestXMLRequest.setStrCompanyFileName("testFile");
        sendRequestXMLRequest.setQbXMLCountry("US");
        sendRequestXMLRequest.setQbXMLMajorVers("6");
        sendRequestXMLRequest.setQbXMLMinorVers("6");
        SendRequestXMLResponse response =
                (SendRequestXMLResponse) webServiceTemplate.marshalSendAndReceive("http://localhost:8080/services/qbwcServer?wsdl",
                        sendRequestXMLRequest);
        String qbxml = response.getSendRequestXMLReturn();
        try {
            JAXBContext context = JAXBContext.newInstance(QBXML.class);

/*            Marshaller marshaller = context.createMarshaller();
            //决定是否在转换成xml时同时进行格式化（即按标签自动换行，否则即是一行的xml）
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            //Marshaller.JAXB_ENCODING xml的编码方式
            marshaller.setProperty(Marshaller.JAXB_ENCODING, "utf-8");
            StringWriter writer = new StringWriter();
            marshaller.marshal(qbxml, writer);
            resultXml = writer.toString();
            System.out.println(resultXml);*/

            System.out.println("==========================");
            System.out.println(qbxml);
            System.out.println("==========================");

            Unmarshaller unmarshaller = context.createUnmarshaller();
            QBXML qbxml1 = (QBXML) unmarshaller.unmarshal(new StringReader(qbxml));
            System.out.println("==========================");

            System.out.println(qbxml1.getQbxmlMsg().getQbxmlBusiMsgList());

            System.out.println("==========================");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
