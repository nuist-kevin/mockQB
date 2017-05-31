package com.mic.test.cb.qb.xml.domain.response.customer;

import com.mic.test.cb.qb.xml.domain.QBXML;
import com.mic.test.cb.qb.xml.domain.QBXMLMsg;
import com.mic.test.cb.qb.xml.domain.QueryMsg;
import com.mic.test.cb.qb.xml.domain.response.QBXMLMsgRs;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.*;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by caiwen on 2017/5/27.
 */
@XmlRootElement(name = "CustomerQueryRs")
@XmlAccessorType(XmlAccessType.FIELD)
public class CustomerQueryRs extends QueryMsg {

    @XmlElement(name = "CustomerRet")
    private List<CustomerRet> customerRetList;

    public List<CustomerRet> getCustomerRetList() {
        return customerRetList;
    }

    public void setCustomerRetList(List<CustomerRet> customerRetList) {
        this.customerRetList = customerRetList;
    }


    public static void main(String[] args) {
        QBXML qbxml = new QBXML();

        QBXMLMsg qbxmlMsg = new QBXMLMsgRs();

        qbxmlMsg.setOnError(QBXMLMsg.OnError.StopOnError);

        CustomerQueryRs customerQueryRs = new CustomerQueryRs();
        customerQueryRs.setRequestID("2938-2349023094");
        customerQueryRs.setStatusCode(2);
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
        qbxmlMsg.setQbXMLBusiMsg(customerQueryRs);
        qbxml.setQbxmlMsg(qbxmlMsg);

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

            Unmarshaller unmarshaller = context.createUnmarshaller();
            QBXML qbxml1 = (QBXML) unmarshaller.unmarshal(new StringReader("<?xml version=\"1.0\" encoding=\"utf-8\" standalone=\"yes\"?>\n" +
                    "<QBXML>\n" +
                    "    <QBXMLMsgRs onError=\"stopOnError\">\n" +
                    "        <CustomerQueryRs statusCode=\"2\" statusSeverity=\"4\" statusMessage=\"3\">\n" +
                    "            <CustomerRet>\n" +
                    "                <listId>111</listId>\n" +
                    "                <fullName>caiwen</fullName>\n" +
                    "            </CustomerRet>\n" +
                    "            <CustomerRet>\n" +
                    "                <listId>222</listId>\n" +
                    "                <fullName>caiwen2</fullName>\n" +
                    "            </CustomerRet>\n" +
                    "        </CustomerQueryRs>\n" +
                    "    </QBXMLMsgRs>\n" +
                    "</QBXML>"));

            System.out.println(qbxml1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
