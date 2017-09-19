package com.vinicius.pos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vinicius.pos.base.ServiceCrudBase;
import com.vinicius.pos.model.Livro;
import com.vinicius.pos.repository.LivroRepository;

@Service
public class LivroService extends ServiceCrudBase<Long, Livro, LivroRepository>{

	@Autowired GeneroService generoService;
	
	@Override
	public Livro inserir(Livro entidade) {
		generoService.pesguisarPorId(entidade.getGenero().getId());
		return super.inserir(entidade);
	}
	
	
	
	
	
	

}
