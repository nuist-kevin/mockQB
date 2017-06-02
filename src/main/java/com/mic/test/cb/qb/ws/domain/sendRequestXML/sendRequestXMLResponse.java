package com.mic.test.cb.qb.ws.domain.sendRequestXML;

import com.mic.test.cb.qb.xml.domain.QBXML;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by caiwen on 2017/5/26.
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class SendRequestXMLResponse {

    @XmlElement(name = "sendRequestXMLReturn")
    private String sendRequestXMLReturn;

    public String getSendRequestXMLReturn() {
        return sendRequestXMLReturn;
    }

    public void setSendRequestXMLReturn(String sendRequestXMLReturn) {
        this.sendRequestXMLReturn = sendRequestXMLReturn;
    }


}
