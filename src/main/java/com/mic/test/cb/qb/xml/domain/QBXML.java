package com.mic.test.cb.qb.xml.domain;

import com.mic.test.cb.qb.xml.domain.request.QBXMLMsgsRq;
import com.mic.test.cb.qb.xml.domain.response.QBXMLMsgsRs;

import javax.xml.bind.annotation.*;

/**
 * Created by caiwen on 2017/6/1.
 */
@XmlRootElement(name = "QBXML")
@XmlAccessorType(XmlAccessType.FIELD)
public class QBXML {

    @XmlElementRefs(
            {@XmlElementRef(type = QBXMLMsgsRs.class, name = "QBXMLMsgsRs"),
                    @XmlElementRef(type = QBXMLMsgsRq.class, name = "QBXMLMsgsRq")
            }
    )
    private QBXMLMsgs qbxmlMsgs;

  public QBXMLMsgs getQbxmlMsgs() {
        return qbxmlMsgs;
    }

  public void setQbxmlMsgs(QBXMLMsgs qbxmlMsgs) {
    this.qbxmlMsgs = qbxmlMsgs;
    }
}
