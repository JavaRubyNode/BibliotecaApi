package com.vinicius.pos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vinicius.pos.model.Emprestimo;

public interface EmprestimoRepository extends JpaRepository<Emprestimo, Long> {

}
