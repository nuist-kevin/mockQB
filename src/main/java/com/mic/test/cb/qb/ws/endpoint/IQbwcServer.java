package com.mic.test.cb.qb.ws.endpoint;

import com.mic.test.cb.qb.ws.domain.ArrayOfString;
import com.mic.test.cb.qb.ws.domain.ObjectFactory;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * Created by caiwen on 2017/6/5.
 */
@WebService(targetNamespace = "http://developer.intuit.com/", name = "qbwcServer")
@XmlSeeAlso({ObjectFactory.class})
public interface IQbwcServer {

  /**
   * This web method facilitates web service to handle connection error between QBWC and QB
   */
  String TARGET_NAMSPACE = "http://developer.intuit.com/";

  @WebMethod(action = "http://developer.intuit.com/connectionError")
  @RequestWrapper(localName = "connectionError", targetNamespace = TARGET_NAMSPACE, className = "com.mic.test.cb.qb.ws.domain.ConnectionError")
  @ResponseWrapper(localName = "connectionErrorResponse", targetNamespace = TARGET_NAMSPACE, className = "com.mic.test.cb.qb.ws.domain.ConnectionErrorResponse")
  @WebResult(name = "connectionErrorResult", targetNamespace = TARGET_NAMSPACE)
  public String connectionError(
      @WebParam(name = "ticket", targetNamespace = TARGET_NAMSPACE)
          String ticket,
      @WebParam(name = "hresult", targetNamespace = TARGET_NAMSPACE)
          String hresult,
      @WebParam(name = "message", targetNamespace = TARGET_NAMSPACE)
          String message
  );

  /**
   * This web method facilitates web service to send request XML to QuickBooks via QBWebConnector
   */
  @WebMethod(action = "http://developer.intuit.com/sendRequestXML")
  @RequestWrapper(localName = "sendRequestXML", targetNamespace = TARGET_NAMSPACE, className = "com.mic.test.cb.qb.ws.domain.SendRequestXML")
  @ResponseWrapper(localName = "sendRequestXMLResponse", targetNamespace = TARGET_NAMSPACE, className = "com.mic.test.cb.qb.ws.domain.SendRequestXMLResponse")
  @WebResult(name = "sendRequestXMLResult", targetNamespace = TARGET_NAMSPACE)
  public String sendRequestXML(
      @WebParam(name = "ticket", targetNamespace = TARGET_NAMSPACE)
          String ticket,
      @WebParam(name = "strHCPResponse", targetNamespace = TARGET_NAMSPACE)
          String strHCPResponse,
      @WebParam(name = "strCompanyFileName", targetNamespace = TARGET_NAMSPACE)
          String strCompanyFileName,
      @WebParam(name = "qbXMLCountry", targetNamespace = TARGET_NAMSPACE)
          String qbXMLCountry,
      @WebParam(name = "qbXMLMajorVers", targetNamespace = TARGET_NAMSPACE)
          int qbXMLMajorVers,
      @WebParam(name = "qbXMLMinorVers", targetNamespace = TARGET_NAMSPACE)
          int qbXMLMinorVers
  );

  @WebMethod(action = "http://developer.intuit.com/serverVersion")
  @RequestWrapper(localName = "serverVersion", targetNamespace = TARGET_NAMSPACE, className = "com.mic.test.cb.qb.ws.domain.ServerVersion")
  @ResponseWrapper(localName = "serverVersionResponse", targetNamespace = TARGET_NAMSPACE, className = "com.mic.test.cb.qb.ws.domain.ServerVersionResponse")
  @WebResult(name = "serverVersionResult", targetNamespace = TARGET_NAMSPACE)
  public String serverVersion();

  @WebMethod(action = "http://developer.intuit.com/getLastError")
  @RequestWrapper(localName = "getLastError", targetNamespace = TARGET_NAMSPACE, className = "com.mic.test.cb.qb.ws.domain.GetLastError")
  @ResponseWrapper(localName = "getLastErrorResponse", targetNamespace = TARGET_NAMSPACE, className = "com.mic.test.cb.qb.ws.domain.GetLastErrorResponse")
  @WebResult(name = "getLastErrorResult", targetNamespace = TARGET_NAMSPACE)
  public String getLastError(
      @WebParam(name = "ticket", targetNamespace = TARGET_NAMSPACE)
          String ticket
  );

  @WebMethod(action = "http://developer.intuit.com/authenticate")
  @RequestWrapper(localName = "authenticate", targetNamespace = TARGET_NAMSPACE, className = "com.mic.test.cb.qb.ws.domain.Authenticate")
  @ResponseWrapper(localName = "authenticateResponse", targetNamespace = TARGET_NAMSPACE, className = "com.mic.test.cb.qb.ws.domain.AuthenticateResponse")
  @WebResult(name = "authenticateResult", targetNamespace = TARGET_NAMSPACE)
  public ArrayOfString authenticate(
      @WebParam(name = "strUserName", targetNamespace = TARGET_NAMSPACE)
          String strUserName,
      @WebParam(name = "strPassword", targetNamespace = TARGET_NAMSPACE)
          String strPassword
  );

  /**
   * This web method facilitates web service to receive response XML from QuickBooks via
   * QBWebConnector
   */
  @WebMethod(action = "http://developer.intuit.com/receiveResponseXML")
  @RequestWrapper(localName = "receiveResponseXML", targetNamespace = TARGET_NAMSPACE, className = "com.mic.test.cb.qb.ws.domain.ReceiveResponseXML")
  @ResponseWrapper(localName = "receiveResponseXMLResponse", targetNamespace = TARGET_NAMSPACE, className = "com.mic.test.cb.qb.ws.domain.ReceiveResponseXMLResponse")
  @WebResult(name = "receiveResponseXMLResult", targetNamespace = TARGET_NAMSPACE)
  public int receiveResponseXML(
      @WebParam(name = "ticket", targetNamespace = TARGET_NAMSPACE)
          String ticket,
      @WebParam(name = "response", targetNamespace = TARGET_NAMSPACE)
          String response,
      @WebParam(name = "hresult", targetNamespace = TARGET_NAMSPACE)
          String hresult,
      @WebParam(name = "message", targetNamespace = TARGET_NAMSPACE)
          String message
  );

  @WebMethod(action = "http://developer.intuit.com/clientVersion")
  @RequestWrapper(localName = "clientVersion", targetNamespace = TARGET_NAMSPACE, className = "com.mic.test.cb.qb.ws.domain.ClientVersion")
  @ResponseWrapper(localName = "clientVersionResponse", targetNamespace = TARGET_NAMSPACE, className = "com.mic.test.cb.qb.ws.domain.ClientVersionResponse")
  @WebResult(name = "clientVersionResult", targetNamespace = TARGET_NAMSPACE)
  public String clientVersion(
      @WebParam(name = "strVersion", targetNamespace = TARGET_NAMSPACE)
          String strVersion
  );

  @WebMethod(action = "http://developer.intuit.com/closeConnection")
  @RequestWrapper(localName = "closeConnection", targetNamespace = TARGET_NAMSPACE, className = "com.mic.test.cb.qb.ws.domain.CloseConnection")
  @ResponseWrapper(localName = "closeConnectionResponse", targetNamespace = TARGET_NAMSPACE, className = "com.mic.test.cb.qb.ws.domain.CloseConnectionResponse")
  @WebResult(name = "closeConnectionResult", targetNamespace = TARGET_NAMSPACE)
  public String closeConnection(
      @WebParam(name = "ticket", targetNamespace = TARGET_NAMSPACE)
          String ticket
  );
}
