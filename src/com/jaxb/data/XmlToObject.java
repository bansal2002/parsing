package com.jaxb.data;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class XmlToObject {

	public static void main(String[] args) {
		/*String xmlString = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>" +
				"<car>" + "    <modalName>BMW X5</modalName>" + "    <companyName>bmw</companyName>"
			+ "    <color>black</color>" + "</car>";*/
		
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(Cars.class);

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

			Cars c = (Cars) jaxbUnmarshaller.unmarshal(new File("employee.xml"));
			
			for(Car v : c.getCars()) {
				System.out.println(v.getColor());
				System.out.println(v.getCompanyName());
			}
			
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
}
