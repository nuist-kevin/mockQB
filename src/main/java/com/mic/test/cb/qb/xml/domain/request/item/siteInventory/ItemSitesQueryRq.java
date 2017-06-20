package com.mic.test.cb.qb.xml.domain.request.item.siteInventory;

import com.mic.test.cb.qb.xml.domain.QueryMsg;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ItemSitesQueryRq")
@XmlAccessorType(XmlAccessType.FIELD)
public class ItemSitesQueryRq extends QueryMsg {

  @XmlElement(name = "ListID")
  private List<String> listIds;

  @XmlElement(name = "ItemSiteFilter")
  private ItemSiteFilter itemSiteFilter;

  public List<String> getListIds() {
    return listIds;
  }

  public void setListIds(List<String> listIds) {
    this.listIds = listIds;
  }

  public ItemSiteFilter getItemSiteFilter() {
    return itemSiteFilter;
  }

  public void setItemSiteFilter(
      ItemSiteFilter itemSiteFilter) {
    this.itemSiteFilter = itemSiteFilter;
  }
}
