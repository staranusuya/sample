package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Akhiil {

	@Id
	public String firstName;
	public String lastName;
	public int age;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	@Override
	public String toString() {
		return "Akhiil [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
	}
	public void setAge(int age) {
		this.age = age;
	}


}
