package in.nareshit.ajeet.hc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import in.nareshit.ajeet.hc.entity.Specialization;
import in.nareshit.ajeet.hc.service.ISpecializationService;

@Controller
@RequestMapping("/spec")
public class SpecializationController {
	@Autowired
 private ISpecializationService service;
	/**
	 * 1.show Register page**/
	@RequestMapping("/register")
	public String displayRegister() {
		return "SpecializationRegister";
		}
	/***
	 * 2.On Submit Form Data***/
	@PostMapping("/save")
	public String saveForm(@ModelAttribute Specialization 
			specialization, Model model ) {
		long id = service.saveSpecialization(specialization);
		String Message="Record ("+id+")is Created";
		model.addAttribute(Message, Message);
		return "SpecializationRegister";
		
	}
	
	
	
	/***
	 * Display All Specialization
	 * 
	 */
	@GetMapping("/all")
	public String viewAll(Model model) {
		List<Specialization> list = service.getAllSpecializations();
		model.addAttribute("list",list);
		return "SpecializationData";
	}
}
