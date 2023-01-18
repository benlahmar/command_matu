package com.example.demo.entities;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

import org.springframework.data.annotation.CreatedDate;

@Entity
public class Command {

	@Id @GeneratedValue
	long id;
	
	@CreatedDate
	LocalDate date=LocalDate.now();
	
	@OneToMany(mappedBy = "cmd", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	List<Lignecommand> composants;
	
	@Transient
	Client client;
	
	long idclient;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public List<Lignecommand> getComposants() {
		return composants;
	}

	public void setComposants(List<Lignecommand> composants) {
		this.composants = composants;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public long getIdclient() {
		return idclient;
	}

	public void setIdclient(long idclient) {
		this.idclient = idclient;
	}
	
	
	
}
