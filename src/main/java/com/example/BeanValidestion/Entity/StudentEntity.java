package com.example.BeanValidestion.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="Student")
public class StudentEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@NotEmpty(message = "Employee name shoud not null or emty")
	@Size(max = 10,min = 4,message = "Employee name shoud be min 4 max 10")
	private String name;
	@NotEmpty(message = "Employee name shoud not null or emty")
	@Size(max = 10,min = 4,message = "Employee name shoud be min 4 max 10")
	private String school;
	private int fee;
	
	
	public int getid() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}


	
	
	

}
