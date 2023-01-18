package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

@Entity
public class Lignecommand {

	@Id @GeneratedValue
	long id;
	int qte;
	double prix;
	
	@ManyToOne
	Command cmd;
	@Transient
	Produit produit;
	
	long idproduit;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getQte() {
		return qte;
	}

	public void setQte(int qte) {
		this.qte = qte;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public Command getCmd() {
		return cmd;
	}

	public void setCmd(Command cmd) {
		this.cmd = cmd;
	}

	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	public long getIdproduit() {
		return idproduit;
	}

	public void setIdproduit(long idproduit) {
		this.idproduit = idproduit;
	}

	public Lignecommand() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Lignecommand(int qte, double prix, long idproduit) {
		super();
		this.qte = qte;
		this.prix = prix;
		this.idproduit = idproduit;
	}
	
	
	
}
