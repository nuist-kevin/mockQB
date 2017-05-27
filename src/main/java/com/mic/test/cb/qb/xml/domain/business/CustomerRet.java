package com.mic.test.cb.qb.xml.domain.business;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Created by caiwen on 2017/5/27.
 */
@XmlType
@XmlAccessorType(XmlAccessType.FIELD)
public class CustomerRet {

    @XmlElement
    private String listId;
    @XmlElement
    private String fullName;

    public String getListId() {
        return listId;
    }

    public void setListId(String listId) {
        this.listId = listId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
