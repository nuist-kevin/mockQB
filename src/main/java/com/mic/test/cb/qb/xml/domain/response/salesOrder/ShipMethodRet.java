package com.mic.test.cb.qb.xml.domain.response.salesOrder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

/**
 * Created by caiwen on 2017/6/2.
 */
@XmlRootElement(name = "ShipMethodRet")
@XmlAccessorType(XmlAccessType.FIELD)
public class ShipMethodRet {

    @XmlElement(name = "ListID")
    private String id;

    @XmlElement(name = "TimeCreated")
    private Date timeCreated;

    @XmlElement(name = "TimeModified")
    private Date timeModified;

    @XmlElement(name = "EditSequence")
    private String editSequence;

    @XmlElement(name = "Name")
    private String name;

    @XmlElement(name = "IsActive")
    private Boolean isActive;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getTimeCreated() {
        return timeCreated;
    }

    public void setTimeCreated(Date timeCreated) {
        this.timeCreated = timeCreated;
    }

    public Date getTimeModified() {
        return timeModified;
    }

    public void setTimeModified(Date timeModified) {
        this.timeModified = timeModified;
    }

    public String getEditSequence() {
        return editSequence;
    }

    public void setEditSequence(String editSequence) {
        this.editSequence = editSequence;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }
}
