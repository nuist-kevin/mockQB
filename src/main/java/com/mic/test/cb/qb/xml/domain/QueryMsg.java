package com.mic.test.cb.qb.xml.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

/**
 * Created by caiwen on 2017/5/31.
 */
@XmlAccessorType(XmlAccessType.NONE)
public abstract class QueryMsg extends QBXMLBusiMsg {

    @XmlAttribute
    private String requestID;

    @XmlAttribute(required = true)
    private Integer statusCode;

    @XmlAttribute(required = true)
    private String statusSeverity;

    @XmlAttribute(required = true)
    private String statusMessage;

    @XmlAttribute
    private String iterator;

    @XmlAttribute
    private String iteratorID;

    @XmlAttribute
    private String iteratorRemainingCount;

    @XmlAttribute
    private String metaData;

    @XmlAttribute
    private String retCount;


    public String getRequestID() {
        return requestID;
    }

    public void setRequestID(String requestID) {
        this.requestID = requestID;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
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

    public String getIterator() {
        return iterator;
    }

    public void setIterator(String iterator) {
        this.iterator = iterator;
    }

    public String getIteratorID() {
        return iteratorID;
    }

    public void setIteratorID(String iteratorID) {
        this.iteratorID = iteratorID;
    }

    public String getIteratorRemainingCount() {
        return iteratorRemainingCount;
    }

    public void setIteratorRemainingCount(String iteratorRemainingCount) {
        this.iteratorRemainingCount = iteratorRemainingCount;
    }

    public String getMetaData() {
        return metaData;
    }

    public void setMetaData(String metaData) {
        this.metaData = metaData;
    }

    public String getRetCount() {
        return retCount;
    }

    public void setRetCount(String retCount) {
        this.retCount = retCount;
    }

}
