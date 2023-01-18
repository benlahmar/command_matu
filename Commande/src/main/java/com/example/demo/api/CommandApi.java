package com.example.demo.api;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.busniss.Commandbusniss;
import com.example.demo.entities.Client;
import com.example.demo.entities.Command;
import com.example.demo.remote.ICostumer;

@RestController
public class CommandApi {

	@Autowired
	Commandbusniss service;
	
	@Autowired
	ICostumer customremote;
	
	@PostMapping("commands")
	public Command addcms(@RequestBody Command c)
	{
		
		return service.addcmd(c);
	}
	
	@GetMapping("commands/{id}")
	public ResponseEntity<Command> getbyid(@PathVariable long id)
	{
		Optional<Command> co = service.findcmd(id);
		if(co.isPresent())
		{
			Command cmd = co.get();
			Client c = customremote.getbyid(cmd.getIdclient());
			cmd.setClient(c);
			return new ResponseEntity<Command>(cmd,HttpStatus.OK);
		}else
			return new ResponseEntity<Command>(HttpStatus.NO_CONTENT);
	}
	@GetMapping("commands")
	public Page<Command> findallcmd(@RequestParam int page,@RequestParam int size)
	{
		return service.allcmd2(page, size);
	}
}
