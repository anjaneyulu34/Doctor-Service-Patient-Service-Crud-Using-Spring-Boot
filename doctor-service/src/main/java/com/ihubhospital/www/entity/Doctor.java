package com.ihubhospital.www.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="doctor_info")
public class Doctor {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="doctor_id")
	private int docterId;
	@Column(name="doctor_name")
	private String docterName;
	@Column(name="specialist")
	private String specialist;
	public Doctor() {
		super();
	}
	public Doctor(int docterId, String docterName, String specialist) {
		super();
		this.docterId = docterId;
		this.docterName = docterName;
		this.specialist = specialist;
	}
	public int getDocterId() {
		return docterId;
	}
	public void setDocterId(Integer docterId) {
		this.docterId = docterId;
	}
	public String getDocterName() {
		return docterName;
	}
	public void setDocterName(String docterName) {
		this.docterName = docterName;
	}
	public String getSpecialist() {
		return specialist;
	}
	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}
	
	
}
