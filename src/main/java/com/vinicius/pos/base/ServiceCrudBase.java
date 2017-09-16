package com.vinicius.pos.base;

import java.io.Serializable;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.jpa.repository.JpaRepository;

public abstract class ServiceCrudBase <ID extends Serializable, E extends EntityBase<ID>, R extends JpaRepository<E, ID>> {

	@Autowired
	private R repository;
	
	
	
	public E inserir( E entidade) {
		E entidadeGravada = repository.save(entidade);
		return entidadeGravada;
	}
	
	public E alterar( E entidade) {
		pesguisarPorId(entidade.getId());
		this.repository.save(entidade);
		return entidade;
	}
	
	public E pesguisarPorId(ID id) {
		 E entidade =  this.repository.findOne(id); 
		 if(entidade == null ) throw new EmptyResultDataAccessException(0);
		return entidade;
		
	}
	
	public List<E>listar() {
		return this.repository.findAll();
	}
	
	public void deletar(ID id) {
		pesguisarPorId(id);
		this.repository.delete(id);
	}	
	
	protected R getRepository() {
		return repository;
	}

}
