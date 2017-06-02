package com.mic.test.cb.qb.xml.domain.response.salesOrder;

import com.mic.test.cb.qb.xml.domain.ObjectMsg;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by caiwen on 2017/6/2.
 */
@XmlRootElement(name = "SalesOrderQueryRs")
@XmlAccessorType(XmlAccessType.FIELD)
public class SalesOrderModRs extends ObjectMsg {

    @XmlElement(name = "SalesOrderRet")
    private SalesOrderRet salesOrderRet;

    public SalesOrderRet getSalesOrderRet() {
        return salesOrderRet;
    }

    public void setSalesOrderRet(SalesOrderRet salesOrderRet) {
        this.salesOrderRet = salesOrderRet;
    }
}
