package com.mic.test.cb.qb.xml.domain.response.customer;

import com.mic.test.cb.qb.xml.domain.QBXML;
import com.mic.test.cb.qb.xml.domain.QBXMLMsgs;
import com.mic.test.cb.qb.xml.domain.QueryMsg;
import com.mic.test.cb.qb.xml.domain.request.custom.CustomerQueryRq;
import com.mic.test.cb.qb.xml.domain.response.QBXMLMsgsRs;

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
       /* QBXML qbxml = new QBXML();

        QBXMLMsgs qbxmlMsgs = new QBXMLMsgsRs();

        qbxmlMsgs.setOnError(QBXMLMsgs.OnError.StopOnError);

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
        qbxmlMsgs.setQbXMLBusiMsg(customerQueryRs);
        qbxml.setQbxmlMsg(qbxmlMsgs);

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

            QBXML qbxml1 = (QBXML) unmarshaller.unmarshal(new StringReader("<?xml version=\"1.0\" encoding=\"utf-8\"?><?qbxml version=\"7.0\"?>\n" +
                    "<QBXML>\n" +
                    "<QBXMLMsgsRq onError=\"stopOnError\">\n" +
                    "<CustomerQueryRq requestID=\"705a2b64-783a-4454-bc3b-9c98e8e89945\">\n" +
                    "  <FromModifiedDate>2017-05-22T16:07:30+08:00</FromModifiedDate>\n" +
                    "</CustomerQueryRq>\n" +
                    "\n" +
                    "</QBXMLMsgsRq>\n" +
                    "</QBXML>"));

            System.out.println(((CustomerQueryRq)(qbxml1.getQbxmlMsg().getQbXMLBusiMsg())).getFromModifiedDate());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/
    }
}
