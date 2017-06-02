package com.mic.test.cb.qb.ws.domain.sendRequestXML;

import com.mic.test.cb.qb.xml.domain.QBXML;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by caiwen on 2017/6/1.
 */
@XmlRootElement(name = "SendRequestXMLReturn")
@XmlAccessorType(XmlAccessType.FIELD)
public class SendRequestXMLReturn {

    @XmlElement(name = "QBXML")
    private QBXML qbxml;

    public QBXML getQbxml() {
        return qbxml;
    }

    public void setQbxml(QBXML qbxml) {
        this.qbxml = qbxml;
    }
}
