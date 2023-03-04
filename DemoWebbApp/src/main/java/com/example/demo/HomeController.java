package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("home")
	public ModelAndView homeone(Akhiil akhiil) {
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("obj", akhiil);
		mv.setViewName("home");
		return mv;
	}
	
	/*
	 * @RequestMapping("home") public ModelAndView homeone(@RequestParam("name")
	 * String myname) {
	 * 
	 * ModelAndView mv = new ModelAndView(); mv.addObject("name", myname);
	 * mv.setViewName("home"); return mv; }
	 */
	
	

}
