package com.mic.test.cb.qb.persist.domain.cb.wms.cargoOwner;

import com.mic.test.cb.qb.persist.domain.cb.BaseDomain;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "WMS_COMPANY")
public class CargoOwner extends BaseDomain {

  @Id
  @Column(name = "WMS_COM_ID")
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  @SequenceGenerator(name = "s_wms_company")
  private Integer id;
  private Integer versionId;
  private String micComId;
  private Integer status;
  private String comName;
  private String contactName;
  private String mobile;
  private String tel;
  private String fax;
  private String email;
  private String country;
  private String province;
  private String city;
  private String zipCode;
  private String address;
  private String remark;
  private Integer wmsSyncFlag;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getVersionId() {
    return versionId;
  }

  public void setVersionId(Integer versionId) {
    this.versionId = versionId;
  }

  public String getMicComId() {
    return micComId;
  }

  public void setMicComId(String micComId) {
    this.micComId = micComId;
  }

  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public String getComName() {
    return comName;
  }

  public void setComName(String comName) {
    this.comName = comName;
  }

  public String getContactName() {
    return contactName;
  }

  public void setContactName(String contactName) {
    this.contactName = contactName;
  }

  public String getMobile() {
    return mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }

  public String getTel() {
    return tel;
  }

  public void setTel(String tel) {
    this.tel = tel;
  }

  public String getFax() {
    return fax;
  }

  public void setFax(String fax) {
    this.fax = fax;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public String getProvince() {
    return province;
  }

  public void setProvince(String province) {
    this.province = province;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getZipCode() {
    return zipCode;
  }

  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }

  public Integer getWmsSyncFlag() {
    return wmsSyncFlag;
  }

  public void setWmsSyncFlag(Integer wmsSyncFlag) {
    this.wmsSyncFlag = wmsSyncFlag;
  }
}
