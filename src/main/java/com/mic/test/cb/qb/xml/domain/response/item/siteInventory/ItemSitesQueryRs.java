package com.mic.test.cb.qb.xml.domain.response.item.siteInventory;

import com.mic.test.cb.qb.xml.domain.QueryMsg;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ItemSitesQueryRs")
@XmlAccessorType(XmlAccessType.FIELD)
public class ItemSitesQueryRs extends QueryMsg {

  @XmlElement(name = "ItemSitesRet")
  private List<ItemSitesRet> itemSitesRetList;

  public List<ItemSitesRet> getItemSitesRetList() {
    return itemSitesRetList;
  }

  public void setItemSitesRetList(
      List<ItemSitesRet> itemSitesRetList) {
    this.itemSitesRetList = itemSitesRetList;
  }
}
