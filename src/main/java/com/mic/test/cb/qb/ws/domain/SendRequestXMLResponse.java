
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
 *         &lt;element name="sendRequestXMLResult" type="{http://www.w3.org/2001/XMLSchema}string"
 * minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sendRequestXMLResult"
})
@XmlRootElement(name = "sendRequestXMLResponse")
public class SendRequestXMLResponse {

  private String sendRequestXMLResult;

  /**
   * ��ȡsendRequestXMLResult���Ե�ֵ��
   *
   * @return possible object is {@link String }
   */
  public String getSendRequestXMLResult() {
    return sendRequestXMLResult;
  }

  /**
   * ����sendRequestXMLResult���Ե�ֵ��
   *
   * @param value allowed object is {@link String }
   */
  public void setSendRequestXMLResult(String value) {
    this.sendRequestXMLResult = value;
  }

}
