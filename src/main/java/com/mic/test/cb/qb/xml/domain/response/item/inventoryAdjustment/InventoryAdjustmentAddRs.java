package com.mic.test.cb.qb.xml.domain.response.item.inventoryAdjustment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "InventoryAdjustmentAddRs")
@XmlAccessorType(XmlAccessType.FIELD)
public class InventoryAdjustmentAddRs {

  @XmlElement(name = "InventoryAdjustmentRet")
  private InventoryAdjustmentRet inventoryAdjustmentRet;

  public InventoryAdjustmentRet getInventoryAdjustmentRet() {
    return inventoryAdjustmentRet;
  }

  public void setInventoryAdjustmentRet(InventoryAdjustmentRet inventoryAdjustmentRet) {
    this.inventoryAdjustmentRet = inventoryAdjustmentRet;
  }
}
