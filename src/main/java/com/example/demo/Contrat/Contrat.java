package com.example.demo.Contrat;

import java.util.List;

import javax.persistence.*;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.Clients.Client;
import com.example.demo.Logement.Logement;


@Entity
@Table(name="Contrat")
public class Contrat {
				
		@Id
		@GeneratedValue
		private String idC;
		private String dateDebut;
		private String Duree;
		private String adresse;
		private Double prix;
		private int nbreChambre;
		private String CIN;

		@OneToMany(mappedBy="contrat")
		List<Client> client;
		@OneToMany(mappedBy="contra")
		List<Logement> logement;
		public Contrat() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Contrat(String idC, String dateDebut, String duree, String adresse, Double prix, int nbreChambre,
				String CIN,List<Client> client, List<Logement> logement) {
			super();
			this.idC = idC;
			this.dateDebut = dateDebut;
			this.Duree = duree;
			this.adresse = adresse;
			this.prix = prix;
			this.nbreChambre = nbreChambre;
			this.CIN=CIN;
			this.client = client;
			this.logement = logement;
		}
		public String getIdC() {
			return idC;
		}
		public void setIdC(String idC) {
			this.idC = idC;
		}
		public String getDateDebut() {
			return dateDebut;
		}
		public void setDateDebut(String dateDebut) {
			this.dateDebut = dateDebut;
		}
		public String getDuree() {
			return Duree;
		}
		public void setDuree(String duree) {
			Duree = duree;
		}
		@Autowired
		Logement loge;
		@Autowired
		Client clt;
		
		public String getAdresse() {
			return loge.getAdresse();
		}
		public void setAdresse(String adresse) {
			loge.setAdresse(adresse);
		}
		public Double getPrix() {
			return loge.getPrix();
		}
		public void setPrix(Double prix) {
			loge.setPrix(prix);
		}
		public int getNbreChambre() {
			return loge.getNbreChambre();
		}
		public void setNbreChambre(int nbreChambre) {
			loge.setNbreChambre(nbreChambre);
		}
		public List<Client> getClient() {
			return client;
		}
		public void setClient(List<Client> client) {
			this.client = client;
		}
		public List<Logement> getLogement() {
			return logement;
		}
		public void setLogement(List<Logement> logement) {
			this.logement = logement;
		}
		
		public String getCIN() {
			return clt.getCIN();
		}
		public void setCIN(String CIN) {
			clt.setCIN(CIN);
		}
		
		
		
		
}
