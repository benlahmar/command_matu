package com.example.demo.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Lignecommand;

public interface ILingnecommand extends JpaRepository<Lignecommand, Long>{

	public List<Lignecommand> findByCmdId(long id);
}
