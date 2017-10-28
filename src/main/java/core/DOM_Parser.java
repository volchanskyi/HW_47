package core;

import javax.xml.parsers.*;
import org.w3c.dom.*;

public class DOM_Parser {

	public static void main(String[] args) throws Throwable, Exception,
			ParserConfigurationException {

		String url = "http://alex.academy/ebay.xml";

		String node = "kadu-response";

		String element_01 = "orig-kw";
		String element_02 = "engine";
		String element_03 = "kadu-version";
		String element_04 = "response-time";
		String element_05 = "deals";
		String attribute_01 = "count";

		// Get the DOM Builder Factory
		DocumentBuilderFactory f = DocumentBuilderFactory.newInstance();

		// Get the DOM Builder
		DocumentBuilder b = f.newDocumentBuilder();

		// Load and Parse the XML document contains the complete XML as a Tree.
		Document doc = b.parse(url);

		// Optional
		doc.getDocumentElement().normalize();

		// Parsing elements
		System.out.println(TestDataStorage.getTC()[0] + ((Element) doc.getElementsByTagName(node).item(0)).getElementsByTagName(element_01).item(0).getChildNodes().item(0).getNodeValue());
		System.out.println(TestDataStorage.getTC()[1] + ((Element) doc.getElementsByTagName(node).item(0)).getElementsByTagName(element_02).item(0).getChildNodes().item(0).getNodeValue());
		System.out.println(TestDataStorage.getTC()[2] + ((Element) doc.getElementsByTagName(node).item(0)).getElementsByTagName(element_03).item(0).getChildNodes().item(0).getNodeValue());
		System.out.println(TestDataStorage.getTC()[3] + ((Element) doc.getElementsByTagName(node).item(0)).getElementsByTagName(element_04).item(0).getChildNodes().item(0).getNodeValue());
			
		// Parsing attribute
		System.out.println(TestDataStorage.getTC()[4] + ((Element) doc.getElementsByTagName(element_05).item(0)).getAttribute(attribute_01).trim());
	}
}