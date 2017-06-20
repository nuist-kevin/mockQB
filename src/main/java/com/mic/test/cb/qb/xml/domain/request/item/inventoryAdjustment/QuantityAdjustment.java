package com.mic.test.cb.qb.xml.domain.request.item.inventoryAdjustment;

import com.mic.test.cb.qb.xml.domain.common.QBRef;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.math.BigDecimal;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class QuantityAdjustment {

  @XmlElement(name = "NewQuantity")
  private BigDecimal newQuantity;

  @XmlElement(name = "InventorySiteLocationRef")
  private QBRef inventorySiteLocationRef;

  public BigDecimal getNewQuantity() {
    return newQuantity;
  }

  public void setNewQuantity(BigDecimal newQuantity) {
    this.newQuantity = newQuantity;
  }

  public QBRef getInventorySiteLocationRef() {
    return inventorySiteLocationRef;
  }

  public void setInventorySiteLocationRef(QBRef inventorySiteLocationRef) {
    this.inventorySiteLocationRef = inventorySiteLocationRef;
  }
}
