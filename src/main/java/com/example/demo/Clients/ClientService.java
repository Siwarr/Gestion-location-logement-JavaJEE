package com.example.demo.Clients;

import java.util.List;
import java.util.Optional;

public interface ClientService {
	public List<Client> getAllClients();
	public Optional<Client> getClient(Integer id);
	public void addClient(Client client);
}
