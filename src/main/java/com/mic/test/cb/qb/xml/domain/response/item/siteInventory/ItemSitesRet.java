package com.mic.test.cb.qb.xml.domain.response.item.siteInventory;

import com.mic.test.cb.qb.xml.domain.common.QBRef;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ItemSitesRet {

  @XmlElement(name = "ListID")
  private String listId;

  @XmlElement(name = "ItemInventoryRef")
  private QBRef itemInventoryRef;

  @XmlElement(name = "InventorySiteRef")
  private QBRef inventorySiteRef;

  @XmlElement(name = "QuantityOnHand")
  private BigDecimal quantityOnHand;

  @XmlElement(name = "QuantityOnSalesOrders")
  private BigDecimal quantityOnSalesOrders;

  public String getListId() {
    return listId;
  }

  public void setListId(String listId) {
    this.listId = listId;
  }

  public QBRef getItemInventoryRef() {
    return itemInventoryRef;
  }

  public void setItemInventoryRef(QBRef itemInventoryRef) {
    this.itemInventoryRef = itemInventoryRef;
  }

  public QBRef getInventorySiteRef() {
    return inventorySiteRef;
  }

  public void setInventorySiteRef(QBRef inventorySiteRef) {
    this.inventorySiteRef = inventorySiteRef;
  }

  public BigDecimal getQuantityOnHand() {
    return quantityOnHand;
  }

  public void setQuantityOnHand(BigDecimal quantityOnHand) {
    this.quantityOnHand = quantityOnHand;
  }

  public BigDecimal getQuantityOnSalesOrders() {
    return quantityOnSalesOrders;
  }

  public void setQuantityOnSalesOrders(BigDecimal quantityOnSalesOrders) {
    this.quantityOnSalesOrders = quantityOnSalesOrders;
  }
}
