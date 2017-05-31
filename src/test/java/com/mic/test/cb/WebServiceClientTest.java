package com.mic.test.cb;

import com.mic.test.cb.qb.ws.domain.sendRequestXML.SendRequestXMLRequest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.BootstrapWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestContextBootstrapper;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.soap.saaj.SaajSoapMessageFactory;

/**
 * Created by caiwen on 2017/5/25.
 */

@ContextConfiguration({"classpath:testApplicationContext.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class WebServiceClientTest {

    @Autowired
    WebServiceClient webServiceClient;

    @Autowired
    WebServiceTemplate webServiceTemplate;

    @Test
    public void testWs() {
        webServiceClient.simpleSendAndReceive();
    }

    @Test
    public void testSendRequestXML() {
        SendRequestXMLRequest sendRequestXMLRequest = new SendRequestXMLRequest();
        sendRequestXMLRequest.setTicket("4ff304c9-d93f-42de-a958-d9d7a57d7805");
        sendRequestXMLRequest.setStrHCPResponse("");
        sendRequestXMLRequest.setStrCompanyFileName("testFile");
        sendRequestXMLRequest.setQbXMLCountry("US");
        sendRequestXMLRequest.setQbXMLMajorVers("6");
        sendRequestXMLRequest.setQbXMLMinorVers("6");
        webServiceTemplate.marshalSendAndReceive("http://localhost:8080/services/qbwcServer?wsdl",
                sendRequestXMLRequest);
    }
}
