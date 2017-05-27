package com.mic.test.cb.qb.ws.domain.sendRequestXML;

import javax.xml.bind.annotation.*;

/**
 * Created by caiwen on 2017/5/26.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "sendRequestXML")
@XmlType
public class SendRequestXMLRequest {
    @XmlElement
    private String ticket;
    @XmlElement
    private String strHCPResponse;
    @XmlElement
    private String strCompanyFileName;
    @XmlElement
    private String qbXMLCountry;
    @XmlElement
    private String qbXMLMajorVers;
    @XmlElement
    private String qbXMLMinorVers;

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    public String getStrHCPResponse() {
        return strHCPResponse;
    }

    public void setStrHCPResponse(String strHCPResponse) {
        this.strHCPResponse = strHCPResponse;
    }

    public String getStrCompanyFileName() {
        return strCompanyFileName;
    }

    public void setStrCompanyFileName(String strCompanyFileName) {
        this.strCompanyFileName = strCompanyFileName;
    }

    public String getQbXMLCountry() {
        return qbXMLCountry;
    }

    public void setQbXMLCountry(String qbXMLCountry) {
        this.qbXMLCountry = qbXMLCountry;
    }

    public String getQbXMLMajorVers() {
        return qbXMLMajorVers;
    }

    public void setQbXMLMajorVers(String qbXMLMajorVers) {
        this.qbXMLMajorVers = qbXMLMajorVers;
    }

    public String getQbXMLMinorVers() {
        return qbXMLMinorVers;
    }

    public void setQbXMLMinorVers(String qbXMLMinorVers) {
        this.qbXMLMinorVers = qbXMLMinorVers;
    }
}
