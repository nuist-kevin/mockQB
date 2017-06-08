package com.mic.test.cb;

import com.mic.test.cb.qb.persist.dao.api.QBWCSessionJpaRepository;
import com.mic.test.cb.qb.persist.dao.api.QBWCTaskJpaRepository;
import com.mic.test.cb.qb.persist.domain.api.QBWCSession;
import com.mic.test.cb.qb.persist.domain.api.QBWCTask;

import com.mic.test.cb.qb.ws.domain.Authenticate;
import com.mic.test.cb.qb.ws.domain.AuthenticateResponse;
import com.mic.test.cb.qb.ws.endpoint.IQbwcServer;
import com.mic.test.cb.qb.ws.endpoint.QbwcServer;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ws.client.core.WebServiceTemplate;

import javax.annotation.Resource;

@ContextConfiguration({"classpath:testApplicationContext.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class WebServiceClientTest {

    @Autowired
    private QBWCTaskJpaRepository qbwcTaskJpaRepository;

    @Resource
    private QBWCSessionJpaRepository qbwcSessionJpaRepository;

    @Autowired
    WebServiceTemplate webServiceTemplate;

    @Test
    public void testCXFClient() {
        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
        factory.setAddress("http://192.168.23.177:8080/services/qbwcServer");
        factory.setServiceClass(IQbwcServer.class);
        IQbwcServer qbwcServer = (IQbwcServer) factory.create();
        System.out.println(qbwcServer.authenticate("zhuwei", "jjj"));
    }

    @Test
    @Transactional
    public void testWs() {
        QBWCTask task = qbwcTaskJpaRepository.findOne(1);
        System.out.println("===============================");
        System.out.println(task.getQbxmlReq());
        System.out.println("=================================");
    }



    @Test
    public void testAuthenticatePass() {
        Authenticate authenticate = new Authenticate();
        authenticate.setStrUserName("gzc");
        authenticate.setStrPassword("pass");
        AuthenticateResponse authicateResponse = (AuthenticateResponse) webServiceTemplate
                .marshalSendAndReceive("http://localhost:8080/services/qbwcServer?wsdl",
                        authenticate);
        String ticket = authicateResponse.getAuthenticateResult().getString().get(0);
        Assert.assertNotNull(ticket);
        Assert.assertEquals(authicateResponse.getAuthenticateResult().getString().get(1), "");
        QBWCSession qbwcSession = qbwcSessionJpaRepository.findByTicket(ticket);
        Assert.assertNotNull(qbwcSession);
    }

/*    @Test
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

*//*            Marshaller marshaller = context.createMarshaller();
            //决定是否在转换成xml时同时进行格式化（即按标签自动换行，否则即是一行的xml）
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            //Marshaller.JAXB_ENCODING xml的编码方式
            marshaller.setProperty(Marshaller.JAXB_ENCODING, "utf-8");
            StringWriter writer = new StringWriter();
            marshaller.marshal(qbxml, writer);
            resultXml = writer.toString();
            System.out.println(resultXml);*//*

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

    }*/
}
