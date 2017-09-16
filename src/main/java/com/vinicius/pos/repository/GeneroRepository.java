package com.vinicius.pos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vinicius.pos.model.Genero;

public interface GeneroRepository extends JpaRepository<Genero,Long> {
}
