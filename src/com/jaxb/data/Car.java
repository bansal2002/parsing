package com.jaxb.data;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;

@XmlRootElement
public class Car {
	
	private String modalName;
	private long price;
	private String fuelType;
	private String companyName;
	private String color;	
	private int mileage;
	
	public Car() {
		super();
	}
	
	public Car(String modalName, long price, String fuelType, String companyName, String color, int mileage) {
		super();
		this.modalName = modalName;
		this.price = price;
		this.fuelType = fuelType;
		this.companyName = companyName;
		this.color = color;
		this.mileage = mileage;
	}
	
	@XmlElement
	public String getModalName() {
		return modalName;
	}
	public void setModalName(String modalName) {
		this.modalName = modalName;
	}
	
	@XmlElement
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	
	@XmlElement
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	
	@XmlElement
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	@XmlElement
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	@XmlElement
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	
	

}
