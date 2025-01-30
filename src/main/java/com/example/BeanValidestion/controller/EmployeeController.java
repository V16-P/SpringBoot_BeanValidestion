package com.example.BeanValidestion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.BeanValidestion.Entity.StudentEntity;
import com.example.BeanValidestion.Repository.StudentRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
	
	@Autowired
	private StudentRepository  studentRepository;
	@PostMapping("/save")
	public StudentEntity saveEmp(@Valid @RequestBody StudentEntity student) {
		return studentRepository.save(student);
	}
	
	

}
