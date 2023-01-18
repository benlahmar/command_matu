package com.example.demo.busniss;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Command;
import com.example.demo.repos.ICommand;
import com.example.demo.repos.ILingnecommand;
@Service
public class CommandbusnissImpl implements Commandbusniss{

	@Autowired
	ICommand crepo;
	@Autowired
	ILingnecommand lrepo;
	
	@Override
	public Command addcmd(Command c) {
		
		return crepo.save(c);
	}

	@Override
	public List<Command> allcmd() {
		// TODO Auto-generated method stub
		return crepo.findAll();
	}

	@Override
	public Optional<Command> findcmd(long id) {
		// TODO Auto-generated method stub
		return crepo.findById(id);
	}

	@Override
	public Page<Command> allcmd2(int page, int size) {
		
		Pageable pageable=PageRequest.of(page, size);
		Page<Command> res = crepo.findAll(pageable);
		return res;
	}

}
