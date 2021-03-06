package com.cg.healthassist.service;

import java.util.List;

import com.cg.healthassist.entity.Doctor;
import com.cg.healthassist.entity.MedicalStore;
import com.cg.healthassist.entity.Patient;

public interface PatientService {
	
	
	
	public Patient createPatient(Patient patient);
	/**
	 * Search the doctors with given specialty in doctor database.
	 * @return the list of doctors if present otherwise an empty list.
	 */
	public List<Doctor> searchDoctor(String speciality);
	/**
	 * Book the appointment for patient with a doctor having given specialty.
	 * @return the information about booking.
	 */
	public String bookDoctorAppointment(String speciality);
	
	/**
	 * Search the medical store on given medicine whether it is present or not.
	 * @return the first medical store in database which has that medicine otherwise return null.
	 */
	public MedicalStore searchMedicalStore(String medicineName);
	
	/**
	 * Based on doctor prescription order the medicine for the patient.
	 * @return the list of successfully ordered medicine otherwise return empty list.
	 */
	public List<String> orderMedicine(String patientUserName);
	
	/**
	 * Upload the prescription given by the doctor to patient.
	 * @return true on successful uploading otherwise return false.
*/
	
	
	public Patient persist(Patient patient);

}
