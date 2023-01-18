package com.example.demo.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.entities.Produit;

@FeignClient(name = "catalogue-service",url = "http://localhost:8082/")
public interface ICatalogue {

	@GetMapping("produits/{id}")
	public Produit getprd(@PathVariable long id);
	
}
