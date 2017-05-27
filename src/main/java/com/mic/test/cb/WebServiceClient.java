package com.mic.test.cb;

import com.mic.test.cb.qb.ws.domain.Authenticate;
import com.mic.test.cb.qb.ws.domain.AuthicateResponse;
import org.apache.axis.message.SOAPDocumentImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.Marshaller;
import org.springframework.oxm.Unmarshaller;
import org.springframework.oxm.castor.CastorMarshaller;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Component;
import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.client.core.WebServiceMessageCallback;
import org.springframework.ws.client.core.WebServiceMessageExtractor;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.soap.SoapElement;
import org.springframework.ws.soap.SoapMessage;
import org.springframework.ws.soap.saaj.SaajSoapMessage;
import org.springframework.ws.soap.saaj.SaajSoapMessageFactory;
import org.springframework.ws.support.MarshallingUtils;
import org.springframework.ws.transport.WebServiceMessageSender;

import javax.xml.transform.TransformerException;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.IOException;
import java.io.StringReader;

/**
 * Created by caiwen on 2017/5/25.
 */
@Component
public class WebServiceClient {

    @Autowired
    WebServiceTemplate webServiceTemplate;

    public void setWebServiceTemplate(WebServiceTemplate webServiceTemplate) {
        this.webServiceTemplate = webServiceTemplate;
    }

    String url = "http://localhost:8080/services/qbwcServer?wsdl";

    public void simpleSendAndReceive() {
        webServiceTemplate.setDefaultUri(url);

        Authenticate authicateRequest = new Authenticate();
        authicateRequest.setStrUserName("gzc");
        authicateRequest.setStrPassword("pass");

        AuthicateResponse authicateResponse = (AuthicateResponse) webServiceTemplate.marshalSendAndReceive(authicateRequest);
        System.out.println(authicateResponse.getAuthenticateReturn()[0]);

    }

}
