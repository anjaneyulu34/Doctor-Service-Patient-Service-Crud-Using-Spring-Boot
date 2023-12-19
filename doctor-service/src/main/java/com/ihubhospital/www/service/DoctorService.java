package com.ihubhospital.www.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ihubhospital.www.entity.Doctor;
import com.ihubhospital.www.exception.ResourceNotFoundException;
import com.ihubhospital.www.repository.DoctorRepository;


@Service
public class DoctorService {

	
	@Autowired
	private DoctorRepository doctRepo;
	
	
	public Doctor addDoctor(Doctor doctor) {
		return doctRepo.save(doctor);
	}
    public List<Doctor> getDoctors() {
		
    	return doctRepo.findAll();
	}
    public Doctor getDoctor(int id) {
		return doctRepo.findById(id).orElseThrow(()->new ResourceNotFoundException("Id not found"));
	}
    public String removeDoctor(int id) {
	    Doctor doctor=doctRepo.findById(id).orElseThrow(()->new ResourceNotFoundException("Id doesnot exist"));
		doctRepo.delete(doctor);
		return "doctor info updated successfully";
	}
    public String updateDoctor(Doctor doctor) {
		Doctor existdoc=doctRepo.findById(doctor.getDocterId()).get();
		existdoc.setDocterName(doctor.getDocterName());
		existdoc.setSpecialist(doctor.getSpecialist());
		doctRepo.save(existdoc);
		return "record deleted successfully";
	}
	

}
