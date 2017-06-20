package com.mic.test.cb.qb.xml.domain.request.item.siteInventory;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ItemSiteFilter {

  @XmlElement(name = "ItemFilter")
  private ItemFilter itemFilter;

  @XmlElement(name = "SiteFilter")
  private SiteFilter siteFilter;

  public ItemFilter getItemFilter() {
    return itemFilter;
  }

  public void setItemFilter(ItemFilter itemFilter) {
    this.itemFilter = itemFilter;
  }

  public SiteFilter getSiteFilter() {
    return siteFilter;
  }

  public void setSiteFilter(SiteFilter siteFilter) {
    this.siteFilter = siteFilter;
  }
}
