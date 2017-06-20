package com.mic.test.cb.qb.persist.domain.cb.wms.cargo;

import com.mic.test.cb.qb.persist.domain.DeleteInfo;
import com.mic.test.cb.qb.persist.domain.cb.wms.cargoOwner.CargoOwner;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "WMS_CARGO")
public class Cargo {

  @Id
  @Column(name = "CARGO_ID")
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  @SequenceGenerator(name = "s_wms_cargo")
  private Integer id;

  @ManyToOne
  @JoinColumn(name = "WMS_COM_ID")
  private CargoOwner cargoOwner;

  @OneToMany(mappedBy = "cargo")
  private List<CargoPkgUnit> cargoPkgUnit;

  @Embedded
  private CargoInfo cargoInfo;

  @Embedded
  private DeleteInfo deleteInfo;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public CargoInfo getCargoInfo() {
    return cargoInfo;
  }

  public void setCargoInfo(CargoInfo cargoInfo) {
    this.cargoInfo = cargoInfo;
  }

  public DeleteInfo getDeleteInfo() {
    return deleteInfo;
  }

  public void setDeleteInfo(DeleteInfo deleteInfo) {
    this.deleteInfo = deleteInfo;
  }

  public CargoOwner getCargoOwner() {
    return cargoOwner;
  }

  public void setCargoOwner(CargoOwner cargoOwner) {
    this.cargoOwner = cargoOwner;
  }

  public List<CargoPkgUnit> getCargoPkgUnit() {
    return cargoPkgUnit;
  }

  public void setCargoPkgUnit(
      List<CargoPkgUnit> cargoPkgUnit) {
    this.cargoPkgUnit = cargoPkgUnit;
  }
}