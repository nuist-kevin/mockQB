
package com.mic.test.cb.qb.ws.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type�� Java �ࡣ
 *
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 *
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="receiveResponseXMLResult" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "receiveResponseXMLResult"
})
@XmlRootElement(name = "receiveResponseXMLResponse")
public class ReceiveResponseXMLResponse {

  protected int receiveResponseXMLResult;

  /**
   * ��ȡreceiveResponseXMLResult���Ե�ֵ��
   */
  public int getReceiveResponseXMLResult() {
    return receiveResponseXMLResult;
  }

  /**
   * ����receiveResponseXMLResult���Ե�ֵ��
   */
  public void setReceiveResponseXMLResult(int value) {
    this.receiveResponseXMLResult = value;
  }

}
