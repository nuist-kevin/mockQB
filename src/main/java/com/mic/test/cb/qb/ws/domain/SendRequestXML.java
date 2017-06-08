
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
 *         &lt;element name="strHCPResponse" type="{http://www.w3.org/2001/XMLSchema}string"
 * minOccurs="0"/&gt;
 *         &lt;element name="strCompanyFileName" type="{http://www.w3.org/2001/XMLSchema}string"
 * minOccurs="0"/&gt;
 *         &lt;element name="qbXMLCountry" type="{http://www.w3.org/2001/XMLSchema}string"
 * minOccurs="0"/&gt;
 *         &lt;element name="qbXMLMajorVers" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="qbXMLMinorVers" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "ticket",
    "strHCPResponse",
    "strCompanyFileName",
    "qbXMLCountry",
    "qbXMLMajorVers",
    "qbXMLMinorVers"
})
@XmlRootElement(name = "sendRequestXML")
public class SendRequestXML {

  protected String ticket;
  protected String strHCPResponse;
  protected String strCompanyFileName;
  protected String qbXMLCountry;
  protected int qbXMLMajorVers;
  protected int qbXMLMinorVers;

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
   * ��ȡstrHCPResponse���Ե�ֵ��
   *
   * @return possible object is {@link String }
   */
  public String getStrHCPResponse() {
    return strHCPResponse;
  }

  /**
   * ����strHCPResponse���Ե�ֵ��
   *
   * @param value allowed object is {@link String }
   */
  public void setStrHCPResponse(String value) {
    this.strHCPResponse = value;
  }

  /**
   * ��ȡstrCompanyFileName���Ե�ֵ��
   *
   * @return possible object is {@link String }
   */
  public String getStrCompanyFileName() {
    return strCompanyFileName;
  }

  /**
   * ����strCompanyFileName���Ե�ֵ��
   *
   * @param value allowed object is {@link String }
   */
  public void setStrCompanyFileName(String value) {
    this.strCompanyFileName = value;
  }

  /**
   * ��ȡqbXMLCountry���Ե�ֵ��
   *
   * @return possible object is {@link String }
   */
  public String getQbXMLCountry() {
    return qbXMLCountry;
  }

  /**
   * ����qbXMLCountry���Ե�ֵ��
   *
   * @param value allowed object is {@link String }
   */
  public void setQbXMLCountry(String value) {
    this.qbXMLCountry = value;
  }

  /**
   * ��ȡqbXMLMajorVers���Ե�ֵ��
   */
  public int getQbXMLMajorVers() {
    return qbXMLMajorVers;
  }

  /**
   * ����qbXMLMajorVers���Ե�ֵ��
   */
  public void setQbXMLMajorVers(int value) {
    this.qbXMLMajorVers = value;
  }

  /**
   * ��ȡqbXMLMinorVers���Ե�ֵ��
   */
  public int getQbXMLMinorVers() {
    return qbXMLMinorVers;
  }

  /**
   * ����qbXMLMinorVers���Ե�ֵ��
   */
  public void setQbXMLMinorVers(int value) {
    this.qbXMLMinorVers = value;
  }

}
