package com.example.demo.Logement;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class LogementService{

	@Autowired
	LogementRepository logementRepository;
	
	public List<Logement> listAll(){
		return logementRepository.findAll();
	}
	
	public Logement save(Logement logement) {
		return logementRepository.save(logement);
	}
	
	public Logement get(String id) {
		try {
			return logementRepository.findById(id).get();
		} catch (NoSuchElementException ex) {
			return null;
		}
	}
	
	public void delete(Logement logement) {
		logementRepository.delete(logement);
	}
	
}