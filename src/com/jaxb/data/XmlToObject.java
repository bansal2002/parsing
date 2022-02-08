package com.jaxb.data;

import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class XmlToObject {

	public static void main(String[] args) {
		String xmlString = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>" +
				"<car>" + "    <modalName>BMW X5</modalName>" + "    <companyName>bmw</companyName>"
			+ "    <color>black</color>" + "</car>";


		JAXBContext jaxbContext;
		try {
			jaxbContext = JAXBContext.newInstance(Car.class);

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

			Car car = (Car) jaxbUnmarshaller.unmarshal(new StringReader(xmlString));

			System.out.println(car.getColor());
			System.out.println(car.getCompanyName());
			System.out.println(car.getModalName());
			
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
}
