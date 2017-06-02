package com.mic.test.cb.qb.xml.domain.response.salesOrder;

import com.mic.test.cb.qb.xml.domain.common.QBRef;
import com.mic.test.cb.qb.xml.domain.common.QBXMLAddress;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class SalesOrderRet {

    @XmlElement(name = "TxnID")
    private String txnId;

    @XmlElement(name = "TimeCreated")
    private Date timeCreated;

    @XmlElement(name = "TimeModified")
    private Date timeModified;

    @XmlElement(name = "EditSequence")
    private String editSequence;

    @XmlElement(name = "TxnNumber")
    private String txnNumber;

    @XmlElement(name = "CustomerRef")
    private QBRef customer;

    @XmlElement(name = "TxnDate")
    private Date txnDate;

    @XmlElement(name = "RefNumber")
    private String refNumber;

    @XmlElement(name = "BillAddress")
    private QBXMLAddress billAddress;

    @XmlElement(name = "ShipAddress")
    private QBXMLAddress shipAddress;

    @XmlElement(name = "DueDate")
    private Date dueDate;

    @XmlElement(name = "ShipDate")
    private Date shipDate;


    @XmlElement(name = "ShipMethodRef")
    private QBRef shipMethod;

    @XmlElement(name = "Subtotal")
    private BigDecimal subtotal;

    @XmlElement(name = "TotalAmount")
    private BigDecimal totalAmount;

    @XmlElement(name = "IsManuallyClosed")
    private Boolean isManuallyClosed;

    @XmlElement(name = "IsFullyInvoiced")
    private Boolean isFullyInvoiced;

    @XmlElement(name = "IsToBePrinted")
    private Boolean isToBePrinted;

    @XmlElement(name = "IsToBeEmailed")
    private Boolean isToBeEmailed;

    @XmlElement(name = "SalesOrderLineRet")
    private List<SalesOrderLineRet> items;


    public String getTxnId() {
        return txnId;
    }

    public void setTxnId(String txnId) {
        this.txnId = txnId;
    }

    public Date getTimeCreated() {
        return timeCreated;
    }

    public void setTimeCreated(Date timeCreated) {
        this.timeCreated = timeCreated;
    }

    public Date getTimeModified() {
        return timeModified;
    }

    public void setTimeModified(Date timeModified) {
        this.timeModified = timeModified;
    }

    public String getEditSequence() {
        return editSequence;
    }

    public void setEditSequence(String editSequence) {
        this.editSequence = editSequence;
    }

    public String getTxnNumber() {
        return txnNumber;
    }

    public void setTxnNumber(String txnNumber) {
        this.txnNumber = txnNumber;
    }

    public QBRef getCustomer() {
        return customer;
    }

    public void setCustomer(QBRef customer) {
        this.customer = customer;
    }

    public Date getTxnDate() {
        return txnDate;
    }

    public void setTxnDate(Date txnDate) {
        this.txnDate = txnDate;
    }

    public String getRefNumber() {
        return refNumber;
    }

    public void setRefNumber(String refNumber) {
        this.refNumber = refNumber;
    }

    public QBXMLAddress getBillAddress() {
        return billAddress;
    }

    public void setBillAddress(QBXMLAddress billAddress) {
        this.billAddress = billAddress;
    }

    public QBXMLAddress getShipAddress() {
        return shipAddress;
    }

    public void setShipAddress(QBXMLAddress shipAddress) {
        this.shipAddress = shipAddress;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Date getShipDate() {
        return shipDate;
    }

    public void setShipDate(Date shipDate) {
        this.shipDate = shipDate;
    }

    public QBRef getShipMethod() {
        return shipMethod;
    }

    public void setShipMethod(QBRef shipMethod) {
        this.shipMethod = shipMethod;
    }

    public BigDecimal getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Boolean getManuallyClosed() {
        return isManuallyClosed;
    }

    public void setManuallyClosed(Boolean manuallyClosed) {
        isManuallyClosed = manuallyClosed;
    }

    public Boolean getFullyInvoiced() {
        return isFullyInvoiced;
    }

    public void setFullyInvoiced(Boolean fullyInvoiced) {
        isFullyInvoiced = fullyInvoiced;
    }

    public Boolean getToBePrinted() {
        return isToBePrinted;
    }

    public void setToBePrinted(Boolean toBePrinted) {
        isToBePrinted = toBePrinted;
    }

    public Boolean getToBeEmailed() {
        return isToBeEmailed;
    }

    public void setToBeEmailed(Boolean toBeEmailed) {
        isToBeEmailed = toBeEmailed;
    }

    public List<SalesOrderLineRet> getItems() {
        return items;
    }

    public void setItems(List<SalesOrderLineRet> items) {
        this.items = items;
    }
}
