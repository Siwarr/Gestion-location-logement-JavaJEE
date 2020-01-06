/*
 * package com.example.demo.Location;
 

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.Logement.Logement;

@RestController
public class LocationController {
	
		@Autowired
		LocationService locationService;

		@RequestMapping(method = RequestMethod.GET, value = "/locations")
		public Iterable<Location> Location() {
			return locationService.listAll();
		}

		@RequestMapping(method = RequestMethod.POST, value = "/locations")
		@ResponseBody
		public String save(@RequestBody Location location) {
			
			location.setCreatedDate(new Date());

			locationService.save(location);
			
			return "{'id' : '"+location.getIdloc()+"'}";
		}

		@RequestMapping(method = RequestMethod.GET, value = "locations/{idloc}")
		public Location show(@RequestParam Integer idloc) {

			return locationService.get(idloc);
		}

		@RequestMapping(method = RequestMethod.PUT, value = "locations/{idloc}")
		public Location update(@RequestParam Integer idloc, @RequestBody Location location) {

			Location loc = locationService.get(idloc);
			
			if (loc.getIdloc() != null) {
				loc.setIdloc(location.getIdloc());
			}
			locationService.save(loc);

			return loc;
		}

		@RequestMapping(method = RequestMethod.DELETE, value = "/locations/{idloc}")
		@ResponseBody
		public String delete(@RequestParam Integer idloc) {
			Location location = LocationService.get(idloc);
			locationService.delete(location);
			return "{'status' : 'OK'}";
			
		}
}
*/