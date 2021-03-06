package com.mic.test.cb.qb.xml.domain.response.vendor;

import com.mic.test.cb.qb.xml.domain.common.QBXMLAddress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

/**
 * Created by caiwen on 2017/6/1.
 */
@XmlRootElement(name = "VendorRet")
@XmlAccessorType(XmlAccessType.FIELD)
public class VendorRet {

  @XmlElement(name = "ListID")
  private String listId;

  @XmlElement(name = "TimeCreated")
  private Date timeCreated;

  @XmlElement(name = "TimeModified")
  private Date timeModified;

  @XmlElement(name = "EditSequence")
  private String editSequence;

  @XmlElement(name = "Name")
  private String name;

  @XmlElement(name = "IsActive")
  private Boolean isActive;

  @XmlElement(name = "CompanyName")
  private String companyName;

  @XmlElement(name = "Salutation")
  private String salutation;

  @XmlElement(name = "FirstName")
  private String firstName;

  @XmlElement(name = "MiddleName")
  private String middleName;

  @XmlElement(name = "LastName")
  private String lastName;

  @XmlElement(name = "VendorAddress")
  private QBXMLAddress address;

  @XmlElement(name = "Phone")
  private String phone;

  @XmlElement(name = "AltPhone")
  private String altPhone;

  @XmlElement(name = "Fax")
  private String fax;

  @XmlElement(name = "Email")
  private String email;

  @XmlElement(name = "Cc")
  private String ccEmail;

  @XmlElement(name = "Contact")
  private String contact;

  @XmlElement(name = "Notes")
  private String notes;

  public String getListId() {
    return listId;
  }

  public void setListId(String listId) {
    this.listId = listId;
  }

  public Date getTimeCreated() {
    return timeCreated;
  }

  public void setTimeCreated(Date timeCreated) {
    this.timeCreated = timeCreated;
  }

  public Date getTimeModified() {
    return timeModified;
  }

  public void setTimeModified(Date timeModified) {
    this.timeModified = timeModified;
  }

  public String getEditSequence() {
    return editSequence;
  }

  public void setEditSequence(String editSequence) {
    this.editSequence = editSequence;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Boolean getActive() {
    return isActive;
  }

  public void setActive(Boolean active) {
    isActive = active;
  }

  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public String getSalutation() {
    return salutation;
  }

  public void setSalutation(String salutation) {
    this.salutation = salutation;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public QBXMLAddress getAddress() {
    return address;
  }

  public void setAddress(QBXMLAddress address) {
    this.address = address;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getAltPhone() {
    return altPhone;
  }

  public void setAltPhone(String altPhone) {
    this.altPhone = altPhone;
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

  public String getCcEmail() {
    return ccEmail;
  }

  public void setCcEmail(String ccEmail) {
    this.ccEmail = ccEmail;
  }

  public String getContact() {
    return contact;
  }

  public void setContact(String contact) {
    this.contact = contact;
  }

  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }
}

