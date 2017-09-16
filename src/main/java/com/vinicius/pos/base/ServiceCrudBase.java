package com.vinicius.pos.base;

import java.io.Serializable;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

public abstract class ServiceCrudBase <ID extends Serializable, E extends EntityBase<ID>, R extends JpaRepository<E, ID>> {

	@Autowired
	private R repository;
	
	
	
	public E inserir( E entidade) {
		E entidadeGravada = repository.save(entidade);
		return entidadeGravada;
	}
	
	public E alterar( E entidade) {
		E entidadeAAlterar = this.repository.findOne(entidade.getId());
		if(entidadeAAlterar == null) {return null;}
		entidadeAAlterar.setId(entidade.getId());
		this.repository.save(entidadeAAlterar);
		return entidadeAAlterar;
	}
	
	public E pesguisarPorId(ID id) {
		return this.repository.findOne(id);
	}
	
	public List<E>listar() {
		return this.repository.findAll();
	}
	
	public boolean deletar(ID id) {
		E entidadeAExcluir = this.repository.findOne(id);
		if(entidadeAExcluir == null) {return false;}
		this.repository.delete(id);
		return true;
	}	
	
	protected R getRepository() {
		return repository;
	}

}
