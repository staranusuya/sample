package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.AkhiilRepo;
import com.example.demo.model.Akhiil;

@RestController
public class AkhiilController {

	@Autowired
	AkhiilRepo repo;
	
	@RequestMapping("home")
	public String home() {
		return "home.jsp";
		
	}
	
	@PostMapping("/register")
	public Akhiil register(Akhiil akhiil) {
		repo.save(akhiil);
		
		return akhiil;
	}

	@GetMapping(path = "/findData")
	public List<Akhiil>  finddata() {
		return repo.findAll();
	//System.out.println("firstName" +firstName);
	/*
	 * ModelAndView mv = new ModelAndView();
	 * 
	 * System.out.println("Repo====="+repo.existsById(firstName)); Akhiil akhiil =
	 * repo.findById(firstName).orElse(new Akhiil());
	 * System.out.println("lastName===="+repo.findBylastName("muthu"));
	 * //System.out.println("Age sort===="+repo.findByageSorted());
	 * System.out.println("akhiil" +akhiil); mv.addObject(akhiil);
	 * mv.setViewName("find.jsp"); return mv;
	 */
	}
	
	@DeleteMapping("/findByName/{firstName}")
	public String deletedataByName(@PathVariable("firstName") String firstName) {
		System.out.println("name" +firstName);
		System.out.println(repo.existsById(firstName));
		//Optional<Akhiil> a = repo.findById(firstName);
		repo.deleteById(firstName);
		
		return "DELETED";
	
	} 
	@PutMapping("/register")
	public Akhiil saveOrUpdate(Akhiil akhiil) {
		repo.save(akhiil);
		
		return akhiil;
	}
	
	@RequestMapping("/findByName/{firstName}")
	public Optional<Akhiil> finddataByName(@PathVariable("firstName") String firstName) {
		System.out.println("name" +firstName);
		System.out.println(repo.existsById(firstName));
		return repo.findById(firstName);
	
	}

}
