package com.tieuluan.struts2.utils;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
/**
 * 
 * @author ngant
 * lay gia tri cua node tuong ung truyen vao
 * ket qua la List String
 */
public class XmlParser {

  // Note: The default XPath expression "/" selects
  // all text within the XML.	
  private static String UPDATED_EX = "/root/ratelist/@updated";
  private static String UNIT_EX = "/root/ratelist/@unit";
  
  private static String RATELIST_EX = "/root/ratelist/city[1]";
  private static String RATELIST_BUY_EX = "/root/ratelist/city[1]/item/@buy";
  private static String RATELIST_SELL_EX = "/root/ratelist/city[1]/item/@sell";
  private static String RATELIST_TYPE_EX = "/root/ratelist/city[1]/item/@type";
  public static void main(String[] args) throws Exception {
	 URLReader reader =  new  URLReader();
	 StringBuilder source = reader.readDataFromUrl("http://www.sjc.com.vn/xml/tygiavang.xml");
    	List<String> lstUpdate = processResponse(source,UPDATED_EX);
		System.out.println(lstUpdate.get(0));
		
		List<String> lstBuy = processResponse(source,RATELIST_BUY_EX);
		for (String string : lstBuy) {
			System.out.println(string);
		}

  }

  public static List<String> processResponse(StringBuilder source, String xpathString) {
	XPathFactory factory = XPathFactory.newInstance();
    XPath xpath = factory.newXPath();
    List<String> lstNode = new ArrayList<String>(); 
    try {
      try {
		InputStream inputStream = new ByteArrayInputStream(source.toString().getBytes("UTF-8"));
		InputSource inputXml = new InputSource(inputStream);
		NodeList nodes = (NodeList) xpath.evaluate(xpathString, inputXml, XPathConstants.NODESET);
		for (int i = 0, n = nodes.getLength(); i < n; i++) {
			String nodeString = nodes.item(i).getTextContent();
			lstNode.add(nodeString);
		}
		
	} catch (UnsupportedEncodingException e) {
		e.printStackTrace();
	}
      
    } catch (XPathExpressionException ex) {
	  System.out.print("XPath Error");
    }
    return lstNode;
  }
  
}
