package com.ihubhospital.www.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ihubhospital.www.entity.Patient;
import com.ihubhospital.www.exception.ResourceNotFoundException;
import com.ihubhospital.www.repository.PatientRepository;

@Service
public class PatientService {
	
	@Autowired
	private PatientRepository patientRepo;

	public Patient addPatient(Patient patient) {
		
		return patientRepo.save(patient);
	}

	public List<Patient> getPatient() {
		
		return patientRepo.findAll();
	}

	public Patient getPatient(int id) {
		
		return patientRepo.findById(id).orElseThrow(()->new ResourceNotFoundException("Id not found"));
	}

	public String removePatient(int id) {
		
		Patient patient= patientRepo.findById(id).orElseThrow(()->new ResourceNotFoundException("Id doesnot exist"));
		patientRepo.delete(patient);
		return "patient info updated successfully";
		
	}

	public String updatePatient(Patient patient) {
		 
		Patient patient1=patientRepo.findById(patient.getPatientId()).get();
		
		patient1.setPatientName(patient.getPatientName());
		  patient1.setDisease(patient.getDisease());
		  patientRepo.save(patient1);
	    return "Customer edited Successfully";
		
	}

}
