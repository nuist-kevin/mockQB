
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
 *         &lt;element name="strVersion" type="{http://www.w3.org/2001/XMLSchema}string"
 * minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "strVersion"
})
@XmlRootElement(name = "clientVersion")
public class ClientVersion {

  protected String strVersion;

  /**
   * ��ȡstrVersion���Ե�ֵ��
   *
   * @return possible object is {@link String }
   */
  public String getStrVersion() {
    return strVersion;
  }

  /**
   * ����strVersion���Ե�ֵ��
   *
   * @param value allowed object is {@link String }
   */
  public void setStrVersion(String value) {
    this.strVersion = value;
  }

}
