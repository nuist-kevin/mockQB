package com.mic.test.cb.qb.xml.domain.request.itemInventory;

import com.mic.test.cb.qb.xml.domain.common.QBRef;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.math.BigDecimal;

/**
 * Created by caiwen on 2017/6/2.
 */
@XmlRootElement(name = "ItemInventoryAdd")
@XmlAccessorType(XmlAccessType.FIELD)
public class ItemInventoryAdd {

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

    @XmlElement(name = "QuantityOnHand")
    private BigDecimal quantityOnHand;

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

    public BigDecimal getQuantityOnHand() {
        return quantityOnHand;
    }

    public void setQuantityOnHand(BigDecimal quantityOnHand) {
        this.quantityOnHand = quantityOnHand;
    }
}
