
package HospitalXML;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;



public class DomParserDTD {

	public static void main(String[] args) throws SAXException, IOException {
		
		boolean valid = true;
		
		try {
		String filename = "C:/Users/Josh/Desktop/HTML/HW3_3/src/HospitalXML/Hospital_XML.xml";
		parse(filename);
		}
		catch (ParserConfigurationException e) {
			System.out.println("PARSE:SAXException");
			valid = false;
		}
		catch (SAXException f) {
			System.out.println("SAXException");
			valid = false;
		}
		catch (IOException g){			
			System.out.println("IO ISSUE");
			valid = false;
		}
		
		if(valid == true)
			System.out.println("XML file is valid per the DTD");
		else
			System.out.println("XML file is not valid per the DTD");
		

	}
	public static void parse(String file) throws ParserConfigurationException, SAXException, IOException   {
		
		int i = 0;
		DocumentBuilderFactory dtdParse = DocumentBuilderFactory.newInstance();
		dtdParse.setValidating(true);
		DocumentBuilder input  = dtdParse.newDocumentBuilder();
		input.setErrorHandler(new org.xml.sax.ErrorHandler() {

			
			public void warning(SAXParseException exception) throws SAXException {
								throw exception;
				
			}

			public void error(SAXParseException exception) throws SAXException {
				throw exception;
				
			}

			public void fatalError(SAXParseException exception) throws SAXException {
				throw exception;
				
			}
		
		});
				
				
		
	
}
}
