package com.example.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Command;

public interface ICommand extends JpaRepository<Command, Long>{

}
