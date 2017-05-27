package com.mic.test.cb.qb.xml.domain;

import com.mic.test.cb.qb.xml.domain.request.QBXMLMsgRq;
import com.mic.test.cb.qb.xml.domain.response.QBXMLMsgRs;

import javax.xml.bind.annotation.*;

/**
 * Created by caiwen on 2017/5/26.
 */

@XmlSeeAlso({QBXMLMsgRq.class, QBXMLMsgRs.class})
@XmlAccessorType(XmlAccessType.NONE)
public abstract class QBXMLMsg<T extends QBXMLBusiMsg> {

    @XmlElement
    private T qbBusiMsg;

    public T getQbBusiMsg() {
        return qbBusiMsg;
    }

    public void setQbBusiMsg(T qbBusiMsg) {
        this.qbBusiMsg = qbBusiMsg;
    }
}
