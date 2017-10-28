package core;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class DOM_XPath_Parser {

    public static void main(String[] args)
	    throws Throwable, Exception, ParserConfigurationException, SAXException, IOException, TransformerException {
	String url = "http://alex.academy/ebay.xml";
	String xpath_element_01 = "//server/orig-kw";
	String xpath_element_02 = "//server/engine";
	String xpath_element_03 = "//server/kadu-version";
	String xpath_element_04 = "//response-time";
	String xpath_element_05 = "//merchants/merchant[1]/store-url";
	String xpath_element_06 = "//merchants/merchant/phone";
	String xpath_element_07 = "//deals/deal/bid";
	String xpath_element_08 = "//deals/deal/sku";

	String xpath_attribute_01 = "//deals/@count";
	String xpath_attribute_02 = "//display-items/@count";
	String xpath_attribute_03 = "//merchants/@count";
	String xpath_attribute_04 = "//phone[text()]";
	String xpath_attribute_05 = "//bid/@count";
	String xpath_attribute_06 = "//sku/@count";
	String xpath_attribute_07 = "//raw-bid/@count";
	String xpath_attribute_08 = "//bid/@count";

	// Get the DOM Builder Factory
	DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
	// Get the DOM Builder
	DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
	// Load and Parse the XML document contains the complete XML as a Tree.
	Document document = docBuilder.parse(url);
	// xmlIterator(document.getDocumentElement());

	// Optional
	document.getDocumentElement().normalize();

	// xPath
	XPathFactory xPathfactory = XPathFactory.newInstance();
	XPath xpath = xPathfactory.newXPath();

	String element_01 = xpath.compile(xpath_element_01).evaluate(document);
	String element_02 = xpath.compile(xpath_element_02).evaluate(document);
	String element_03 = xpath.compile(xpath_element_03).evaluate(document);
	String element_04 = xpath.compile(xpath_element_04).evaluate(document);
	String element_05 = xpath.compile(xpath_element_05).evaluate(document);
	String element_06 = xpath.compile(xpath_element_06).evaluate(document);
	String element_07 = xpath.compile(xpath_element_07).evaluate(document);
	String element_08 = xpath.compile(xpath_element_08).evaluate(document);

	String attribute_01 = xpath.compile(xpath_attribute_01).evaluate(document);
	String attribute_02 = xpath.compile(xpath_attribute_02).evaluate(document);
	String attribute_03 = xpath.compile(xpath_attribute_03).evaluate(document);
	String attribute_04 = xpath.compile(xpath_attribute_04).evaluate(document);
	String attribute_05 = xpath.compile(xpath_attribute_05).evaluate(document);
	String attribute_06 = xpath.compile(xpath_attribute_06).evaluate(document);
	String attribute_07 = xpath.compile(xpath_attribute_07).evaluate(document);
	String attribute_08 = xpath.compile(xpath_attribute_08).evaluate(document);

	System.out.println(TestDataStorage.getTC()[0] + element_01);
	System.out.println(TestDataStorage.getTC()[1] + element_02);
	System.out.println(TestDataStorage.getTC()[2] + element_03);
	System.out.println(TestDataStorage.getTC()[3] + element_04);
	System.out.println(TestDataStorage.getTC()[4] + attribute_01);
	System.out.println(TestDataStorage.getTC()[5] + element_05);
	System.out.println(TestDataStorage.getTC()[6] + element_06);
	System.out.println(TestDataStorage.getTC()[7] + element_07);
	System.out.println(TestDataStorage.getTC()[8] + element_08);
	System.out.println(TestDataStorage.getTC()[9] + attribute_02);
	System.out.println(TestDataStorage.getTC()[10] + attribute_03);
	System.out.println(TestDataStorage.getTC()[11] + attribute_04);
	System.out.println(TestDataStorage.getTC()[12] + attribute_05);
	System.out.println(TestDataStorage.getTC()[13] + attribute_06);
	System.out.println(TestDataStorage.getTC()[14] + attribute_07);
	System.out.println(TestDataStorage.getTC()[15] + attribute_08);
	

    }
    // public static void xmlIterator(Node node) {
    // // do something with the current node instead of System.out
    // System.out.println(node.getNodeName().concat("url"));
    //
    // NodeList nodeList = node.getChildNodes();
    // for (int i = 0; i < nodeList.getLength(); i++) {
    // Node currentNode = nodeList.item(i);
    // if (currentNode.getNodeType() == Node.ELEMENT_NODE) {
    // // calls this method for all the children which is Element
    // xmlIterator(currentNode);
    // }
    // }
    // }
}