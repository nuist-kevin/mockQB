package com.mic.test.cb.qb.persist.domain.cb;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by caiwen on 2017/6/7.
 */
@Entity
@Table(name = "WMS_QB_ITEM")
public class QBItem extends BaseDomain {

  private Integer id;

  private String qbItemId;

  private String editSequence;

  private QBVendor qbVendor;

  private Integer skuId;

  private String itemName;

  private String barCode;

  private String manufacturerParNumber;

  private BigDecimal quantityOnHand;

  private String incomeAccountListId;

  private String incomeAccountFullName;

  private String cogsAccountListId;

  private String cogsAccountFullName;

  private String assetAccountListId;

  private String assetAccountFullName;

  @Id
  @Column(name = "ITEM_ID")
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "s_wms_qb_ITEM")
  @SequenceGenerator(name = "s_wms_qb_ITEM", sequenceName = "s_wms_qb_ITEM")
  public Integer getId() {
    return id;
  }

  @Column(name = "QB_ITEM_ID")
  public String getQbItemId() {
    return qbItemId;
  }

  @Column(name = "EDIT_SEQUENCE")

  public String getEditSequence() {
    return editSequence;
  }

  @ManyToOne
  @JoinColumn(name = "QB_VENDOR_ID", referencedColumnName = "QB_VENDOR_ID")
  public QBVendor getQbVendor() {
    return qbVendor;
  }

  @Column(name = "SKU_ID")
  public Integer getSkuId() {
    return skuId;
  }

  @Column(name = "ITEM_NAME")
  public String getItemName() {
    return itemName;
  }

  @Column(name = "BAR_CODE")
  public String getBarCode() {
    return barCode;
  }

  @Column(name = "MANUFACTURER_PART_NUMBER")
  public String getManufacturerParNumber() {
    return manufacturerParNumber;
  }

  @Column(name = "QUANTITY_ON_HAND")
  public BigDecimal getQuantityOnHand() {
    return quantityOnHand;
  }

  @Column(name = "INCOME_ACCOUNT_LIST_ID")
  public String getIncomeAccountListId() {
    return incomeAccountListId;
  }

  @Column(name = "INCOME_ACCOUNT_FULL_NAME")
  public String getIncomeAccountFullName() {
    return incomeAccountFullName;
  }

  @Column(name = "COGS_ACCOUNT_LIST_ID")
  public String getCogsAccountListId() {
    return cogsAccountListId;
  }

  @Column(name = "COGS_ACCOUNT_FULL_NAME")
  public String getCogsAccountFullName() {
    return cogsAccountFullName;
  }

  @Column(name = "ASSET_ACCOUNT_LIST_ID")
  public String getAssetAccountListId() {
    return assetAccountListId;
  }

  @Column(name = "ASSET_ACCOUNT_FULL_NAME")
  public String getAssetAccountFullName() {
    return assetAccountFullName;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public void setQbItemId(String qbItemId) {
    this.qbItemId = qbItemId;
  }

  public void setEditSequence(String editSequence) {
    this.editSequence = editSequence;
  }

  public void setQbVendor(QBVendor qbVendor) {
    this.qbVendor = qbVendor;
  }

  public void setSkuId(Integer skuId) {
    this.skuId = skuId;
  }

  public void setItemName(String itemName) {
    this.itemName = itemName;
  }

  public void setBarCode(String barCode) {
    this.barCode = barCode;
  }

  public void setManufacturerParNumber(String manufacturerParNumber) {
    this.manufacturerParNumber = manufacturerParNumber;
  }

  public void setQuantityOnHand(BigDecimal quantityOnHand) {
    this.quantityOnHand = quantityOnHand;
  }

  public void setIncomeAccountListId(String incomeAccountListId) {
    this.incomeAccountListId = incomeAccountListId;
  }

  public void setIncomeAccountFullName(String incomeAccountFullName) {
    this.incomeAccountFullName = incomeAccountFullName;
  }

  public void setCogsAccountListId(String cogsAccountListId) {
    this.cogsAccountListId = cogsAccountListId;
  }

  public void setCogsAccountFullName(String cogsAccountFullName) {
    this.cogsAccountFullName = cogsAccountFullName;
  }

  public void setAssetAccountListId(String assetAccountListId) {
    this.assetAccountListId = assetAccountListId;
  }

  public void setAssetAccountFullName(String assetAccountFullName) {
    this.assetAccountFullName = assetAccountFullName;
  }
}
