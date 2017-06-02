package com.mic.test.cb.qb.xml.domain.response.salesOrder;

import com.mic.test.cb.qb.xml.domain.ObjectMsg;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ShipMethodAddRs")
@XmlAccessorType(XmlAccessType.FIELD)
public class ShipMethodAddRs extends ObjectMsg {

    @XmlElement(name = "ShipMethodRet")
    private ShipMethodRet shipMethodRet;

    public ShipMethodRet getShipMethodRet() {
        return shipMethodRet;
    }

    public void setShipMethodRet(ShipMethodRet shipMethodRet) {
        this.shipMethodRet = shipMethodRet;
    }
}
