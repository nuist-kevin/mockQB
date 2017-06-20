package com.mic.test.cb.qb.xml.domain.request.item.inventoryAdjustment;

import com.mic.test.cb.qb.xml.domain.common.QBRef;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by caiwen on 2017/6/8.
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class InventoryAdjustmentLineAdd {

  @XmlElement(name = "ItemRef")
  private QBRef itemRef;

  @XmlElement(name = "QuantityAdjustment")
  private QuantityAdjustment quantityAdjustment;

  public QBRef getItemRef() {
    return itemRef;
  }

  public void setItemRef(QBRef itemRef) {
    this.itemRef = itemRef;
  }

  public QuantityAdjustment getQuantityAdjustment() {
    return quantityAdjustment;
  }

  public void setQuantityAdjustment(QuantityAdjustment quantityAdjustment) {
    this.quantityAdjustment = quantityAdjustment;
  }
}
