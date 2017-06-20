package com.mic.test.cb.qb.xml.domain.response.salesOrder;

import com.mic.test.cb.qb.xml.domain.common.QBRef;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.math.BigDecimal;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class SalesOrderLineRet {

    @XmlElement(name = "TxnLineID")
    private String txnLineId;

    @XmlElement(name = "ItemRef")
    private QBRef itemRef;

  @XmlElement(name = "Desc")
  private String desc;

    @XmlElement(name = "Quantity")
    private BigDecimal quantity;

    @XmlElement(name = "Rate")
    private BigDecimal rate;

    @XmlElement(name = "UnitOfMeasure")
    private String unitOfMeasure;

  @XmlElement(name = "InventorySiteRef")
  private QBRef inventorySiteRef;

    public String getTxnLineId() {
        return txnLineId;
    }

    public void setTxnLineId(String txnLineId) {
        this.txnLineId = txnLineId;
    }

    public QBRef getItemRef() {
        return itemRef;
    }

    public void setItemRef(QBRef itemRef) {
        this.itemRef = itemRef;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    public void setUnitOfMeasure(String unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

  public QBRef getInventorySiteRef() {
    return inventorySiteRef;
  }

  public void setInventorySiteRef(QBRef inventorySiteRef) {
    this.inventorySiteRef = inventorySiteRef;
  }
}
