package com.mic.test.cb.qb.xml.domain;

import com.mic.test.cb.qb.xml.domain.request.QBXMLMsgRq;
import com.mic.test.cb.qb.xml.domain.response.QBXMLMsgRs;

import javax.xml.bind.annotation.*;

/**
 * Created by caiwen on 2017/5/26.
 */
@XmlRootElement(name = "QBXML")
@XmlType
@XmlAccessorType(XmlAccessType.PROPERTY)
public class RsQBXML extends AbstractQBXML<QBXMLMsgRs>{

    @XmlElement(name = "QBXMLMsgRs")
    @Override
    public QBXMLMsgRs getQbXMLMsg() {
        return qbXMLMsg;
    }

    @Override
    public void setQbXMLMsg(QBXMLMsgRs qbXMLMsg) {

    }
}
