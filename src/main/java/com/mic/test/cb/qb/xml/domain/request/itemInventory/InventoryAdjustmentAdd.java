package com.mic.test.cb.qb.xml.domain.request.itemInventory;

import com.mic.test.cb.qb.xml.domain.common.QBRef;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by caiwen on 2017/6/8.
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class InventoryAdjustmentAdd {

  @XmlElement(name = "AccountRef")
  private QBRef accountRef;

  @XmlElement(name = "InventoryAdjustmentLineAdd")
  private List<InventoryAdjustmentLineAdd> inventoryAdjustmentLineAddList;

  public QBRef getAccountRef() {
    return accountRef;
  }

  public void setAccountRef(QBRef accountRef) {
    this.accountRef = accountRef;
  }

  public List<InventoryAdjustmentLineAdd> getInventoryAdjustmentLineAddList() {
    return inventoryAdjustmentLineAddList;
  }

  public void setInventoryAdjustmentLineAddList(
      List<InventoryAdjustmentLineAdd> inventoryAdjustmentLineAddList) {
    this.inventoryAdjustmentLineAddList = inventoryAdjustmentLineAddList;
  }
}
