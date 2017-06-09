package com.mic.test.cb.qb.xml.domain.response.customer;

import com.mic.test.cb.qb.xml.domain.common.QBXMLAddress;
import java.util.Date;
import javax.xml.bind.annotation.*;

@XmlRootElement(name = "CustomerRet")
@XmlAccessorType(XmlAccessType.FIELD)
public class CustomerRet {

  @XmlElement(name = "ListID")
  private String listId;

  @XmlElement(name = "EditSequence")
  private String editSequence;

  @XmlElement(name = "Name")
  private String name;

  @XmlElement(name = "FullName")
  private String fullName;

  @XmlElement(name = "IsActive")
  private Boolean isActive;

  @XmlElement(name = "FirstName")
  private String firstName;

  @XmlElement(name = "MiddleName")
  private String middleName;

  @XmlElement(name = "LastName")
  private String lastName;

  @XmlElement(name = "CompanyName")
  private String companyName;

  @XmlElement(name = "Phone")
  private String phone;

  @XmlElement(name = "Fax")
  private String fax;

  @XmlElement(name = "Email")
  private String email;

  @XmlElement(name = "Contact")
  private String contact;

  @XmlElement(name = "BillAddress")
  private QBXMLAddress billAddress;

  @XmlElement(name = "ShipAddress")
  private QBXMLAddress shipAddress;

  @XmlElement(name = "TimeCreated")
  private Date timeCreated;

  @XmlElement(name = "TimeModified")
  private Date timeModified;

  public String getListId() {
    return listId;
  }

  public void setListId(String listId) {
    this.listId = listId;
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

  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public Boolean getActive() {
    return isActive;
  }

  public void setActive(Boolean active) {
    isActive = active;
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

  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
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

  public String getContact() {
    return contact;
  }

  public void setContact(String contact) {
    this.contact = contact;
  }

  public QBXMLAddress getBillAddress() {
    return billAddress;
  }

  public void setBillAddress(QBXMLAddress billAddress) {
    this.billAddress = billAddress;
  }

  public QBXMLAddress getShipAddress() {
    return shipAddress;
  }

  public void setShipAddress(QBXMLAddress shipAddress) {
    this.shipAddress = shipAddress;
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
}
