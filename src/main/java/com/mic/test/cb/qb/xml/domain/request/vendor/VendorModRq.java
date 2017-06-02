package com.mic.test.cb.qb.xml.domain.request.vendor;

import com.mic.test.cb.qb.xml.domain.ObjectMsg;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by caiwen on 2017/6/1.
 */
@XmlRootElement(name = "VendorModRq")
@XmlAccessorType(XmlAccessType.FIELD)
public class VendorModRq extends ObjectMsg {

    @XmlElement(name = "VendorMod", required = true)
    private VendorMod vendorMod;

    public VendorMod getVendorMod() {
        return vendorMod;
    }

    public void setVendorMod(VendorMod vendorMod) {
        this.vendorMod = vendorMod;
    }
}
