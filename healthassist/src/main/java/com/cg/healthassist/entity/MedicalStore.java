package com.cg.healthassist.entity;
import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

import java.util.List;

import org.hibernate.annotations.GeneratorType;
import org.springframework.stereotype.Component;

/**
 * Creates a medicalstore table
 */
@Component
@Entity
public class MedicalStore {
	
	//Id of the medical store

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long medicalStoreId;
	
	//Name of the medical store.
	
	private String medicalStoreName;
	
	//Phone number of the medical store.
	
	private long phoneNumber;
	
	//Address of the medical store.
	
	private String address;
	
	//List of medicines available in medical store.
	
	@ElementCollection(fetch = FetchType.EAGER)
	@JoinTable(name="medicines",joinColumns = @JoinColumn(name="MedicalStore_Id"))
	private List<Medicine> medicineList;
	
	//Name of the chemist handling medical store.
	
	private String chemistName;
	
	public MedicalStore() {
		super();
	}
	
	//Create an instance of medical store with given parameters.
	public MedicalStore(String medicalStoreName, long phoneNumber, String address, List<Medicine> medicineList,
			String chemistName) {
		super();
		this.medicalStoreName = medicalStoreName;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.medicineList = medicineList;
		this.chemistName = chemistName;
	}
	
	
	//@return the id of the medical store.
	
	public long getMedicalStoreId() {
		return medicalStoreId;
	}

    // @return the name of the medical store.
	
	public String getMedicalStoreName() {
		return medicalStoreName;
	}
	
	//Set the name of the medical store.
	
	public void setMedicalStoreName(String medicalStoreName) {
		this.medicalStoreName = medicalStoreName;
	}
	
	//return the phone number of medical store.
	
	public long getPhoneNumber() {
		return phoneNumber;
	}
	
	//Set the phone number of the medical store.
	
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	//@return the address of the medical store
	
	public String getAddress() {
		return address;
	}
	
	//Set the address of the medical store.
	
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	//@return the list of medicine available in medical store.
	
	public List<Medicine> getMedicineList() {
		return medicineList;
	}
	
	//Set all the medicine available in medical store.
	
	public void setMedicineList(List<Medicine> medicineList) {
		this.medicineList = medicineList;
	}
	
	//@return the chemist name of the medical store.
	
	public String getChemistName() {
		return chemistName;
	}

	//Set the chemist name of the medical store.
	
	public void setChemistName(String chemistName) {
		this.chemistName = chemistName;
	}
	@Override
	public String toString() {
		return "MedicalStore [medicalStoreName=" + medicalStoreName + ", phoneNumber=" + phoneNumber + ", address="
				+ address + ", chemistName=" + chemistName + "]";
	}
	
	
}

