package com.mic.test.cb.qb.persist.domain.cb.qb;

import com.mic.test.cb.qb.persist.domain.cb.BaseDomain;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by caiwen on 2017/6/6.
 */
@Entity
@Table(name = "WMS_QB_CUSTOMER")
public class QBCustomer extends BaseDomain {

  private Integer id;

  private String listId;

  private String editSequence;

  private String fullname;

  private String companyName;

  private String phone;

  private String fax;

  private String email;

  private String postalCode;

  private String country;

  private String state;

  private String city;

  private String addr1;

  private String addr2;

  @Id
  @Column(name = "wms_qb_customer_id")
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "s_wms_qb_customer")
  @SequenceGenerator(name = "s_wms_qb_customer", sequenceName = "s_wms_qb_customer")
  public Integer getId() {
    return id;
  }

  @Column(name = "LIST_ID")
  public String getListId() {
    return listId;
  }

  @Column(name = "edit_sequence")
  public String getEditSequence() {
    return editSequence;
  }

  public String getFullname() {
    return fullname;
  }

  //  @Column(name = "company_name")
  public String getCompanyName() {
    return companyName;
  }

  public String getPhone() {
    return phone;
  }

  public String getFax() {
    return fax;
  }

  public String getEmail() {
    return email;
  }

  @Column(name = "postal_code")
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

  public String getAddr1() {
    return addr1;
  }

  public String getAddr2() {
    return addr2;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public void setListId(String listId) {
    this.listId = listId;
  }

  public void setEditSequence(String editSequence) {
    this.editSequence = editSequence;
  }

  public void setFullname(String fullname) {
    this.fullname = fullname;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public void setFax(String fax) {
    this.fax = fax;
  }

  public void setEmail(String email) {
    this.email = email;
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

  public void setAddr1(String addr1) {
    this.addr1 = addr1;
  }

  public void setAddr2(String addr2) {
    this.addr2 = addr2;
  }
}
