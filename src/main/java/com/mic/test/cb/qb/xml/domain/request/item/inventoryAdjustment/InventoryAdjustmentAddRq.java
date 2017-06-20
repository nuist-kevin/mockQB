package com.mic.test.cb.qb.xml.domain.request.item.inventoryAdjustment;

import com.mic.test.cb.qb.xml.domain.ObjectMsg;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "InventoryAdjustmentAddRq")
@XmlAccessorType(XmlAccessType.FIELD)
public class InventoryAdjustmentAddRq extends ObjectMsg {

  @XmlElement(name = "InventoryAdjustmentAdd")
  private InventoryAdjustmentAdd inventoryAdjustmentAdd;

  public InventoryAdjustmentAdd getInventoryAdjustmentAdd() {
    return inventoryAdjustmentAdd;
  }

  public void setInventoryAdjustmentAdd(InventoryAdjustmentAdd inventoryAdjustmentAdd) {
    this.inventoryAdjustmentAdd = inventoryAdjustmentAdd;
  }
}
