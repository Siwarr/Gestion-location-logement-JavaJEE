package com.example.demo.Clients;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ClientServiceImpl implements ClientService {
	
	@Autowired
	ClientRepository clientRepository;
	
	@Override
	public List<Client> getAllClients(){
		List<Client> clients = new ArrayList<>();
		clientRepository.findAll()
		.forEach(clients::add);
		return clients;
	}
	
	@Override
	public Optional<Client> getClient(Integer id) {
		
		if (!clientRepository.findById(id).isPresent())
			throw new RuntimeException("Client introuvable");
		
		return clientRepository.findById(id);
	}
	
	@Override
	public void addClient(Client client) {
		clientRepository.save(client);
	}
}
