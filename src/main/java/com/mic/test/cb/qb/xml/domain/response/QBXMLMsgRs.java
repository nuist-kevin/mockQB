package com.mic.test.cb.qb.xml.domain.response;

import com.mic.test.cb.qb.xml.domain.QBXMLBusiMsg;
import com.mic.test.cb.qb.xml.domain.QBXMLMsg;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Created by caiwen on 2017/5/26.
 */
@XmlType
@XmlAccessorType(XmlAccessType.FIELD)
public class QBXMLMsgRs<T extends QBXMLBusiMsgRs> extends QBXMLMsg<T> {


}
