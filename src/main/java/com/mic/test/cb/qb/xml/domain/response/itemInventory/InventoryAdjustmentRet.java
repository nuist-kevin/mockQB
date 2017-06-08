package com.mic.test.cb.qb.xml.domain.response.itemInventory;

import com.mic.test.cb.qb.xml.domain.common.QBRef;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;
import java.util.List;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class InventoryAdjustmentRet {

  @XmlElement(name = "TxnID")
  private Integer txnId;

  @XmlElement(name = "TimeCreated")
  private Date timeCreated;

  @XmlElement(name = "TimeModified")
  private Date timeModified;

  @XmlElement(name = "EditSequence")
  private String editSequence;

  @XmlElement(name = "TxnNumber")
  private Integer txnNumber;

  @XmlElement(name = "AccountRef")
  private QBRef accountRef;

  @XmlElement(name = "TxnDate")
  private Date txnDate;

  @XmlElement(name = "InventoryAdjustmentLineRet")
  private List<InventoryAdjustmentLineRet> inventoryAdjustmentLineRetList;

  public Integer getTxnId() {
    return txnId;
  }

  public void setTxnId(Integer txnId) {
    this.txnId = txnId;
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

  public Integer getTxnNumber() {
    return txnNumber;
  }

  public void setTxnNumber(Integer txnNumber) {
    this.txnNumber = txnNumber;
  }

  public QBRef getAccountRef() {
    return accountRef;
  }

  public void setAccountRef(QBRef accountRef) {
    this.accountRef = accountRef;
  }

  public Date getTxnDate() {
    return txnDate;
  }

  public void setTxnDate(Date txnDate) {
    this.txnDate = txnDate;
  }

  public List<InventoryAdjustmentLineRet> getInventoryAdjustmentLineRetList() {
    return inventoryAdjustmentLineRetList;
  }

  public void setInventoryAdjustmentLineRetList(
      List<InventoryAdjustmentLineRet> inventoryAdjustmentLineRetList) {
    this.inventoryAdjustmentLineRetList = inventoryAdjustmentLineRetList;
  }
}
