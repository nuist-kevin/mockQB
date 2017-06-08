package com.mic.test.cb.qb.xml.domain.response.itemInventory;

import com.mic.test.cb.qb.xml.domain.common.QBRef;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.math.BigDecimal;

/**
 * Created by caiwen on 2017/6/8.
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class InventoryAdjustmentLineRet {

  @XmlElement(name = "TxnLineID")
  private Integer txnLineId;

  @XmlElement(name = "ItemRef")
  private QBRef itemRef;

  @XmlElement(name = "InventorySiteLocationRef")
  private QBRef inventorySiteLocationRef;

  @XmlElement(name = "QuantityDifference")
  private BigDecimal quantityDifference;

  @XmlElement(name = "ValueDifference")
  private BigDecimal valueDifference;

  public Integer getTxnLineId() {
    return txnLineId;
  }

  public void setTxnLineId(Integer txnLineId) {
    this.txnLineId = txnLineId;
  }

  public QBRef getItemRef() {
    return itemRef;
  }

  public void setItemRef(QBRef itemRef) {
    this.itemRef = itemRef;
  }

  public QBRef getInventorySiteLocationRef() {
    return inventorySiteLocationRef;
  }

  public void setInventorySiteLocationRef(QBRef inventorySiteLocationRef) {
    this.inventorySiteLocationRef = inventorySiteLocationRef;
  }

  public BigDecimal getQuantityDifference() {
    return quantityDifference;
  }

  public void setQuantityDifference(BigDecimal quantityDifference) {
    this.quantityDifference = quantityDifference;
  }

  public BigDecimal getValueDifference() {
    return valueDifference;
  }

  public void setValueDifference(BigDecimal valueDifference) {
    this.valueDifference = valueDifference;
  }
}
