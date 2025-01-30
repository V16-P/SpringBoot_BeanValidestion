package com.example.BeanValidestion.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.BeanValidestion.Entity.StudentEntity;



@Repository
public interface StudentRepository extends JpaRepository<StudentEntity, Integer>{
	
// StudentEntity findByname(String name);
//
//List <StudentEntity> findByfee(int fee);
//
//
//List <StudentEntity> findByNameAndFee(String name,int fee);
//
//StudentEntity findDistinctByname(String name);



}
