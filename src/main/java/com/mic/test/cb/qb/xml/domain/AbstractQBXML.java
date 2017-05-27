package com.mic.test.cb.qb.xml.domain;

import javax.xml.bind.annotation.*;

/**
 * Created by caiwen on 2017/5/27.
 */

@XmlSeeAlso({RsQBXML.class})
@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement
public abstract class AbstractQBXML<T extends QBXMLMsg> {

    @XmlElement
    protected T qbxmlMsg;

    public abstract T getQbxmlMsg();

    public abstract void setQbxmlMsg(T qbxmlMsg);
}
