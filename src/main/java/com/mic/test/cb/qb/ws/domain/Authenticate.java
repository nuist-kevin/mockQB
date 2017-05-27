package com.mic.test.cb.qb.ws.domain;

import javax.xml.bind.annotation.*;

/**
 * Created by caiwen on 2017/5/26.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "authenticate")
@XmlType(propOrder = {"strUserName", "strPassword"})
public class Authenticate {

    @XmlElement
    private String strUserName;
    @XmlElement
    private String strPassword;

    public String getStrUserName() {
        return strUserName;
    }

    public void setStrUserName(String strUserName) {
        this.strUserName = strUserName;
    }

    public String getStrPassword() {
        return strPassword;
    }

    public void setStrPassword(String strPassword) {
        this.strPassword = strPassword;
    }
}
