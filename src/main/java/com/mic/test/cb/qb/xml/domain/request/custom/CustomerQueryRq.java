package com.mic.test.cb.qb.xml.domain.request.custom;

import com.mic.test.cb.qb.xml.domain.QueryMsg;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@XmlRootElement(name = "CustomerQueryRq")
@XmlAccessorType(XmlAccessType.FIELD)
public class CustomerQueryRq extends QueryMsg {

    @XmlElement(name = "FromModifiedDate")
    private Date fromModifiedDate;

    @XmlElement(name = "ToModifiedDate")
    private Date toModifiedDate;

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
