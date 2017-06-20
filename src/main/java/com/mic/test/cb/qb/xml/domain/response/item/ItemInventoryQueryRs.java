package com.mic.test.cb.qb.xml.domain.response.item;

import com.mic.test.cb.qb.xml.domain.QueryMsg;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by caiwen on 2017/6/2.
 */
@XmlRootElement(name = "ItemInventoryQueryRs")
@XmlAccessorType(XmlAccessType.FIELD)
public class ItemInventoryQueryRs extends QueryMsg {

    @XmlElement(name = "ItemInventoryRet")
    private List<ItemInventoryRet> inventoryRetList;

    public List<ItemInventoryRet> getInventoryRetList() {
        return inventoryRetList;
    }

    public void setInventoryRetList(List<ItemInventoryRet> inventoryRetList) {
        this.inventoryRetList = inventoryRetList;
    }
}
