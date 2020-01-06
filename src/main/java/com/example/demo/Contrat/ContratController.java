package com.example.demo.Contrat;

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
import org.springframework.web.servlet.ModelAndView;

public class ContratController {
	
	@Autowired
	ContratService service;
	
	@GetMapping("/listcontrats")
	public ModelAndView getAll() {
		List<Contrat> listcontrats = service.listAll();
		
		return new ModelAndView("index","listcontrats",listcontrats);
	}
	
	@RequestMapping("/newContrat")
	public String showNewcontratPage(Model model) {
	    Contrat contrat = new Contrat();
	    model.addAttribute("contrat", contrat);
	     
	    return "new_contrat";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String savecontrat(@Valid @ModelAttribute("contrat") Contrat contrat) {
	    service.save(contrat);
	    return "listcontrats";
	}
	
	@RequestMapping(value="/editContrat/{idC}")
	public String showEditcontrat(@RequestParam(value = "idC",required=false)String idC, ModelMap model) {
	    Contrat contrat=service.get(idC);
	    model.addAttribute("contrat",contrat);	     
	    return "edit_contrat";
	}
	
	@RequestMapping(value="/editsaveC",method=RequestMethod.POST)
	public ModelAndView editsave(@ModelAttribute("contrat") Contrat cont) {
		
		Contrat contrat = service.get(cont.getIdC());
		
		contrat.setDateDebut(cont.getDateDebut());
		contrat.setPrix(cont.getPrix());
		contrat.setAdresse(cont.getAdresse());
		contrat.setDuree(cont.getDuree());
		contrat.setLogement(cont.getLogement());
		contrat.setClient(cont.getClient());

		
		
		service.save(cont);
		return new ModelAndView("listcontrats");
	}
	
	@RequestMapping(value="/deleteContrat/{idC}",method=RequestMethod.GET)
	public ModelAndView deletecontrat(@RequestParam(value = "idC",required=false)String idC) {
		Contrat contrat = service.get(idC);
	    service.delete(contrat);
	    return new ModelAndView("listcontrats");       
	}
}
