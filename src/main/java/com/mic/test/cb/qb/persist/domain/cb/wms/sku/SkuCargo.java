package com.mic.test.cb.qb.persist.domain.cb.wms.sku;

import com.mic.test.cb.qb.persist.domain.cb.wms.cargo.Cargo;
import com.mic.test.cb.qb.persist.domain.cb.wms.cargoOwner.CargoOwner;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity(name = "WMS_CARGO_SKU_MAP")
public class SkuCargo {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  @SequenceGenerator(name = "S_WMS_CARGO_SKU_MAP")
  private Integer recId;

  @ManyToOne
  private CargoOwner cargoOwner;

  @ManyToOne
  @JoinColumn(name = "SKU_ID")
  private SellSku sellSku;

  @OneToOne
  private Cargo cargo;

  private Long cargoAmount;

  public Integer getRecId() {
    return recId;
  }

  public void setRecId(Integer recId) {
    this.recId = recId;
  }

  public CargoOwner getCargoOwner() {
    return cargoOwner;
  }

  public void setCargoOwner(CargoOwner cargoOwner) {
    this.cargoOwner = cargoOwner;
  }

  public SellSku getSellSku() {
    return sellSku;
  }

  public void setSellSku(SellSku sellSku) {
    this.sellSku = sellSku;
  }

  public Cargo getCargo() {
    return cargo;
  }

  public void setCargo(Cargo cargo) {
    this.cargo = cargo;
  }

  public Long getCargoAmount() {
    return cargoAmount;
  }

  public void setCargoAmount(Long cargoAmount) {
    this.cargoAmount = cargoAmount;
  }
}
