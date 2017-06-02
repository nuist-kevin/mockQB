package com.mic.test.cb.qb.xml.domain.request.salesOrder;

import com.mic.test.cb.qb.xml.domain.ObjectMsg;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by caiwen on 2017/6/2.
 */
@XmlRootElement(name = "SalesOrderModRq")
@XmlAccessorType(XmlAccessType.FIELD)
public class SalesOrderModRq extends ObjectMsg {

    @XmlElement(name = "SalesOrderMod")
    private SalesOrderMod salesOrderMod;

    public SalesOrderMod getSalesOrderMod() {
        return salesOrderMod;
    }

    public void setSalesOrderMod(SalesOrderMod salesOrderMod) {
        this.salesOrderMod = salesOrderMod;
    }
}
