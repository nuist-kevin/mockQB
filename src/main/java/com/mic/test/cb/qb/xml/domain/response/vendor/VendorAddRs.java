package com.mic.test.cb.qb.xml.domain.response.vendor;

import com.mic.test.cb.qb.xml.domain.ObjectMsg;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by caiwen on 2017/6/1.
 */
@XmlRootElement(name = "VendorAddRs")
@XmlAccessorType(XmlAccessType.FIELD)
public class VendorAddRs extends ObjectMsg {

    @XmlElement(name = "VendorRet")
    private VendorRet vendorRet;

    public VendorRet getVendorRet() {
        return vendorRet;
    }

    public void setVendorRet(VendorRet vendorRet) {
        this.vendorRet = vendorRet;
    }
}
