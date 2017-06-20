package com.mic.test.cb.qb.xml.domain.request.item.siteInventory;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class SiteFilter {

  @XmlElement(name = "ListID")
  private List<String> listId;

  @XmlElement(name = "FullName")
  private List<String> fullName;

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
}
