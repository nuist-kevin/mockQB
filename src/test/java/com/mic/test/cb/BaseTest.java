package com.mic.test.cb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.ws.client.core.WebServiceTemplate;

@ContextConfiguration({"classpath:testApplicationContext.xml"})
public class BaseTest extends AbstractTestNGSpringContextTests {

  protected String WSDLLOCATION = "http://192.168.43.95/services/qbwcServer?wsdl";

  protected String USERNAME = "gzc";
  protected String PASSWORD = "pass";
  protected String ticket = "";


  @Autowired
  protected WebServiceTemplate webServiceTemplate;


}
