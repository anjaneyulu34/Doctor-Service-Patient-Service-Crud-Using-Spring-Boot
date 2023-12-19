package com.ihubhospital.www.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ihubhospital.www.entity.Doctor;
import com.ihubhospital.www.service.DoctorService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/ihub")
public class DoctorController {

	@Autowired
	private DoctorService doctService;
	
	@PostMapping("/doctor")
	public Doctor addDoctor(@RequestBody Doctor doctor) {
		return doctService.addDoctor(doctor);
	}
	
	@GetMapping("/doctor")
	public List<Doctor> getDoctors() {
		return doctService.getDoctors();
	}
	@GetMapping("/doctor/{id}")
	public Doctor getDoctor(@PathVariable int id) {
		
	    return doctService.getDoctor(id);
	}
	
	@DeleteMapping("/doctor/{id}")
	public String removeDoctor(@PathVariable int id) {
		return doctService.removeDoctor(id);
	}
	@PutMapping("/doctor")
	public String updateDoctor(@RequestBody Doctor doctor) {
		return doctService.updateDoctor(doctor);
	}
}
