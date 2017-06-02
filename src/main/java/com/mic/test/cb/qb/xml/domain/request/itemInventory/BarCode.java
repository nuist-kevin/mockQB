package com.mic.test.cb.qb.xml.domain.request.itemInventory;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by caiwen on 2017/6/2.
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class BarCode {

    @XmlElement(name = "BarCodeValue")
    private String barCodeValue;

    @XmlElement(name = "AssignEvenIfUsed")
    private boolean assignEvenIfUsed;

    @XmlElement(name = "AllowOverride")
    private boolean allowOverride;

    public String getBarCodeValue() {
        return barCodeValue;
    }

    public void setBarCodeValue(String barCodeValue) {
        this.barCodeValue = barCodeValue;
    }

    public boolean isAssignEvenIfUsed() {
        return assignEvenIfUsed;
    }

    public void setAssignEvenIfUsed(boolean assignEvenIfUsed) {
        this.assignEvenIfUsed = assignEvenIfUsed;
    }

    public boolean isAllowOverride() {
        return allowOverride;
    }

    public void setAllowOverride(boolean allowOverride) {
        this.allowOverride = allowOverride;
    }
}
