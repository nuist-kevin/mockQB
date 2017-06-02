package com.mic.test.cb.qb.xml.domain.response.itemInventory;

import com.mic.test.cb.qb.xml.domain.ObjectMsg;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by caiwen on 2017/6/2.
 */
@XmlRootElement(name = "ItemInventoryAddRs")
@XmlAccessorType(XmlAccessType.FIELD)
public class ItemInventoryAddRs extends ObjectMsg {

    @XmlElement(name = "ItemInventoryRet")
    private ItemInventoryRet itemInventoryRet;

    public ItemInventoryRet getItemInventoryRet() {
        return itemInventoryRet;
    }

    public void setItemInventoryRet(ItemInventoryRet itemInventoryRet) {
        this.itemInventoryRet = itemInventoryRet;
    }
}
