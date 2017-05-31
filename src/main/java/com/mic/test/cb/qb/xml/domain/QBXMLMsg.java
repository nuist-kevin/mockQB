package com.mic.test.cb.qb.xml.domain;

import com.mic.test.cb.qb.xml.domain.request.QBXMLMsgRq;
import com.mic.test.cb.qb.xml.domain.response.QBXMLMsgRs;
import com.mic.test.cb.qb.xml.domain.response.customer.CustomerQueryRs;
import com.mic.test.cb.qb.xml.domain.response.vendor.VendorQueryRs;

import javax.xml.bind.annotation.*;

/**
 * Created by caiwen on 2017/5/26.
 */

@XmlAccessorType(XmlAccessType.NONE)
@XmlSeeAlso({QBXMLMsgRq.class, QBXMLMsgRs.class})
public abstract class QBXMLMsg{

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

    })
    private QBXMLBusiMsg qbXMLBusiMsg;

    public QBXMLBusiMsg getQbXMLBusiMsg() {
        return qbXMLBusiMsg;
    }

    public void setQbXMLBusiMsg(QBXMLBusiMsg qbXMLBusiMsg) {
        this.qbXMLBusiMsg = qbXMLBusiMsg;
    }

    @XmlType
    @XmlEnum
    public enum OnError {

        @XmlEnumValue("stopOnError")        StopOnError,
        @XmlEnumValue("continueOnError")    ContinueOnError

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
}
