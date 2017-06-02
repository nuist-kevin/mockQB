package com.mic.test.cb.qb.xml.domain.response.salesOrder;

import com.mic.test.cb.qb.xml.domain.QueryMsg;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by caiwen on 2017/6/2.
 */
@XmlRootElement(name = "SalesOrderQueryRs")
@XmlAccessorType(XmlAccessType.FIELD)
public class SalesOrderQueryRs extends QueryMsg {

    @XmlElement(name = "SalesOrderRet")
    private List<SalesOrderRet> salesOrderRetList;

    public List<SalesOrderRet> getSalesOrderRetList() {
        return salesOrderRetList;
    }

    public void setSalesOrderRetList(List<SalesOrderRet> salesOrderRetList) {
        this.salesOrderRetList = salesOrderRetList;
    }
}
