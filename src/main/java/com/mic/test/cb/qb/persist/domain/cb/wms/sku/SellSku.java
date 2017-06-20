package com.mic.test.cb.qb.persist.domain.cb.wms.sku;

import com.mic.test.cb.qb.persist.domain.DeleteInfo;
import com.mic.test.cb.qb.persist.domain.cb.BaseDomain;
import com.mic.test.cb.qb.persist.domain.cb.wms.cargo.Cargo;
import com.mic.test.cb.qb.persist.domain.cb.wms.cargoOwner.CargoOwner;
import java.util.List;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity(name = "WMS_CARGO_SKU")
public class SellSku extends BaseDomain {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  @SequenceGenerator(name = "S_WMS_CARGO_SKU")
  private Integer skuId;

  @ManyToOne
  @JoinColumn(name = "WMS_COM_ID")
  private CargoOwner cargoOwner;

  private Integer micComId;

  private String sku;

  @OneToMany(mappedBy = "sku")
  private List<SkuCargo> cargoList;

  private Integer region;

  @Embedded
  private DeleteInfo deleteInfo;

  public Integer getSkuId() {
    return skuId;
  }

  public void setSkuId(Integer skuId) {
    this.skuId = skuId;
  }

  public CargoOwner getCargoOwner() {
    return cargoOwner;
  }

  public void setCargoOwner(CargoOwner cargoOwner) {
    this.cargoOwner = cargoOwner;
  }

  public Integer getMicComId() {
    return micComId;
  }

  public void setMicComId(Integer micComId) {
    this.micComId = micComId;
  }

  public String getSku() {
    return sku;
  }

  public void setSku(String sku) {
    this.sku = sku;
  }

  public Integer getRegion() {
    return region;
  }

  public void setRegion(Integer region) {
    this.region = region;
  }

  public DeleteInfo getDeleteInfo() {
    return deleteInfo;
  }

  public void setDeleteInfo(DeleteInfo deleteInfo) {
    this.deleteInfo = deleteInfo;
  }
}
