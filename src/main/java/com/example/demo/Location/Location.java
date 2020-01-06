/*
package com.example.demo.Location;


import java.sql.Date;

import javax.persistence.*;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.Clients.Client;
import com.example.demo.Logement.Logement;

@Entity
@Table(name="Location")
public class Location {
	
		@Autowired
		Logement logement;
		
		@Id
		@GeneratedValue
		private Integer idloc;
		private String cin;
		private String idCont;
		private Date dateAlloue;
		public Location() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Location(Integer idloc,String cin, String idCont, Date dateAlloue) {
			super();
			this.idloc=idloc;
			this.cin = cin;
			this.idCont = idCont;
			this.dateAlloue = dateAlloue;
		}
		
		public Location(Client cl, Logement lg, Date dateAlloue) {
			super();
		
			this.dateAlloue = dateAlloue;
		}
		
		public Integer getIdloc() {
			return idloc;
		}
		public void setIdloc(Integer idloc) {
			this.idloc = idloc;
		}
		public String getCin() {
			return cin;
		}
		public void setCin(String cin) {
			this.cin = cin;
		}
		public String getIdCont() {
			return idCont;
		}
		public void setIdCont(String idCont) {
			this.idCont = idCont;
		}
		
		public Date getDateAlloue() {
			return dateAlloue;
		}
		public void setDateAlloue(Date dateAlloue) {
			this.dateAlloue = dateAlloue;
		}
		public String toString1() {
			return "Location [cin=" + cin + ", idCont=" + idCont + ", dateAlloue=" + dateAlloue
					+ "]";
		}
		
		@Override
		public String toString() {
			return "Location [cin=" + cin + ", idCont=" + idCont + ", dateAlloue=" + dateAlloue
					+ "]";
		
	}
}
*/