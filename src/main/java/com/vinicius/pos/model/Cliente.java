package com.vinicius.pos.model;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import com.vinicius.pos.base.EntityBase;
import com.vinicius.pos.enums.Sexo;

public class Cliente extends EntityBase<Long>{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1420411224464536457L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable=false)
	@NotEmpty(message="Nome e obrigatorio")
	private String nome;
	
	@Column(nullable=false)
	@NotEmpty(message="Cpf e obrigatorio")
	private String cpf;
	
	@Column(nullable=false)
	@NotEmpty(message="E-mail e obrigatorio")
	private String email;
	
	@Column(nullable=false)
	@NotEmpty(message="Telefone e obrigatorio")
	private String telefone;
	
	@Enumerated(EnumType.STRING)
	@Column(nullable=false)
	@NotNull(message="Sexo e obrigatorio")
	private Sexo sexo;
	
	@Override
	public Long getId() {
		return id;
	}

	@Override
	public void setId(Long id) {
		this.id=id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	
	

}
