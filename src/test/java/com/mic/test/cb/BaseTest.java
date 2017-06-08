package com.mic.test.cb;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.ws.client.core.WebServiceTemplate;

/**
 * Created by caiwen on 2017/6/6.
 */
@ContextConfiguration({"classpath:testApplicationContext.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class BaseTest {

  protected String WSDLLOCATION = "http://localhost:8080/services/qbwcServer?wsdl";

  protected String USERNAME = "gzc";
  protected String PASSWORD = "pass";
  protected String ticket = "";


  @Autowired
  protected WebServiceTemplate webServiceTemplate;


}
