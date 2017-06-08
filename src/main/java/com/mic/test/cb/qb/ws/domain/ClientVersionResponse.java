
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
 *         &lt;element name="clientVersionResult" type="{http://www.w3.org/2001/XMLSchema}string"
 * minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientVersionResult"
})
@XmlRootElement(name = "clientVersionResponse")
public class ClientVersionResponse {

  protected String clientVersionResult;

  /**
   * ��ȡclientVersionResult���Ե�ֵ��
   *
   * @return possible object is {@link String }
   */
  public String getClientVersionResult() {
    return clientVersionResult;
  }

  /**
   * ����clientVersionResult���Ե�ֵ��
   *
   * @param value allowed object is {@link String }
   */
  public void setClientVersionResult(String value) {
    this.clientVersionResult = value;
  }

}
