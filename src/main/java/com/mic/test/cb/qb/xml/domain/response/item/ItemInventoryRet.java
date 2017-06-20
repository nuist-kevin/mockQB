package com.mic.test.cb.qb.xml.domain.response.item;

import com.mic.test.cb.qb.xml.domain.common.QBRef;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.math.BigDecimal;
import java.util.Date;

@XmlRootElement(name = "ItemInventoryRet")
@XmlAccessorType(XmlAccessType.FIELD)
public class ItemInventoryRet {

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

    @XmlElement(name = "FullName")
    private String fullName;

    //货品条码
    @XmlElement(name = "BarCodeValue")
    private String barCodeValue;

    //货品代码
    @XmlElement(name = "ManufacturerPartNumber")
    private String manufacturerPartNumber;

    // 可用库存
    @XmlElement(name = "QuantityOnHand")
    private BigDecimal quantityOnHand;

    // 入库在途数量
    @XmlElement(name = "quantityOnOrder")
    private BigDecimal QuantityOnOrder;

    // 锁定数量
    @XmlElement(name = "QuantityOnSalesOrder")
    private BigDecimal quantityOnSalesOrder;

    @XmlElement(name = "IsActive")
    private Boolean isActive;

    @XmlElement(name = "AverageCost")
    private BigDecimal averageCost;

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

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBarCodeValue() {
        return barCodeValue;
    }

    public void setBarCodeValue(String barCodeValue) {
        this.barCodeValue = barCodeValue;
    }

    public String getManufacturerPartNumber() {
        return manufacturerPartNumber;
    }

    public void setManufacturerPartNumber(String manufacturerPartNumber) {
        this.manufacturerPartNumber = manufacturerPartNumber;
    }

    public BigDecimal getQuantityOnHand() {
        return quantityOnHand;
    }

    public void setQuantityOnHand(BigDecimal quantityOnHand) {
        this.quantityOnHand = quantityOnHand;
    }

    public BigDecimal getQuantityOnOrder() {
        return QuantityOnOrder;
    }

    public void setQuantityOnOrder(BigDecimal quantityOnOrder) {
        QuantityOnOrder = quantityOnOrder;
    }

    public BigDecimal getQuantityOnSalesOrder() {
        return quantityOnSalesOrder;
    }

    public void setQuantityOnSalesOrder(BigDecimal quantityOnSalesOrder) {
        this.quantityOnSalesOrder = quantityOnSalesOrder;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public BigDecimal getAverageCost() {
        return averageCost;
    }

    public void setAverageCost(BigDecimal averageCost) {
        this.averageCost = averageCost;
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
