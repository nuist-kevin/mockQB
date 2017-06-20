package com.mic.test.cb.qb.xml.domain.request.item.siteInventory;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ItemFilter {

  @XmlElement(name = "ListID")
  private List<String> listId;

  @XmlElement(name = "FullName")
  private List<String> fullName;

  @XmlElement
  private String listIdWithChildren;

  @XmlElement
  private String fullNameWithChildren;

  public List<String> getListId() {
    return listId;
  }

  public void setListId(List<String> listId) {
    this.listId = listId;
  }

  public List<String> getFullName() {
    return fullName;
  }

  public void setFullName(List<String> fullName) {
    this.fullName = fullName;
  }

  public String getListIdWithChildren() {
    return listIdWithChildren;
  }

  public void setListIdWithChildren(String listIdWithChildren) {
    this.listIdWithChildren = listIdWithChildren;
  }

  public String getFullNameWithChildren() {
    return fullNameWithChildren;
  }

  public void setFullNameWithChildren(String fullNameWithChildren) {
    this.fullNameWithChildren = fullNameWithChildren;
  }
}
