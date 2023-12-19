package com.ihubhospital.www.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ihubhospital.www.entity.Doctor;
@Repository
public interface DoctorRepository extends JpaRepository<Doctor,Integer> {

}
