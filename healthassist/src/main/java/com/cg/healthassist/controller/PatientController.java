package com.cg.healthassist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.healthassist.entity.Patient;
import com.cg.healthassist.repository.PatientRepository;
import com.cg.healthassist.service.PatientService;


@RestController
public class PatientController {
	@Autowired
	private PatientService patService;
	
	
	
	@Autowired
	private PatientRepository patRepo;
	
	
	
	@PostMapping("/patients/newpat")
	public Patient createPatient(@RequestBody Patient patient) {
	
	return patService.createPatient(patient);
	}
	
	
}
