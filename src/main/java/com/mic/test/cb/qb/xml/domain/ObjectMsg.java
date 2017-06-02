package com.mic.test.cb.qb.xml.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

/**
 * Created by caiwen on 2017/5/31.
 */

@XmlAccessorType(XmlAccessType.NONE)
public abstract class ObjectMsg extends QBXMLBusiMsg {

    @XmlAttribute
    private String requestID;

    @XmlAttribute(required = true)
    private String statusCode;

    @XmlAttribute(required = true)
    private String statusSeverity;

    @XmlAttribute(required = true)
    private String statusMessage;


    public String getRequestID() {
        return requestID;
    }

    public void setRequestID(String requestID) {
        this.requestID = requestID;
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
}
