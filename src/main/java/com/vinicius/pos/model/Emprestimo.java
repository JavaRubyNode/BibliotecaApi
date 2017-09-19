package com.vinicius.pos.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.vinicius.pos.base.EntityBase;


@Entity
public class Emprestimo extends EntityBase<Long>{
	
	
	
	private static final long serialVersionUID = 8032724719906187611L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Temporal(TemporalType.DATE)
	@Column(nullable=false)
	private Date dataEmprestimo;
	
	@Temporal(TemporalType.DATE)
	@Column(nullable=false)
	private Date dataDevolucao;
	
	@Column(precision = 10, scale = 2)
	private BigDecimal valorDoEmprestimo;
	
	@ManyToOne
	@JoinColumn(name="id_cliente")
	private Cliente cliente;
	
	@ManyToOne
	@JoinColumn(name="id_livro")
	private Livro livro;
	
	
	@Override
	public Long getId() {
		return id;
	}

	@Override
	public void setId(Long id) {
		this.id=id;
	}

	public Emprestimo() {
		super();
	}




	public Date getDataEmprestimo() {
		return dataEmprestimo;
	}

	public void setDataEmprestimo(Date dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}

	public Date getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(Date dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

	public BigDecimal getValorDoEmprestimo() {
		return valorDoEmprestimo;
	}

	public void setValorDoEmprestimo(BigDecimal valorDoEmprestimo) {
		this.valorDoEmprestimo = valorDoEmprestimo;
	}
	
	

}
