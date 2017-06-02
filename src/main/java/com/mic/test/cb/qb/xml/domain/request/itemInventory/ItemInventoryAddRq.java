package com.mic.test.cb.qb.xml.domain.request.itemInventory;

import com.mic.test.cb.qb.xml.domain.ObjectMsg;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by caiwen on 2017/6/2.
 */
@XmlRootElement(name = "ItemInventoryAddRq")
@XmlAccessorType(XmlAccessType.FIELD)
public class ItemInventoryAddRq extends ObjectMsg {

    @XmlElement(name = "ItemInventoryAdd")
    private ItemInventoryAdd itemInventoryAdd;

    public ItemInventoryAdd getItemInventoryAdd() {
        return itemInventoryAdd;
    }

    public void setItemInventoryAdd(ItemInventoryAdd itemInventoryAdd) {
        this.itemInventoryAdd = itemInventoryAdd;
    }
}
