package com.vinicius.pos.model;

import org.hibernate.validator.constraints.NotBlank;

import com.vinicius.pos.base.EntityBase;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
public class Livro extends EntityBase<Long>{

    private static final long serialVersionUID = 9196157077974265663L;
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O campo nome é obrigatório!")
    private String nome;

    @Column(nullable = false)
    private int volume;

    @Temporal(TemporalType.DATE)
    private Date dataDePublicacao;

    @Column(precision = 2, scale = 10)
    private BigDecimal valor;

    @ManyToOne
    @JoinColumn(name = "id_genero",nullable = false)
    private Genero genero;


    public Livro(String nome, int volume, Date dataDePublicacao, BigDecimal valor, Genero genero) {
        this.nome = nome;
        this.volume = volume;
        this.dataDePublicacao = dataDePublicacao;
        this.valor = valor;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public Date getDataDePublicacao() {
        return dataDePublicacao;
    }

    public void setDataDePublicacao(Date dataDePublicacao) {
        this.dataDePublicacao = dataDePublicacao;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

	@Override
	public Long getId() {
		return id;
	}

	@Override
	public void setId(Long id) {
		this.id=id;
	}
}
