package com.example.demo.busniss;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;

import com.example.demo.entities.Command;
import com.example.demo.entities.Lignecommand;

public interface Commandbusniss {

	public Command addcmd(Command c);
	public List<Command> allcmd();
	public Optional<Command> findcmd(long id);
	
	public Page<Command> allcmd2(int page, int size);
	
	public Lignecommand addlc( Lignecommand lg, long idcmd);
	public List<Lignecommand> alllg(long idc);
}
