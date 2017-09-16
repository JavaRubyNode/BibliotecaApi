package com.vinicius.pos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.hibernate.validator.constraints.NotEmpty;
import com.vinicius.pos.base.EntityBase;



@Entity
public class Editora extends EntityBase<Long>{


	/**
	 * 
	 */
	private static final long serialVersionUID = -4483774508853632526L;
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column(nullable =false)
	@NotEmpty(message= "Nome da editora e obrigatório")
	private String nome;

	
	public String getNome() {return nome;}
	public void setNome(String nome) {this.nome = nome;}
	@Override public Long getId() {return id;}
	@Override public void setId(Long id) {this.id = id;}
	public Editora() {super();}
	public Editora(String nome) {super();this.nome = nome;}
	
	
	
	
	

}
