package com.hcl.xmlprojects;
import java.io.*;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.*;
import org.xml.sax.SAXException;

public class Xsd {
	public static void main(String[] args) throws SAXException, IOException {
        SchemaFactory factory = 
            SchemaFactory.newInstance("http://www.w3.org/2001/XMLSchema");
        
        File schemaLocation = new File("C:/MavenProjects(HCL-Training)/XmlDemo/src/main/java/com/hcl/xmlprojects/Emp.xsd");
        Schema schema = factory.newSchema(schemaLocation);
        Validator validator = schema.newValidator();
        Source source = new StreamSource("C:/MavenProjects(HCL-Training)/XmlDemo/src/main/java/com/hcl/xmlprojects/Emp.xml");
        
        try {
            validator.validate(source);
            System.out.println(" is valid.");
        }
        catch (SAXException ex) {
            System.out.println( " is not valid because ");
            System.out.println(ex.getMessage());
        }  
        
	}
}