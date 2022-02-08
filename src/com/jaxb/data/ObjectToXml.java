package com.jaxb.data;

import java.io.FileOutputStream;  

import javax.xml.bind.JAXBContext;  
import javax.xml.bind.Marshaller;  
  
  
public class ObjectToXml {  
public static void main(String[] args) throws Exception{  
    JAXBContext contextObj = JAXBContext.newInstance(Car.class);  
  
    Marshaller marshallerObj = contextObj.createMarshaller();  
    marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);  
  
    Car emp1=new Car("BMW X5",7800000,"diesel","BMW","Black",10);  
      
    marshallerObj.marshal(emp1, new FileOutputStream("employee.xml"));  
    
}  
}  
