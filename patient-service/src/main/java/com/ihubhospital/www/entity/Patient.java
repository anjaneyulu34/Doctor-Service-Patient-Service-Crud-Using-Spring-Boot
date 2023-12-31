package com.ihubhospital.www.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="patient_details")
public class Patient {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int patientId;
	private String patientName;
	private String disease;
	public Patient() {
		super();
	}
	public Patient(int patientId, String patientName, String disease) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.disease = disease;
	}
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
	
}
