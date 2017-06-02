package com.mic.test.cb.qb.ws.domain;

import javax.xml.bind.annotation.*;

/**
 * Created by caiwen on 2017/5/26.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "authenticateResponse")
@XmlType
public class AuthicateResponse {

    @XmlElementWrapper(name = "authenticateReturn")
    String[] authenticateReturn;

    public String[] getAuthenticateReturn() {
        return authenticateReturn;
    }

    public void setAuthenticateReturn(String[] authenticateReturn) {
        this.authenticateReturn = authenticateReturn;
    }

}
