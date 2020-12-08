package com.cg.healthassist.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.healthassist.entity.Doctor;
import com.cg.healthassist.entity.MedicalStore;
import com.cg.healthassist.entity.Patient;
import com.cg.healthassist.repository.PatientRepository;
import com.cg.healthassist.service.PatientService;
@Service
public class PatientServiceImpl implements PatientService {
	
	@Autowired
	private PatientRepository patRepo;
	
	

	@Override
	public List<Doctor> searchDoctor(String speciality) {
		
return null;
	}

	@Override
	public String bookDoctorAppointment(String speciality) {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public List<String> orderMedicine(String patientUserName) {
		// TODO Auto-generated method stub
		return null;
	}


	
	@Override
	public Patient persist(Patient patient) {
		long patientId = patient.getPatientId();
		Patient.setPatientCredentials(patientId, patient.getPatientUserName());
		return patient;
	}

	@Override
	public MedicalStore searchMedicalStore(String medicineName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Patient createPatient(Patient patient) {
		// TODO Auto-generated method stub
		return patRepo.save(patient);
	}

}
