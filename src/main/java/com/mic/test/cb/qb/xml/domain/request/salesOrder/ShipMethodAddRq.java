package com.mic.test.cb.qb.xml.domain.request.salesOrder;

import com.mic.test.cb.qb.xml.domain.ObjectMsg;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by caiwen on 2017/6/2.
 */
@XmlRootElement(name = "ShipMethodAddRq")
@XmlAccessorType(XmlAccessType.FIELD)
public class ShipMethodAddRq extends ObjectMsg {

    @XmlElement(name = "ShipMethodAdd")
    private ShipMethodAdd shipMethodAdd;

    public ShipMethodAdd getShipMethodAdd() {
        return shipMethodAdd;
    }

    public void setShipMethodAdd(ShipMethodAdd shipMethodAdd) {
        this.shipMethodAdd = shipMethodAdd;
    }
}
