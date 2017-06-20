package com.mic.test.cb.qb.xml.domain.request.item;

import com.mic.test.cb.qb.xml.domain.common.QBRef;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by caiwen on 2017/6/2.
 */
@XmlRootElement(name = "ItemInventoryMod")
@XmlAccessorType(XmlAccessType.FIELD)
public class ItemInventoryMod {

    @XmlElement(name = "ListID", required = true)
    private String id;

    @XmlElement(name = "EditSequence", required = true)
    private String editSequence;

    @XmlElement(name = "Name")
    private String name;

    @XmlElement(name = "IsActive")
    private Boolean isActive;

    @XmlElement(name = "BarCode")
    private BarCode barCode;

    @XmlElement(name = "ManufacturerPartNumber")
    private String manufacturerPartNumber;

    @XmlElement(name = "ParentRef")
    private QBRef parentRef;

    @XmlElement(name = "PrefVendorRef")
    private QBRef prefVendorRef;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public BarCode getBarCode() {
        return barCode;
    }

    public void setBarCode(BarCode barCode) {
        this.barCode = barCode;
    }

    public String getManufacturerPartNumber() {
        return manufacturerPartNumber;
    }

    public void setManufacturerPartNumber(String manufacturerPartNumber) {
        this.manufacturerPartNumber = manufacturerPartNumber;
    }

    public QBRef getParentRef() {
        return parentRef;
    }

    public void setParentRef(QBRef parentRef) {
        this.parentRef = parentRef;
    }

    public QBRef getPrefVendorRef() {
        return prefVendorRef;
    }

    public void setPrefVendorRef(QBRef prefVendorRef) {
        this.prefVendorRef = prefVendorRef;
    }
}
