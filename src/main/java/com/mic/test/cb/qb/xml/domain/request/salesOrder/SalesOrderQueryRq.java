package com.mic.test.cb.qb.xml.domain.request.salesOrder;

import com.mic.test.cb.qb.xml.domain.ObjectMsg;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by caiwen on 2017/6/2.
 */

@XmlRootElement(name = "SalesOrderQueryRq")
@XmlAccessorType(XmlAccessType.FIELD)
public class SalesOrderQueryRq extends ObjectMsg {

    @XmlElement(name = "ModifiedDateRangeFilter")
    private DateRange modifiedDateRangeFilter;

    @XmlElement(name = "IncludeLineItems")
    private boolean includeLineItems;

    public DateRange getModifiedDateRangeFilter() {
        return modifiedDateRangeFilter;
    }

    public void setModifiedDateRangeFilter(DateRange modifiedDateRangeFilter) {
        this.modifiedDateRangeFilter = modifiedDateRangeFilter;
    }

    public boolean isIncludeLineItems() {
        return includeLineItems;
    }

    public void setIncludeLineItems(boolean includeLineItems) {
        this.includeLineItems = includeLineItems;
    }
}
