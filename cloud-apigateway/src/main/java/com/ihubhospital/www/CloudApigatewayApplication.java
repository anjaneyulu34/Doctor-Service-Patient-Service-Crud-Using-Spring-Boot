package com.ihubhospital.www;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
@EnableHystrix
@EnableDiscoveryClient
public class CloudApigatewayApplication {

	
	@Autowired
	RestTemplate restTemplate;
	
	public static void main(String[] args) {
		SpringApplication.run(CloudApigatewayApplication.class, args);
	}
	@GetMapping("/doctor")
	public String showDoctors()
	{
		String paytmServiceResponse=restTemplate.getForObject("http://localhost:7171/ihub/doctor", String.class);
		
		return paytmServiceResponse;
	}
	@GetMapping("/doctor/{id}")
	public String showDoctors(@PathVariable int id)
	{
		String doctorServiceResponse=restTemplate.getForObject("http://localhost:7171/ihub/doctor/id", String.class);
		
		return doctorServiceResponse;
	}
	@GetMapping("/patient")
	public String showPatient() {
		String patientServiceResponse=restTemplate.getForObject("http://localhost:6161/pd/patient",String.class);
		return patientServiceResponse;
	}
	@GetMapping("/patient/{id}")
	public String showPatientById(@PathVariable int id) {
		String patientServiceResponseById=restTemplate.getForObject("http://localhost:6161/pd/patient/id",String.class);
		return patientServiceResponseById;
	}
	@Bean
	public  RestTemplate    getRestTemplate() {
	
		return new RestTemplate();	
	}

}
