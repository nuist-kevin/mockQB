package com.mic.test.cb.qb.xml.domain;

import com.mic.test.cb.qb.xml.domain.response.QBXMLMsgRs;

import javax.xml.bind.annotation.*;

/**
 * Created by caiwen on 2017/5/26.
 */
@XmlRootElement(name = "QBXML")
@XmlType
@XmlAccessorType(XmlAccessType.PROPERTY)
public class RsQBXML<QBXMLMsgRs> extends AbstractQBXML<T>{

    @XmlElement(name = "QBXMLMsgsRs")
    @Override
    public QBXMLMsgRs getQbxmlMsg() {
        return super.qbxmlMsg;
    }


    @Override
    public void setQbxmlMsg(QBXMLMsgRs qbxmlMsg) {
        super.qbxmlMsg = qbxmlMsg;
    }


}
