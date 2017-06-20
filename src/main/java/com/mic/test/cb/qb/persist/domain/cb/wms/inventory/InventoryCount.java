package com.mic.test.cb.qb.persist.domain.cb.wms.inventory;

import com.mic.test.cb.qb.persist.domain.cb.BaseDomain;
import com.mic.test.cb.qb.persist.domain.cb.wms.cargo.Cargo;
import com.mic.test.cb.qb.persist.domain.cb.wms.cargoOwner.CargoOwner;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "WMS_INVENTORY_COUNT")
public class InventoryCount extends BaseDomain {

  @Id
  @Column(name = "COUNT_ID")
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  @SequenceGenerator(name = "S_WMS_INVENTORY_COUNT")
  private Integer id;

  @ManyToOne
  @JoinColumn(name = "WMS_COM_ID")
  private CargoOwner cargoOwner;

  @ManyToOne
  @JoinColumn(name = "CARGO_ID")
  private Cargo cargo;

  private BigDecimal quantiryBu;

  private BigDecimal intransitQuantityBu;

  private BigDecimal lockQuantiryBu;

  private Integer status;

  private BigDecimal stockInCount;

  private BigDecimal stockOutCount;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public CargoOwner getCargoOwner() {
    return cargoOwner;
  }

  public void setCargoOwner(CargoOwner cargoOwner) {
    this.cargoOwner = cargoOwner;
  }

  public Cargo getCargo() {
    return cargo;
  }

  public void setCargo(Cargo cargo) {
    this.cargo = cargo;
  }

  public BigDecimal getQuantiryBu() {
    return quantiryBu;
  }

  public void setQuantiryBu(BigDecimal quantiryBu) {
    this.quantiryBu = quantiryBu;
  }

  public BigDecimal getIntransitQuantityBu() {
    return intransitQuantityBu;
  }

  public void setIntransitQuantityBu(BigDecimal intransitQuantityBu) {
    this.intransitQuantityBu = intransitQuantityBu;
  }

  public BigDecimal getLockQuantiryBu() {
    return lockQuantiryBu;
  }

  public void setLockQuantiryBu(BigDecimal lockQuantiryBu) {
    this.lockQuantiryBu = lockQuantiryBu;
  }

  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public BigDecimal getStockInCount() {
    return stockInCount;
  }

  public void setStockInCount(BigDecimal stockInCount) {
    this.stockInCount = stockInCount;
  }

  public BigDecimal getStockOutCount() {
    return stockOutCount;
  }

  public void setStockOutCount(BigDecimal stockOutCount) {
    this.stockOutCount = stockOutCount;
  }
}
