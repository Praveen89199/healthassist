package com.cg.healthassist.entity;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.stereotype.Component;
@Component
@Entity
public class Hospital {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long hospitalId;
	private String hospitalName;
	private String hospitalAddress;
	private long hospitalPhNO;
	private String hospitalSpeciality;
	
	//List of Hospitals.
	
	@OneToMany
	private List<Hospital> hospitalList = new ArrayList<>();
	
	//Create an instance of hospital with given parameter.
	
	public Hospital(String hospitalName, String hospitalAddress, long hospitalPhNO, String hospitalSpeciality) {
		super();
		this.hospitalName = hospitalName;
		this.hospitalAddress = hospitalAddress;
		this.hospitalPhNO = hospitalPhNO;
		this.hospitalSpeciality = hospitalSpeciality;
	}
	public Hospital() {
		super();
	}
	
	//return hospital specialty.
	
	public String getHospitalSpeciality() {
		return hospitalSpeciality;
	}
	
	//set the hospital speciality
	
	public void setHospitalSpeciality(String hospitalSpeciality) {
		this.hospitalSpeciality = hospitalSpeciality;
	}
	
	// @return the hospital ID
	
	public long getHospitalId() {
		return hospitalId;
	}
	
	//Set the hospital ID
	
	public void setHospitalId(long hospitalId) {
		this.hospitalId = hospitalId;
	}
	
	//@return hospital name 
	
	public String getHospitalName() {
		return hospitalName;
	}
	
	//Set the name of the hospital.
	
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}
	
	//@return the hospital address
	
	public String getHospitalAddress() {
		return hospitalAddress;
	}
	
	 //Set the hospital address
	
	public void setHospitalAddress(String hospitalAddress) {
		this.hospitalAddress = hospitalAddress;
	}
	
	//@return the hospital phone number
	
	public long getHospitalPhNO() {
		return hospitalPhNO;
	}
	
	//set the phonenumber of hospital.
	
	public void setHospitalPhNO(long hospitalPhNO) {
		this.hospitalPhNO = hospitalPhNO;
	}
	
	//return the map of hospitals
	public List<Hospital> getHospitalList() {
		return hospitalList;
	}
	
	//Set the new hospital id and hospital name into the hospital list
	
	public void setHospitalList(List<Hospital> hospitalList) {
		this.hospitalList=hospitalList;
	}
	@Override
	public String toString() {
		return "Hospital [hospitalName=" + hospitalName + ", hospitalAddress="
				+ hospitalAddress + ", hospitalPhNO=" + hospitalPhNO + ", hospitalSpeciality=" + hospitalSpeciality
				+ "]";
	}
	
	
}