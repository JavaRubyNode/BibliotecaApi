package com.vinicius.pos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vinicius.pos.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}
