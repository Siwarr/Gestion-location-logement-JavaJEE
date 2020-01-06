/*package com.example.demo.Location;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;

public class LocationService {
	@Autowired
	LocationRepository locationRepository;
	
	public List<Location> listAll(){
		return locationRepository.findAll();
	}
	
	public Location save(Location location) {
		return locationRepository.save(location);
	}
	
	public Location get(Integer idloc) {
		try {
			return locationRepository.findById(idloc).get();
		} catch (NoSuchElementException ex) {
			return null;
		}
	}
	
	public void delete(Location location) {
		locationRepository.delete(location);
	}
}*/
