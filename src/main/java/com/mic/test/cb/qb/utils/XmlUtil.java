package com.mic.test.cb.qb.utils;

import java.io.StringReader;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;

public class XmlUtil {

  public static <T> T unmarshall(String xmlString, Class<T> classs) throws JAXBException {
    JAXBContext context = JAXBContext.newInstance(classs);
    Unmarshaller unmarshaller = context.createUnmarshaller();
    return (T) unmarshaller.unmarshal(new StringReader(xmlString));
  }


  public static Node getRootNodeFromXml(String xmlString)
      throws Exception {
    Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder()
        .parse(new InputSource(new StringReader(xmlString)));
    return document.getDocumentElement();
  }

}
