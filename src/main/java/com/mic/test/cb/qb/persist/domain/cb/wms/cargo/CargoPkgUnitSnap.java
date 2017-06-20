package com.mic.test.cb.qb.persist.domain.cb.wms.cargo;

import com.mic.test.cb.qb.persist.domain.cb.BaseDomain;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity(name = "WMS_CARGO_PKG_UNIT_SNAP")
public class CargoPkgUnitSnap {

  @Id
  @Column(name = "PKG_UNIT_SNAP_ID")
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  @SequenceGenerator(name = "S_WMS_CARGO_PKG_UNIT_SNAP")
  private Integer id;

  private Integer pkgUnitId;

  private Integer cargoId;

  private Integer versionId;

  private BigDecimal convertedQuantity;

  private BigDecimal length;

  private BigDecimal width;

  private BigDecimal height;

  private BigDecimal volume;

  private BigDecimal weight;

  private String lengthUnit;

  private String volumeUnit;

  private String weightUnit;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getPkgUnitId() {
    return pkgUnitId;
  }

  public void setPkgUnitId(Integer pkgUnitId) {
    this.pkgUnitId = pkgUnitId;
  }

  public Integer getCargoId() {
    return cargoId;
  }

  public void setCargoId(Integer cargoId) {
    this.cargoId = cargoId;
  }

  public Integer getVersionId() {
    return versionId;
  }

  public void setVersionId(Integer versionId) {
    this.versionId = versionId;
  }

  public BigDecimal getConvertedQuantity() {
    return convertedQuantity;
  }

  public void setConvertedQuantity(BigDecimal convertedQuantity) {
    this.convertedQuantity = convertedQuantity;
  }

  public BigDecimal getLength() {
    return length;
  }

  public void setLength(BigDecimal length) {
    this.length = length;
  }

  public BigDecimal getWidth() {
    return width;
  }

  public void setWidth(BigDecimal width) {
    this.width = width;
  }

  public BigDecimal getHeight() {
    return height;
  }

  public void setHeight(BigDecimal height) {
    this.height = height;
  }

  public BigDecimal getVolume() {
    return volume;
  }

  public void setVolume(BigDecimal volume) {
    this.volume = volume;
  }

  public BigDecimal getWeight() {
    return weight;
  }

  public void setWeight(BigDecimal weight) {
    this.weight = weight;
  }

  public String getLengthUnit() {
    return lengthUnit;
  }

  public void setLengthUnit(String lengthUnit) {
    this.lengthUnit = lengthUnit;
  }

  public String getVolumeUnit() {
    return volumeUnit;
  }

  public void setVolumeUnit(String volumeUnit) {
    this.volumeUnit = volumeUnit;
  }

  public String getWeightUnit() {
    return weightUnit;
  }

  public void setWeightUnit(String weightUnit) {
    this.weightUnit = weightUnit;
  }

}
