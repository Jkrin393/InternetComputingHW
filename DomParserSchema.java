package HospitalXML;

import java.io.File;
import java.io.IOException;

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.xml.sax.SAXException;



public class DomParserSchema {

	public static void main(String[] args) throws SAXException {
		
		boolean valid = true;
		
		
		String filename = "C:/Users/Josh/Desktop/HTML/HW3_3/src/HospitalXML/Hospital_XML_schemalink.xml";
		String schema = "C:/Users/Josh/Desktop/HTML/HW3_3/src/HospitalXML/HospitalXMLSchema.xsd";
		valid = isValid(filename,schema);
	
				
		
		if(valid == true)
			System.out.println("XML file is valid per the Schema");
		else
			System.out.println("XML file is not valid per the schema");
	}
	
	


public static boolean isValid(String xmlFile, String xsdFile) throws SAXException {
	
	try {
	SchemaFactory schemaParse = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
	Schema hospitalSchema = schemaParse.newSchema(new File(xsdFile));
	Validator xmlValid = hospitalSchema.newValidator();
	xmlValid.validate(new StreamSource(new File(xmlFile)));
	}
	/*catch (SAXException f) {
		System.out.println("SAX error in the method");
		return false;
	}*/ catch (IOException e) {
		System.out.println("IO Issue");
		return false;
	}
	return true;
	
	
			
}
	
	
}

	


