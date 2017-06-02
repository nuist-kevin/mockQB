package com.mic.test.cb.qb.xml.domain.request.salesOrder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by caiwen on 2017/6/2.
 */
@XmlRootElement(name = "ShipMethodAdd")
@XmlAccessorType(XmlAccessType.FIELD)
public class ShipMethodAdd {

    @XmlElement(name = "Name")
    private String name;

    @XmlElement(name = "IsActive")
    private boolean isActive;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
