package com.mic.test.cb.qb.xml.domain.request.vendor;

import com.mic.test.cb.qb.xml.domain.QueryMsg;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;
import java.util.List;

/**
 * Created by caiwen on 2017/6/1.
 */
@XmlRootElement(name = "VendorQueryRq")
@XmlAccessorType(XmlAccessType.FIELD)
public class VendorQueryRq extends QueryMsg {

    @XmlElement(name = "ListID")
    List<String> idList;

    @XmlElement(name = "FullName")
    List<String> fullNameList;

    @XmlElement(name = "FromModifiedDate")
    private Date fromModifiedDate;

    @XmlElement(name = "ToModifiedDate")
    private Date toModifiedDate;

    public List<String> getIdList() {
        return idList;
    }

    public void setIdList(List<String> idList) {
        this.idList = idList;
    }

    public List<String> getFullNameList() {
        return fullNameList;
    }

    public void setFullNameList(List<String> fullNameList) {
        this.fullNameList = fullNameList;
    }

    public Date getToModifiedDate() {
        return toModifiedDate;
    }

    public void setToModifiedDate(Date toModifiedDate) {
        this.toModifiedDate = toModifiedDate;
    }

    public Date getFromModifiedDate() {
        return fromModifiedDate;
    }

    public void setFromModifiedDate(Date fromModifiedDate) {
        this.fromModifiedDate = fromModifiedDate;
    }
}
