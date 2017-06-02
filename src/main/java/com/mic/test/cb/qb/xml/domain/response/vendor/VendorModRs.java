package com.mic.test.cb.qb.xml.domain.response.vendor;

import com.mic.test.cb.qb.xml.domain.ObjectMsg;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by caiwen on 2017/6/1.
 */
@XmlRootElement(name = "VendorModRs")
@XmlAccessorType(XmlAccessType.FIELD)
public class VendorModRs extends ObjectMsg {

    @XmlElement(name = "VendorRet")
    private VendorRet vendorRet;

    public VendorRet getVendorRet() {
        return vendorRet;
    }

    public void setVendorRet(VendorRet vendorRet) {
        this.vendorRet = vendorRet;
    }
}
