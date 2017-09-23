package com.vinicius.pos.base;

import java.io.Serializable;
import java.net.URI;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.CacheControl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

public abstract class ResourceBase <ID extends Serializable, E extends EntityBase<ID>, R extends JpaRepository<E, ID>, S extends ServiceCrudBase<ID, E, R>>  {

	
	@Autowired private S service;
	
	
	@PostMapping
	public ResponseEntity<E> inserir(@RequestBody @Valid E entidade) {
		E entidadeGravada = service.inserir(entidade);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(entidadeGravada.getId()).toUri();
		return ResponseEntity.created(uri).body(entidadeGravada);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<E> alterar(@RequestBody @Valid E entidade, @PathVariable("id") ID id) {
		entidade.setId(id);return ResponseEntity.ok(this.service.alterar(entidade));}
	
	@GetMapping("/{id}")
	public ResponseEntity<E> pesguisarPorId(@PathVariable("id") ID id) {
	E entidade = this.service.pesguisarPorId(id);return entidade != null ? ResponseEntity.ok(entidade) : ResponseEntity.notFound().build();}
	
	@CrossOrigin
	@GetMapping
	public ResponseEntity<List<E>> listar() {
	return ResponseEntity.ok().cacheControl(tempoDecahe(30, TimeUnit.SECONDS)).body(this.service.listar());}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deletar(@PathVariable("id") ID id) {this.service.deletar(id);return ResponseEntity.noContent().build();}	
	
	private CacheControl tempoDecahe(long tempo,TimeUnit escalaDeTempo) {return CacheControl.maxAge(tempo, escalaDeTempo);}
	protected S getService() {return service;}

}
