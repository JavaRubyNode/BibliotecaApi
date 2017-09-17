package com.vinicius.pos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.hibernate.validator.constraints.NotEmpty;
import com.vinicius.pos.base.EntityBase;

@Entity
public class Endereco extends EntityBase<Long>{

	
	private static final long serialVersionUID = 1917971732268619363L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable=false)
	@NotEmpty(message="Rua e obrigatorio")
	private String rua;
	
	@Column(nullable=false)
	@NotEmpty(message="Bairro e obrigatorio")
	private String bairro;
	
	@Column(nullable=false)
	@NotEmpty(message="Quadra e obrigatorio")
	private String quadra;
	
	@Column(nullable=false)
	@NotEmpty(message="Lote e obrigatorio")
	private String lote;
	
	@Column(nullable=false)
	@NotEmpty(message="numero e obrigatorio")
	private String numero;
	
	@Column(nullable=false)
	@NotEmpty(message="Complemento e obrigatorio")
	private String complemento;
	
	@Column(nullable=false)
	@NotEmpty(message="Cidade e obrigatorio")
	private String cidade;
	
	@Column(nullable=false)
	@NotEmpty(message="Estado e obrigatorio")
	private String estado;
	
	@Column(nullable=false)
	@NotEmpty(message="Pais e obrigatorio")
	private String pais;
	
	
	@Override
	public Long getId() {
		return id;
	}

	@Override
	public void setId(Long id) {
		this.id=id;
	}

	public Endereco(String rua, String bairro, String quadra, String lote, String numero, String complemento,
			String cidade, String estado, String pais) {
		super();
		this.rua = rua;
		this.bairro = bairro;
		this.quadra = quadra;
		this.lote = lote;
		this.numero = numero;
		this.complemento = complemento;
		this.cidade = cidade;
		this.estado = estado;
		this.pais = pais;
	}

	public Endereco() {
		super();
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getQuadra() {
		return quadra;
	}

	public void setQuadra(String quadra) {
		this.quadra = quadra;
	}

	public String getLote() {
		return lote;
	}

	public void setLote(String lote) {
		this.lote = lote;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

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
		Endereco other = (Endereco) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
	
}
