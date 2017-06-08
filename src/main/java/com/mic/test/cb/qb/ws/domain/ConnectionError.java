
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
 *         &lt;element name="ticket" type="{http://www.w3.org/2001/XMLSchema}string"
 * minOccurs="0"/&gt;
 *         &lt;element name="hresult" type="{http://www.w3.org/2001/XMLSchema}string"
 * minOccurs="0"/&gt;
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string"
 * minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "ticket",
    "hresult",
    "message"
})
@XmlRootElement(name = "connectionError")
public class ConnectionError {

  protected String ticket;
  protected String hresult;
  protected String message;

  /**
   * ��ȡticket���Ե�ֵ��
   *
   * @return possible object is {@link String }
   */
  public String getTicket() {
    return ticket;
  }

  /**
   * ����ticket���Ե�ֵ��
   *
   * @param value allowed object is {@link String }
   */
  public void setTicket(String value) {
    this.ticket = value;
  }

  /**
   * ��ȡhresult���Ե�ֵ��
   *
   * @return possible object is {@link String }
   */
  public String getHresult() {
    return hresult;
  }

  /**
   * ����hresult���Ե�ֵ��
   *
   * @param value allowed object is {@link String }
   */
  public void setHresult(String value) {
    this.hresult = value;
  }

  /**
   * ��ȡmessage���Ե�ֵ��
   *
   * @return possible object is {@link String }
   */
  public String getMessage() {
    return message;
  }

  /**
   * ����message���Ե�ֵ��
   *
   * @param value allowed object is {@link String }
   */
  public void setMessage(String value) {
    this.message = value;
  }

}
