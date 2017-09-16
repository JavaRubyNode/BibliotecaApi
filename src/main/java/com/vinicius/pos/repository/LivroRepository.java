package com.vinicius.pos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vinicius.pos.model.Livro;

public interface LivroRepository extends JpaRepository<Livro,Long> {
}
