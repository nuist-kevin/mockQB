package com.mic.test.cb.qb.persist.domain.cb.qb;

import com.mic.test.cb.qb.persist.domain.cb.BaseDomain;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "WMS_QB_SALES_ORDER")
public class QBSalesOrder extends BaseDomain {

  private Integer id;

  private String txnId;

  private String editSequence;

  private Integer doId;

  private String txnNumber;

  private String refNumber;

  private Date txnDate;

  private QBCustomer qbCustomer;

  private String postalCode;

  private String country;

  private String state;

  private String city;

  private String addr1;

  private String addr2;

  @Id
  @Column(name = "WMS_QB_SALES_ORDER_ID")
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "s_WMS_QB_SALES_ORDER")
  @SequenceGenerator(name = "s_WMS_QB_SALES_ORDER", sequenceName = "s_WMS_QB_SALES_ORDER")
  public Integer getId() {
    return id;
  }

  @Column(name = "TXN_ID")
  public String getTxnId() {
    return txnId;
  }

  @Column(name = "EDIT_SEQUENCE")
  public String getEditSequence() {
    return editSequence;
  }

  @Column(name = "DO_ID")
  public Integer getDoId() {
    return doId;
  }

  @Column(name = "TXN_NUMBER")

  public String getTxnNumber() {
    return txnNumber;
  }

  @Column(name = "REF_NUMBER")
  public String getRefNumber() {
    return refNumber;
  }

  @Column(name = "TXN_DATE")
  @Temporal(TemporalType.TIME)
  public Date getTxnDate() {
    return txnDate;
  }

  @ManyToOne
  @JoinColumn(name = "CUSTOMER_LIST_ID", referencedColumnName = "LIST_ID")
  public QBCustomer getQbCustomer() {
    return qbCustomer;
  }

  @Column(name = "POSTAL_CODE")
  public String getPostalCode() {
    return postalCode;
  }

  public String getCountry() {
    return country;
  }

  public String getState() {
    return state;
  }

  public String getCity() {
    return city;
  }

  public String getAddr1() {
    return addr1;
  }

  public String getAddr2() {
    return addr2;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public void setTxnId(String txnId) {
    this.txnId = txnId;
  }

  public void setEditSequence(String editSequence) {
    this.editSequence = editSequence;
  }

  public void setDoId(Integer doId) {
    this.doId = doId;
  }

  public void setTxnNumber(String txnNumber) {
    this.txnNumber = txnNumber;
  }

  public void setRefNumber(String refNumber) {
    this.refNumber = refNumber;
  }

  public void setTxnDate(Date txnDate) {
    this.txnDate = txnDate;
  }

  public void setQbCustomer(QBCustomer qbCustomer) {
    this.qbCustomer = qbCustomer;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public void setState(String state) {
    this.state = state;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public void setAddr1(String addr1) {
    this.addr1 = addr1;
  }

  public void setAddr2(String addr2) {
    this.addr2 = addr2;
  }
}
