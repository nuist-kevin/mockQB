package com.mic.test.cb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.ws.client.core.WebServiceTemplate;

/**
 * Created by caiwen on 2017/6/6.
 */
@ContextConfiguration({"classpath:testApplicationContext.xml"})
public class BaseTest extends AbstractTestNGSpringContextTests {

  protected String WSDLLOCATION = "http://localhost:8080/services/qbwcServer?wsdl";

  protected String USERNAME = "gzc";
  protected String PASSWORD = "pass";
  protected String ticket = "";


  @Autowired
  protected WebServiceTemplate webServiceTemplate;


}
