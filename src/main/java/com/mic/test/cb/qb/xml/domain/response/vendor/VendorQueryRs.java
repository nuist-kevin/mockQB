package com.mic.test.cb.qb.xml.domain.response.vendor;

import com.mic.test.cb.qb.xml.domain.QueryMsg;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by caiwen on 2017/6/1.
 */
@XmlRootElement(name = "VendorQueryRs")
@XmlAccessorType(XmlAccessType.FIELD)
public class VendorQueryRs extends QueryMsg {

    @XmlElement(name = "VendorRet")
    private List<VendorRet> vendorRetList;

    public List<VendorRet> getVendorRetList() {
        return vendorRetList;
    }

    public void setVendorRetList(List<VendorRet> vendorRetList) {
        this.vendorRetList = vendorRetList;
    }
}
