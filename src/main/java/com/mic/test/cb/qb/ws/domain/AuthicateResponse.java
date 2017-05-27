package com.mic.test.cb.qb.ws.domain;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.*;
import java.io.StringWriter;

/**
 * Created by caiwen on 2017/5/26.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "authenticateResponse")
@XmlType
public class AuthicateResponse {

    @XmlElementWrapper(name = "authenticateReturn")
    String[] authenticateReturn;

    public String[] getAuthenticateReturn() {
        return authenticateReturn;
    }

    public void setAuthenticateReturn(String[] authenticateReturn) {
        this.authenticateReturn = authenticateReturn;
    }

    public static void main(String[] args) {
        AuthicateResponse authicateResponse = new AuthicateResponse();
        String[] result = new String[]{"nvu",""};
        authicateResponse.setAuthenticateReturn(result);
        String resultXml = null;
        try {
            JAXBContext context = JAXBContext.newInstance(authicateResponse.getClass());
            Marshaller marshaller = context.createMarshaller();
            //决定是否在转换成xml时同时进行格式化（即按标签自动换行，否则即是一行的xml）
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            //Marshaller.JAXB_ENCODING xml的编码方式
            marshaller.setProperty(Marshaller.JAXB_ENCODING, "utf-8");
            StringWriter writer = new StringWriter();
            marshaller.marshal(authicateResponse, writer);
            resultXml = writer.toString();
            System.out.println(resultXml);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
