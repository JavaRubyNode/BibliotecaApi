package com.vinicius.pos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import com.vinicius.pos.base.EntityBase;
import com.vinicius.pos.enums.Sexo;

@Entity
public class Autor extends EntityBase<Long> {

	
	private static final long serialVersionUID = 7844271852165513210L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable=false)
	@NotEmpty(message="Nome do autor e obrigatório")
	private String nome;
	
	@Column(nullable=false)
	@Enumerated(EnumType.STRING)
	@NotNull(message ="Sexo e obrigatorio")
	private Sexo sexo;
	
	
	
	public Sexo getSexo() {return sexo;}
	public void setSexo(Sexo sexo) {this.sexo = sexo;}
	
	
	public String getNome() {return nome;}
	public void setNome(String nome) {this.nome = nome;}

	@Override public Long getId() {return id;}
    @Override public void setId(Long id) {this.id = id;}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Autor other = (Autor) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	public Autor(String nome) {
		super();
		this.nome = nome;
	}

	public Autor() {
		super();
	}
    
    
    
}
