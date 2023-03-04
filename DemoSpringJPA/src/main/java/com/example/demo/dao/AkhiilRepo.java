package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Akhiil;

public interface AkhiilRepo extends JpaRepository<Akhiil, String> {

	//List<Akhiil> findBylastName(String lastName);
	//List<Akhiil> findByageGreaterThan(int age);
	
	
	//List<Akhiil> findByageSorted();

}
