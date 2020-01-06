
package com.example.demo.Logement;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class LogementController {
	
	@Autowired
	LogementService service;
	
	@GetMapping("/")
	public ModelAndView getAll() {
		List<Logement> listLogements = service.listAll();
		
		return new ModelAndView("index","listLogements",listLogements);
	}
	
	@RequestMapping("/new")
	public String showNewLogementPage(Model model) {
	    Logement logement = new Logement();
	    model.addAttribute("logement", logement);
	     
	    return "new_logement";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveLogement(@Valid @ModelAttribute("logement") Logement logement) {
	    service.save(logement);
	    return "redirect:/";
	}
	
	@RequestMapping(value="/edit/{id}")
	public String showEditLogement(@RequestParam(value = "id",defaultValue = "1")String id, ModelMap model) {
	    Logement logement=service.get(id);
	    model.addAttribute("logement",logement);	     
	    return "edit_logement";
	}
	
	@RequestMapping(value="/editsave",method=RequestMethod.POST)
	public ModelAndView editsave(@ModelAttribute("logement") Logement log) {
		
		Logement logement = service.get(log.getId());
		
		logement.setEtat(log.getEtat());
		logement.setPrix(log.getPrix());
		logement.setAdresse(log.getAdresse());
		logement.setNbreChambre(log.getNbreChambre());
		
		service.save(log);
		return new ModelAndView("redirect:/viewlogements");
	}
	
	@RequestMapping(value="/delete/{id}",method=RequestMethod.GET)
	public ModelAndView deleteLogement(@RequestParam(value = "id",defaultValue = "3")String id) {
		Logement logement = service.get(id);
	    service.delete(logement);
	    return new ModelAndView("redirect:/");       
	}
	
}

//https://github.com/varuncbv/THYMELEAF-SPRINGBOOT-REST-JPA-HIBERNATE-MYSQL-CRUD-APPLICATION/blob/master/ThymeleafCrudExample/src/main/java/com/letsstartcoding/springboothibernate/controller/logementEnrollmentController.java
// https://www.dropbox.com/s/0i8ikuhyls260tx/CRUD-spring-hibernate-tutorial.zip?dl=0
// https://www.youtube.com/watch?v=rdYQOqxq9F0