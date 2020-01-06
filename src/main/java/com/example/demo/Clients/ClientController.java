package com.example.demo.Clients;

import com.example.demo.Clients.ClientRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {
	@Autowired
	ClientService clientService;
	
	@Autowired
	private ClientRepository clientRepository;
	
	@RequestMapping(value ="/clients")
	public String getAllClients() {
		clientService.getAllClients();
		return "clients";
	}
	@RequestMapping(value = "/deleteClient", method = RequestMethod.GET)
	public String delete(@RequestParam(name="id") Integer id) {
		clientRepository.deleteById(id);
		return "redirect:/clients";
	}
	
	@RequestMapping(value = "/editClient", method = RequestMethod.GET)
	public String editClient(Integer id, Client client) {
		clientRepository.save(client);		
		return "clients";
	}
	
	

}
