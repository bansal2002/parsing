package com.jaxb.data;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Cars")
@XmlAccessorType (XmlAccessType.FIELD)
public class Cars {

	@XmlElement(name = "Car")
	private List<Car> cars = null;

	public List<Car> getCars() {
		return cars;
	}

	public void setCar(List<Car> car) {
		this.cars = cars;
	}
	
	
}
