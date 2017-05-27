package com.mic.test.cb.qb.xml.domain.response;

import com.mic.test.cb.qb.ws.domain.AuthicateResponse;
import com.mic.test.cb.qb.xml.domain.AbstractQBXML;
import com.mic.test.cb.qb.xml.domain.QBXMLBusiMsg;
import com.mic.test.cb.qb.xml.domain.QBXMLMsg;
import com.mic.test.cb.qb.xml.domain.RsQBXML;
import com.mic.test.cb.qb.xml.domain.business.CustomerRet;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.*;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by caiwen on 2017/5/27.
 */
@XmlType
@XmlAccessorType(XmlAccessType.FIELD)
public class CustomerQueryRs extends QBXMLBusiMsg {

    @XmlElementWrapper
    private List<CustomerRet> customerRetList;

    @XmlAttribute
    private String requestId;

    @XmlAttribute
    private String statusCode;

    @XmlAttribute
    private String statusSeverity;

    @XmlAttribute
    private String statusMessage;

    public List<CustomerRet> getCustomerRetList() {
        return customerRetList;
    }

    public void setCustomerRetList(List<CustomerRet> customerRetList) {
        this.customerRetList = customerRetList;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getStatusSeverity() {
        return statusSeverity;
    }

    public void setStatusSeverity(String statusSeverity) {
        this.statusSeverity = statusSeverity;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    public static void main(String[] args) {
        RsQBXML<QBXMLMsgRs> qbxml = new RsQBXML();

        QBXMLMsg<CustomerQueryRs> qbxmlMsg = new QBXMLMsgRs();
        qbxml.setQbxmlMsg(qbxmlMsg);

        CustomerQueryRs customerQueryRs = new CustomerQueryRs();
        customerQueryRs.setRequestId("1");
        customerQueryRs.setStatusCode("2");
        customerQueryRs.setStatusMessage("3");
        customerQueryRs.setStatusSeverity("4");
        CustomerRet customerRet = new CustomerRet();
        customerRet.setListId("111");
        customerRet.setFullName("caiwen");
        CustomerRet customerRet2 = new CustomerRet();
        customerRet2.setListId("222");
        customerRet2.setFullName("caiwen2");
        List<CustomerRet> customerRetList = new ArrayList<>();
        customerRetList.add(customerRet);
        customerRetList.add(customerRet2);
        customerQueryRs.setCustomerRetList(customerRetList);
        qbxmlMsg.setQbBusiMsg(customerQueryRs);
        String resultXml = null;
        try {
            JAXBContext context = JAXBContext.newInstance(qbxml.getClass());
            Marshaller marshaller = context.createMarshaller();
            //决定是否在转换成xml时同时进行格式化（即按标签自动换行，否则即是一行的xml）
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            //Marshaller.JAXB_ENCODING xml的编码方式
            marshaller.setProperty(Marshaller.JAXB_ENCODING, "utf-8");
            StringWriter writer = new StringWriter();
            marshaller.marshal(qbxml, writer);
            resultXml = writer.toString();
            System.out.println(resultXml);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
