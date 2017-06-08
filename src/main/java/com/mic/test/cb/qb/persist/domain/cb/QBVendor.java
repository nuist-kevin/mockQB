package com.mic.test.cb.qb.persist.domain.cb;

import javax.persistence.*;

/**
 * Created by caiwen on 2017/6/6.
 */
@Entity
@Table(name = "WMS_QB_VENDOR")
public class QBVendor extends BaseDomain {

  private Integer id;
  private String companyName;
  private Integer wmsComId;
  private String qbVendorId;
  private String editSequence;
  private String salutation;
  private String firstName;
  private String middleName;
  private String lastName;
  private String address1;
  private String address2;
  private String address3;
  private String address4;
  private String address5;
  private String phone;
  private String altPhone;
  private String fax;
  private String email;
  private String ccEmail;
  private String postalCode;
  private String country;
  private String state;
  private String city;


  @Id
  @Column(name = "VENDOR_ID")
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "s_wms_qb_vendor")
  @SequenceGenerator(name = "s_wms_qb_vendor", sequenceName = "s_wms_qb_vendor")
  public Integer getId() {
    return id;
  }

  @Column(name = "com_name")
  public String getCompanyName() {
    return companyName;
  }

  @Column(name = "WMS_COM_ID")
  public Integer getWmsComId() {
    return wmsComId;
  }

  @Column(name = "QB_VENDOR_ID")
  public String getQbVendorId() {
    return qbVendorId;
  }

  @Column(name = "EDIT_SEQUENCE")
  public String getEditSequence() {
    return editSequence;
  }

  public String getSalutation() {
    return salutation;
  }

  @Column(name = "FIRST_NAME")
  public String getFirstName() {
    return firstName;
  }

  @Column(name = "MIDDLE_NAME")
  public String getMiddleName() {
    return middleName;
  }

  @Column(name = "LAST_NAME")
  public String getLastName() {
    return lastName;
  }

  public String getAddress1() {
    return address1;
  }

  public String getAddress2() {
    return address2;
  }

  public String getAddress3() {
    return address3;
  }

  public String getAddress4() {
    return address4;
  }

  public String getAddress5() {
    return address5;
  }

  public String getPhone() {
    return phone;
  }

  @Column(name = "ALT_PHONE")
  public String getAltPhone() {
    return altPhone;
  }

  public String getFax() {
    return fax;
  }

  public String getEmail() {
    return email;
  }

  @Column(name = "CC_EMAIL")
  public String getCcEmail() {
    return ccEmail;
  }

  @Column(name = "POSTAL_CODE")
  public String getPostalCode() {
    return postalCode;
  }

  public String getCountry() {
    return country;
  }

  public String getState() {
    return state;
  }

  public String getCity() {
    return city;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public void setWmsComId(Integer wmsComId) {
    this.wmsComId = wmsComId;
  }

  public void setQbVendorId(String qbVendorId) {
    this.qbVendorId = qbVendorId;
  }

  public void setEditSequence(String editSequence) {
    this.editSequence = editSequence;
  }

  public void setSalutation(String salutation) {
    this.salutation = salutation;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public void setAddress1(String address1) {
    this.address1 = address1;
  }

  public void setAddress2(String address2) {
    this.address2 = address2;
  }

  public void setAddress3(String address3) {
    this.address3 = address3;
  }

  public void setAddress4(String address4) {
    this.address4 = address4;
  }

  public void setAddress5(String address5) {
    this.address5 = address5;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public void setAltPhone(String altPhone) {
    this.altPhone = altPhone;
  }

  public void setFax(String fax) {
    this.fax = fax;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setCcEmail(String ccEmail) {
    this.ccEmail = ccEmail;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public void setState(String state) {
    this.state = state;
  }

  public void setCity(String city) {
    this.city = city;
  }

}
