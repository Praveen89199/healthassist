package com.cg.healthassist.entity;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;
@Component
@Embeddable
public class Medicine {
	
	private String name;
	
	private double price;
	
	private String companyName;
	
	private String expiryDate;
	
	private String manufacturingDate;
	
	public Medicine() {
		super();
	}
	
	
	public Medicine(String name, double price, String companyName, String expiryDate, String manufacturingDate) {
		super();
		this.name = name;
		this.price = price;
		this.companyName = companyName;
		this.expiryDate = expiryDate;
		this.manufacturingDate = manufacturingDate;
	}
	
	
	public String getName() {
		return name;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public double getPrice() {
		return price;
	}
	
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	public String getCompanyName() {
		return companyName;
	}
	
	
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	
	public String getExpiryDate() {
		return expiryDate;
	}
	
	
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	
	public String getManufacturingDate() {
		return manufacturingDate;
	}
	
	
	public void setManufacturingDate(String manufacturingDate) {
		this.manufacturingDate = manufacturingDate;
	}
	
	@Override
	public String toString() {
		return "Medicine [name=" + name + ", price=" + price + ", companyName=" + companyName + ", expiryDate="
				+ expiryDate + ", manufacturingDate=" + manufacturingDate + "]";
	}
	
	
	
	

}

