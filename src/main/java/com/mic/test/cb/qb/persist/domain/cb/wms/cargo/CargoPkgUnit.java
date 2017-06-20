package com.mic.test.cb.qb.persist.domain.cb.wms.cargo;

import com.mic.test.cb.qb.persist.domain.DeleteInfo;
import com.mic.test.cb.qb.persist.domain.cb.BaseDomain;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity(name = "WMS_CARGO_PKG_UNIT")
public class CargoPkgUnit {

  @Id
  @Column(name = "PKG_UNIT_ID")
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  @SequenceGenerator(name = "S_WMS_CARGO_PKG_UNIT")
  private Integer id;

  @ManyToOne
  @JoinColumn(name = "CARGO_ID")
  private Cargo cargo;

  @Embedded
  private DeleteInfo deleteInfo;

  @Embedded
  private CargoPkgUnitInfo cargoPkgUnitInfo;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Cargo getCargo() {
    return cargo;
  }

  public void setCargo(Cargo cargo) {
    this.cargo = cargo;
  }

  public DeleteInfo getDeleteInfo() {
    return deleteInfo;
  }

  public void setDeleteInfo(DeleteInfo deleteInfo) {
    this.deleteInfo = deleteInfo;
  }

  public CargoPkgUnitInfo getCargoPkgUnitInfo() {
    return cargoPkgUnitInfo;
  }

  public void setCargoPkgUnitInfo(
      CargoPkgUnitInfo cargoPkgUnitInfo) {
    this.cargoPkgUnitInfo = cargoPkgUnitInfo;
  }
}
