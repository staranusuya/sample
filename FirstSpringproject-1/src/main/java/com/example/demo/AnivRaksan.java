package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class AnivRaksan {

	public int age;
	public String name;
	
	@Override
	public String toString() {
		return "AnivRaksan [age=" + age + ", name=" + name + "]";
	}

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

	public AnivRaksan() {
		System.out.println("Hi Raksan");// TODO Auto-generated constructor stub
	}

	public void beauty() {
		System.out.println("Handsome Raksan");
	}
}
