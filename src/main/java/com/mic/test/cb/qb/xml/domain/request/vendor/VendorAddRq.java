package com.mic.test.cb.qb.xml.domain.request.vendor;

import com.mic.test.cb.qb.xml.domain.ObjectMsg;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "VendorQueryRq")
@XmlAccessorType(XmlAccessType.FIELD)
public class VendorAddRq extends ObjectMsg {

    @XmlElement(name = "VendorAdd", required = true)
    private VendorAdd vendorAdd;

    public VendorAdd getVendorAdd() {
        return vendorAdd;
    }

    public void setVendorAdd(VendorAdd vendorAdd) {
        this.vendorAdd = vendorAdd;
    }
}
