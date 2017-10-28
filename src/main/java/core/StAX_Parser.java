package core;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

public class StAX_Parser {
    public static void main(String[] args) throws XMLStreamException, IOException {

	URL url = new URL("http://alex.academy/ebay.xml");
	
	InputStream in = url.openStream();

	XMLInputFactory factory = XMLInputFactory.newInstance();
	XMLStreamReader reader = factory.createXMLStreamReader(in);
	int eventType = reader.getEventType();

	while (reader.hasNext()) {

	    eventType = reader.next();
	   
	    parseThroughElems("element_01", 0, reader, eventType);
	    parseThroughElems("element_02", 1, reader, eventType);
	    parseThroughElems("element_03", 2, reader, eventType);
	    parseThroughElems("element_04", 3, reader, eventType);
	    parseThroughElemsWithAttr("element_05", 4, reader, eventType);
	    
	}
    }

    private static void parseThroughElems(String elem, int tc, XMLStreamReader reader, int eventType)
	    throws XMLStreamException {
	if (eventType == XMLStreamReader.START_ELEMENT) {
	    if (reader.getLocalName() == getEl(elem)) {
		System.out.println(TestDataStorage.getTC()[tc] + reader.getElementText());
	    }
	}
    }
    private static void parseThroughElemsWithAttr(String elem, int tc, XMLStreamReader reader, int eventType)
	    throws XMLStreamException {
	if (eventType == XMLStreamReader.START_ELEMENT) {
	    if (reader.getLocalName() == getEl(elem)) {
		System.out.println(TestDataStorage.getTC()[tc] + reader.getAttributeValue(0));
	    }
	}
    }
   
    private static String getEl(String elem) {
	return TestDataStorage.getElemlist().get(elem);
    }
}