package com.mic.test.cb.qb.xml.domain.response.customer;

import javax.xml.bind.annotation.*;

/**
 * Created by caiwen on 2017/5/27.
 */
@XmlRootElement(name = "CustomerRet")
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
