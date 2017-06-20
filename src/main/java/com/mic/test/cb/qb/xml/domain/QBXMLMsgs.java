package com.mic.test.cb.qb.xml.domain;

import com.mic.test.cb.qb.xml.domain.request.QBXMLMsgsRq;
import com.mic.test.cb.qb.xml.domain.request.custom.CustomerQueryRq;
import com.mic.test.cb.qb.xml.domain.request.salesOrder.SalesOrderQueryRq;
import com.mic.test.cb.qb.xml.domain.request.vendor.VendorAddRq;
import com.mic.test.cb.qb.xml.domain.request.vendor.VendorQueryRq;
import com.mic.test.cb.qb.xml.domain.response.QBXMLMsgsRs;
import com.mic.test.cb.qb.xml.domain.response.customer.CustomerQueryRs;
import com.mic.test.cb.qb.xml.domain.response.vendor.VendorQueryRs;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.NONE)
@XmlSeeAlso({QBXMLMsgsRs.class, QBXMLMsgsRq.class})
public abstract class QBXMLMsgs {

    @XmlAttribute(required = true)
    private OnError onError;

    @XmlAttribute
    private String oldMessageSetID;

    @XmlAttribute
    private String newMessageSetID;

    @XmlAttribute
    private String responseData;

    @XmlAttribute
    private String messageSetStatusCode;

    @XmlElementRefs({
            @XmlElementRef(name = "CustomerQueryRs", type = CustomerQueryRs.class),
            @XmlElementRef(name = "VendorQueryRs", type = VendorQueryRs.class),
            @XmlElementRef(name = "CustomerQueryRq", type = CustomerQueryRq.class),
            @XmlElementRef(name = "VendorQueryRq", type = VendorQueryRq.class),
            @XmlElementRef(name = "SalesOrderQueryRq", type = SalesOrderQueryRq.class),
        @XmlElementRef(name = "VendorAddRq", type = VendorAddRq.class)


    })
    private List<QBXMLBusiMsg> qbxmlBusiMsgList;

    @XmlType
    @XmlEnum
    public enum OnError {
        @XmlEnumValue("stopOnError")StopOnError,
        @XmlEnumValue("continueOnError")ContinueOnError
    }

    public OnError getOnError() {
        return onError;
    }

    public void setOnError(OnError onError) {
        this.onError = onError;
    }

    public String getOldMessageSetID() {
        return oldMessageSetID;
    }

    public void setOldMessageSetID(String oldMessageSetID) {
        this.oldMessageSetID = oldMessageSetID;
    }

    public String getNewMessageSetID() {
        return newMessageSetID;
    }

    public void setNewMessageSetID(String newMessageSetID) {
        this.newMessageSetID = newMessageSetID;
    }

    public String getResponseData() {
        return responseData;
    }

    public void setResponseData(String responseData) {
        this.responseData = responseData;
    }

    public String getMessageSetStatusCode() {
        return messageSetStatusCode;
    }

    public void setMessageSetStatusCode(String messageSetStatusCode) {
        this.messageSetStatusCode = messageSetStatusCode;
    }

    public List<QBXMLBusiMsg> getQbxmlBusiMsgList() {
        return qbxmlBusiMsgList;
    }

    public void setQbxmlBusiMsgList(List<QBXMLBusiMsg> qbxmlBusiMsgList) {
        this.qbxmlBusiMsgList = qbxmlBusiMsgList;
    }
}
