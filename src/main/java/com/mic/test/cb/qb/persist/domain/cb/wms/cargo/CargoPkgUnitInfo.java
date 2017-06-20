package com.mic.test.cb.qb.persist.domain.cb.wms.cargo;

import com.mic.test.cb.qb.persist.domain.cb.BaseDomain;
import java.math.BigDecimal;
import javax.persistence.Embeddable;

@Embeddable
public class CargoPkgUnitInfo extends BaseDomain {

  private String pkgUnit;

  private BigDecimal convertedQuantity;

  private BigDecimal length;

  private BigDecimal width;

  private BigDecimal height;

  private BigDecimal volume;

  private BigDecimal weight;

  private String lengthUnit;

  private String volumeUnit;

  private String weightUnit;

  public String getPkgUnit() {
    return pkgUnit;
  }

  public void setPkgUnit(String pkgUnit) {
    this.pkgUnit = pkgUnit;
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
