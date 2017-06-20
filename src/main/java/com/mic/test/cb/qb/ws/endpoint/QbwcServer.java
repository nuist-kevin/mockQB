package com.mic.test.cb.qb.ws.endpoint;

import com.mic.test.cb.qb.ws.domain.ArrayOfString;

import com.mic.test.cb.qb.xml.domain.QBXML;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.Endpoint;
import javax.xml.ws.Holder;
import java.util.ArrayList;
import java.util.List;

@WebService(endpointInterface = "com.mic.test.cb.qb.ws.endpoint.IQbwcServer", serviceName = "qbwcServer",
    targetNamespace = "http://developer.intuit.com/")
public class QbwcServer implements IQbwcServer {

  @Override
  public String connectionError(String ticket, String hresult, String message) {
    return null;
  }

  @Override
  public String sendRequestXML(String ticket, String strHCPResponse,
      String strCompanyFileName, String qbXMLCountry,
      int qbXMLMajorVers, int qbXMLMinorVers) {
    System.out.println("ticket: " + ticket);
    System.out.println("strHCPResponse: " + strHCPResponse);
    System.out.println("qbXMLCountry: " + qbXMLCountry);
    System.out.println("qbXMLMajorVers: " + qbXMLMajorVers);
    System.out.println("qbXMLMinorVers: " + qbXMLMinorVers);

    return
        "<?xml version=\"1.0\" encoding=\"utf-8\"?><?qbxml version=\"13.0\"?><QBXML><QBXMLMsgsRq onError=\"stopOnError\">\n"
            + "<SalesOrderQueryRq requestID=\"4ba4bf5d-6192-4ca9-9943-f102bde9209d\">\n"
            + "  <ModifiedDateRangeFilter>\n"
            + "    <FromModifiedDate>2017-06-15T16:03:06+08:00</FromModifiedDate>\n"
            + "  </ModifiedDateRangeFilter>\n"
            + "  <IncludeLineItems>true</IncludeLineItems>\n"
            + "</SalesOrderQueryRq>";
  }

  @Override
  public String serverVersion() {
    return null;
  }

  @Override
  public String getLastError(String ticket) {
    return null;
  }

  @Override
  public ArrayOfString authenticate(String strUserName, String strPassword) {
    ArrayOfString arrayOfString = new ArrayOfString();
    List<String> results = new ArrayList<>();
    results.add("143251sdfg45345");
    results.add("");
    arrayOfString.setAuthenticateReturn(results);
    return arrayOfString;
  }

  @Override
  public int receiveResponseXML(String ticket, String response, String hresult, String message) {
    return 50;
  }

  @Override
  public String clientVersion(String strVersion) {
    return "O:" + strVersion;
  }

  @Override
  public String closeConnection(String ticket) {
    return null;
  }


  public static void main(String[] args) {
    System.out.println("web service start");
    QbwcServer qbwcServer = new QbwcServer();

    String address = "http://192.168.23.177:8080/services/qbwcServer";
    Endpoint.publish(address, qbwcServer);

    System.out.println("web service started");
  }


}
