package com.mic.test.cb.qb.persist.domain.cb.wms.cargo;

import com.mic.test.cb.qb.persist.domain.DeleteInfo;
import com.mic.test.cb.qb.persist.domain.cb.AuditInfo;
import com.mic.test.cb.qb.persist.domain.cb.BaseDomain;
import com.mic.test.cb.qb.persist.domain.cb.wms.cargoOwner.CargoOwner;
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
import javax.persistence.Table;

@Entity
@Table(name = "WMS_CARGO_SNAP")
public class CargoSnap {

  @Id
  @Column(name = "CARGO_SNAP_ID")
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  @SequenceGenerator(name = "s_wms_cargo_snap")
  private Integer id;
  private Integer cargoId;
/*  private Integer versionId;
  private Integer wmsComId;
  private Integer micComId;
  private Integer validFlag;
  private Integer status;
  private String cargoName;
  private String cargoCode;
  private String cargoBarCode;
  private String bunit;
  private String abcClass;
  private Integer effectiveDays;
  private Integer nearEffectiveDays;
  private String cargoClass;
  private String batchRule;
  private String pickingClass;
  private Integer bunitPrecision;
  private String palletClass;
  private String description;
  private String returnAdvise;

  //TODO 实际缺少下面两个字段
//  private Integer wmsSyncFlag;
//  private BigDecimal printBoxLabelQuanity;
  private Integer measureRegisterFlag;
  private String storageChargeType;
  private Integer needMeasureFlag;*/

  @Embedded
  private CargoInfo cargoInfo;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getCargoId() {
    return cargoId;
  }

  public void setCargoId(Integer cargoId) {
    this.cargoId = cargoId;
  }

  public CargoInfo getCargoInfo() {
    return cargoInfo;
  }

  public void setCargoInfo(CargoInfo cargoInfo) {
    this.cargoInfo = cargoInfo;
  }
}
