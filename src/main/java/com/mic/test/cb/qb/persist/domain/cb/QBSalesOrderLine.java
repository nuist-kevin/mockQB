package com.mic.test.cb.qb.persist.domain.cb;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "WMS_QB_SALES_ORDER_LINE")
public class QBSalesOrderLine extends BaseDomain {

  private Integer id;

  private QBSalesOrder qbSalesOrder;

  private String txnLineId;

  private Integer doSkuId;

  private String itemListId;

  private String itemFullName;

  private BigDecimal quantity;

  private BigDecimal rate;

  private BigDecimal amount;

  @Id
  @Column(name = "WMS_QB_SALES_ORDER_LINE_ID")
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "s_WMS_QB_SALES_ORDER_LINE")
  @SequenceGenerator(name = "s_WMS_QB_SALES_ORDER_LINE", sequenceName = "s_WMS_QB_SALES_ORDER_LINE")
  public Integer getId() {
    return id;
  }

  @ManyToOne
  public QBSalesOrder getQbSalesOrder() {
    return qbSalesOrder;
  }

  @Column(name = "TXN_LINE_ID")
  public String getTxnLineId() {
    return txnLineId;
  }

  @Column(name = "DO_SKU_ID")
  public Integer getDoSkuId() {
    return doSkuId;
  }

  @Column(name = "ITEM_LIST_ID")
  public String getItemListId() {
    return itemListId;
  }

  @Column(name = "ITEM_FULLNAME")
  public String getItemFullName() {
    return itemFullName;
  }

  public BigDecimal getQuantity() {
    return quantity;
  }

  public BigDecimal getRate() {
    return rate;
  }

  public BigDecimal getAmount() {
    return amount;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public void setQbSalesOrder(QBSalesOrder qbSalesOrder) {
    this.qbSalesOrder = qbSalesOrder;
  }

  public void setTxnLineId(String txnLineId) {
    this.txnLineId = txnLineId;
  }

  public void setDoSkuId(Integer doSkuId) {
    this.doSkuId = doSkuId;
  }

  public void setItemListId(String itemListId) {
    this.itemListId = itemListId;
  }

  public void setItemFullName(String itemFullName) {
    this.itemFullName = itemFullName;
  }

  public void setQuantity(BigDecimal quantity) {
    this.quantity = quantity;
  }

  public void setRate(BigDecimal rate) {
    this.rate = rate;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }
}
