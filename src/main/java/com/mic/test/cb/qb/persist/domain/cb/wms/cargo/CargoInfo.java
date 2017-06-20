package com.mic.test.cb.qb.persist.domain.cb.wms.cargo;

import com.mic.test.cb.qb.persist.domain.DeleteInfo;
import com.mic.test.cb.qb.persist.domain.cb.AuditInfo;
import com.mic.test.cb.qb.persist.domain.cb.BaseDomain;
import com.mic.test.cb.qb.persist.domain.cb.wms.cargoOwner.CargoOwner;
import java.math.BigDecimal;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Embeddable
public class CargoInfo extends BaseDomain {

  private Integer versionId;
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
  private Integer wmsSyncFlag;
  private BigDecimal printBoxLabelQuanity;
  private Integer measureRegisterFlag;
  private String storageChargeType;
  private Integer needMeasureFlag;

  @Embedded
  private AuditInfo auditInfo;


  public Integer getVersionId() {
    return versionId;
  }

  public void setVersionId(Integer versionId) {
    this.versionId = versionId;
  }

  public Integer getMicComId() {
    return micComId;
  }

  public void setMicComId(Integer micComId) {
    this.micComId = micComId;
  }

  public Integer getValidFlag() {
    return validFlag;
  }

  public void setValidFlag(Integer validFlag) {
    this.validFlag = validFlag;
  }

  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public String getCargoName() {
    return cargoName;
  }

  public void setCargoName(String cargoName) {
    this.cargoName = cargoName;
  }

  public String getCargoCode() {
    return cargoCode;
  }

  public void setCargoCode(String cargoCode) {
    this.cargoCode = cargoCode;
  }

  public String getCargoBarCode() {
    return cargoBarCode;
  }

  public void setCargoBarCode(String cargoBarCode) {
    this.cargoBarCode = cargoBarCode;
  }

  public String getBunit() {
    return bunit;
  }

  public void setBunit(String bunit) {
    this.bunit = bunit;
  }

  public String getAbcClass() {
    return abcClass;
  }

  public void setAbcClass(String abcClass) {
    this.abcClass = abcClass;
  }

  public Integer getEffectiveDays() {
    return effectiveDays;
  }

  public void setEffectiveDays(Integer effectiveDays) {
    this.effectiveDays = effectiveDays;
  }

  public Integer getNearEffectiveDays() {
    return nearEffectiveDays;
  }

  public void setNearEffectiveDays(Integer nearEffectiveDays) {
    this.nearEffectiveDays = nearEffectiveDays;
  }

  public String getCargoClass() {
    return cargoClass;
  }

  public void setCargoClass(String cargoClass) {
    this.cargoClass = cargoClass;
  }

  public String getBatchRule() {
    return batchRule;
  }

  public void setBatchRule(String batchRule) {
    this.batchRule = batchRule;
  }

  public String getPickingClass() {
    return pickingClass;
  }

  public void setPickingClass(String pickingClass) {
    this.pickingClass = pickingClass;
  }

  public Integer getBunitPrecision() {
    return bunitPrecision;
  }

  public void setBunitPrecision(Integer bunitPrecision) {
    this.bunitPrecision = bunitPrecision;
  }

  public String getPalletClass() {
    return palletClass;
  }

  public void setPalletClass(String palletClass) {
    this.palletClass = palletClass;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getReturnAdvise() {
    return returnAdvise;
  }

  public void setReturnAdvise(String returnAdvise) {
    this.returnAdvise = returnAdvise;
  }

  public Integer getWmsSyncFlag() {
    return wmsSyncFlag;
  }

  public void setWmsSyncFlag(Integer wmsSyncFlag) {
    this.wmsSyncFlag = wmsSyncFlag;
  }

  public BigDecimal getPrintBoxLabelQuanity() {
    return printBoxLabelQuanity;
  }

  public void setPrintBoxLabelQuanity(BigDecimal printBoxLabelQuanity) {
    this.printBoxLabelQuanity = printBoxLabelQuanity;
  }

  public Integer getMeasureRegisterFlag() {
    return measureRegisterFlag;
  }

  public void setMeasureRegisterFlag(Integer measureRegisterFlag) {
    this.measureRegisterFlag = measureRegisterFlag;
  }

  public String getStorageChargeType() {
    return storageChargeType;
  }

  public void setStorageChargeType(String storageChargeType) {
    this.storageChargeType = storageChargeType;
  }

  public Integer getNeedMeasureFlag() {
    return needMeasureFlag;
  }

  public void setNeedMeasureFlag(Integer needMeasureFlag) {
    this.needMeasureFlag = needMeasureFlag;
  }

  public AuditInfo getAuditInfo() {
    return auditInfo;
  }

  public void setAuditInfo(AuditInfo auditInfo) {
    this.auditInfo = auditInfo;
  }

}
