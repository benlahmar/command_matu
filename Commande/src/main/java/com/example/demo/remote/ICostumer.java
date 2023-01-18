package com.example.demo.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.entities.Client;

@FeignClient(name = "customer-service", url = "http://localhost:8080/")
public interface ICostumer {

	@GetMapping("/clients/{id}")
	public Client getbyid(@PathVariable long id);
}
