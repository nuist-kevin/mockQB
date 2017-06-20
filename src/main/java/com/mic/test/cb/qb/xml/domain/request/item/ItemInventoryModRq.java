package com.mic.test.cb.qb.xml.domain.request.item;

import com.mic.test.cb.qb.xml.domain.ObjectMsg;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by caiwen on 2017/6/2.
 */
@XmlRootElement(name = "ItemInventoryModRq")
@XmlAccessorType(XmlAccessType.FIELD)
public class ItemInventoryModRq extends ObjectMsg {

    @XmlElement(name = "ItemInventoryMod")
    private ItemInventoryMod itemInventoryMod;

    public ItemInventoryMod getItemInventoryMod() {
        return itemInventoryMod;
    }

    public void setItemInventoryMod(ItemInventoryMod itemInventoryMod) {
        this.itemInventoryMod = itemInventoryMod;
    }
}
