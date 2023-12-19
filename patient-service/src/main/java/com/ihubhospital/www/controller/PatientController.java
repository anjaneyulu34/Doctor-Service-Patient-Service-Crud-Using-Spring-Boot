package com.ihubhospital.www.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ihubhospital.www.entity.Patient;
import com.ihubhospital.www.service.PatientService;


@RestController
@RequestMapping("/pd")
public class PatientController {

	@Autowired
	private PatientService patientService;
	
	@PostMapping("/patient")
	public Patient addDoctor(@RequestBody Patient patient) {
		return patientService.addPatient(patient);
	}
	
	@GetMapping("/patient")
	public List<Patient> getDoctors() {
		return patientService.getPatient();
	}
	@GetMapping("/patient/{id}")
	public Patient getDoctor(@PathVariable int id) {
		return patientService.getPatient(id);
	}
	
	@DeleteMapping("/patient/{id}")
	public String removeDoctor(@PathVariable int id) {
		return patientService.removePatient(id);
	}
	
	@PutMapping("/patient")
	public String updateDoctor(@RequestBody Patient patient) {
		return patientService.updatePatient(patient);
	}
}
