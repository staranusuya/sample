package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Akhiil {

	public int age;
	public String name;
	public String schoolName;
	@Autowired
	AnivRaksan a;
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
public void show() {
	
	System.out.println("Hi Akhiil");
	a.beauty();
}
	public Akhiil() {
		// TODO Auto-generated constructor stub
	}

}
