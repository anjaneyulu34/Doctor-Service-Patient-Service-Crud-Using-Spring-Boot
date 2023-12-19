package com.ihubhospital.www.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ihubhospital.www.entity.Patient;
@Repository
public interface PatientRepository extends JpaRepository<Patient,Integer>{

}
