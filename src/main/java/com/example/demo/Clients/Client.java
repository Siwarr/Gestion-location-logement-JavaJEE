package com.example.demo.Clients;

import javax.persistence.*;

import com.example.demo.Contrat.Contrat;

@Entity
@Table(name="client")
public class Client {
	@Id
	@GeneratedValue
	private Integer id;
	private String CIN;
	private String age;
	private String email;
	private String adresse;
	private String Tel1;
	private String Tel2;
	private String nom;
	private String prenom;
	
	@ManyToOne
	@JoinColumn(name="idC")
	private Contrat contrat;

	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Client(Integer id, String cIN, String age, String email, String adresse, String tel1, String tel2,
			String nom, String prenom, Contrat contrat) {
		super();
		this.id = id;
		CIN = cIN;
		this.age = age;
		this.email = email;
		this.adresse = adresse;
		Tel1 = tel1;
		Tel2 = tel2;
		this.nom = nom;
		this.prenom = prenom;
		this.contrat = contrat;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCIN() {
		return CIN;
	}

	public void setCIN(String cIN) {
		CIN = cIN;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getTel1() {
		return Tel1;
	}

	public void setTel1(String tel1) {
		Tel1 = tel1;
	}

	public String getTel2() {
		return Tel2;
	}

	public void setTel2(String tel2) {
		Tel2 = tel2;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Contrat getContrat() {
		return contrat;
	}

	public void setContrat(Contrat contrat) {
		this.contrat = contrat;
	}
	
}
