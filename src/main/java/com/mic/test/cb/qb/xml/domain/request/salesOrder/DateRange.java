package com.mic.test.cb.qb.xml.domain.request.salesOrder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

/**
 * Created by caiwen on 2017/6/2.
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class DateRange {

    @XmlElement(name = "FromModifiedDate")
    private Date fromModifiedDate;

    @XmlElement(name = "ToModifiedDate")
    private Date toModifiedDate;

    public Date getFromModifiedDate() {
        return fromModifiedDate;
    }

    public void setFromModifiedDate(Date fromModifiedDate) {
        this.fromModifiedDate = fromModifiedDate;
    }

    public Date getToModifiedDate() {
        return toModifiedDate;
    }

    public void setToModifiedDate(Date toModifiedDate) {
        this.toModifiedDate = toModifiedDate;
    }

}
