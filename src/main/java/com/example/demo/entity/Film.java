package com.example.demo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "film")
public class Film {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="titre")
	private String titre;
	
	@Column(name="annee")
	private String annee;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable
	private List<Artiste> artiste; 
	
	public Film() {
		
	}

	public Film(String titre, String annee) {
		super();
		this.titre = titre;
		this.annee = annee;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getAnnee() {
		return annee;
	}

	public void setAnnee(String annee) {
		this.annee = annee;
	}

	public List<Artiste> getArtiste() {
		return artiste;
	}

	public void setArtiste(List<Artiste> artiste) {
		this.artiste = artiste;
	}

	
}
