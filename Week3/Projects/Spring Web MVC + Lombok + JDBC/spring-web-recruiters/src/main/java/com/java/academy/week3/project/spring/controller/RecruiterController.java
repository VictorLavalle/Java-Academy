package com.java.academy.week3.project.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.java.academy.week3.project.spring.entity.Recruiter;
import com.java.academy.week3.project.spring.service.RecruiterService;

@Controller
@RequestMapping("/recruiter")
public class RecruiterController {

	// need to inject our recruiter  service
	@Autowired
	private RecruiterService recruiterService;
	
	
	
	@GetMapping("/list")
	public String listRecruiters(Model theModel) {
		
		// get recruiters from the service
		List<Recruiter> theRecruiters = recruiterService.getAllRecruiters();
				
		// add the recruiters to the model
		theModel.addAttribute("recruiters", theRecruiters);
		
		return "list-recruiters";
	}
	
	
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		
		// create model attribute to bind form data
		Recruiter theRecruiter = new Recruiter();
		
		theModel.addAttribute("recruiter", theRecruiter);
		
		return "recruiter-form";
	}
	
	
	@PostMapping("/saveRecruiter")
	public String saveRecruiter(@ModelAttribute("recruiter") Recruiter theRecruiter) {
		
		// save the recruiter using our service
		recruiterService.saveRecruiter(theRecruiter);	
		
		return "redirect:/recruiter/list";
	}
	
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("recruiterId") int theId,
									Model theModel) {
		
		// get the recruiter from our service
		Recruiter theRecruiter = recruiterService.getRecruiter(theId);	
		
		// set recruiter as a model attribute to pre-populate the form
		theModel.addAttribute("recruiter", theRecruiter);
		
		// send over to our form		
		return "recruiter-form";
	}
	
	@GetMapping("/delete")
	public String deleteRecruiter(@RequestParam("recruiterId") int theId) {
		
		// delete the recruiter
		recruiterService.deleteRecruiter(theId);
		
		return "redirect:/recruiter/list";
	}
}










