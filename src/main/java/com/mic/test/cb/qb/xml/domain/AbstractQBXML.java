package com.mic.test.cb.qb.xml.domain;

import com.mic.test.cb.qb.xml.domain.response.QBXMLMsgRs;

import javax.xml.bind.annotation.*;

/**
 * Created by caiwen on 2017/5/27.
 */

@XmlSeeAlso({RsQBXML.class})
@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement
public abstract class AbstractQBXML<T extends QBXMLMsg> {

    @XmlElement
    protected T qbXMLMsg;

    public abstract T getQbXMLMsg();

    public abstract void setQbXMLMsg(T qbXMLMsg);
}
