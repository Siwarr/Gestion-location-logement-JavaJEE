package com.example.demo.Logement;

import javax.persistence.*;

import com.example.demo.Contrat.Contrat;

@Entity
@Table(name="logement")
public class Logement {
	@Id
	@GeneratedValue
	private String id;
	private String etat;
	private double prix;
	private String adresse;
	private int nbreChambre;
	@ManyToOne
	@JoinColumn(name="idC")
	private Contrat contra;
	
	public Logement() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Logement(String id, String etat, double prix, String adresse, int nbreChambre, Contrat contra) {
		super();
		this.id = id;
		this.etat = etat;
		this.prix = prix;
		this.adresse = adresse;
		this.nbreChambre = nbreChambre;
		this.contra = contra;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public int getNbreChambre() {
		return nbreChambre;
	}
	public void setNbreChambre(int nbreChambre) {
		this.nbreChambre = nbreChambre;
	}
	public Contrat getContra() {
		return contra;
	}
	public void setContrat(Contrat contra) {
		this.contra = contra;
	}
	
	
	

}
