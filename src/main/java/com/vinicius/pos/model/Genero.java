package com.vinicius.pos.model;

import org.hibernate.validator.constraints.NotBlank;

import com.vinicius.pos.base.EntityBase;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Genero extends EntityBase<Long>{

    /**
	 * 
	 */
	private static final long serialVersionUID = -3396434553363405584L;


	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @NotBlank(message = "Descrição e obrigatório !!")
    private String descricao;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Genero(String descricao) {
        this.descricao = descricao;
    }
    
    

    public Genero() {
		super();
	}

	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Genero genero = (Genero) o;

        if (!getId().equals(genero.getId())) return false;
        return getDescricao().equals(genero.getDescricao());
    }

    @Override
    public int hashCode() {
        int result = getId().hashCode();
        result = 31 * result + getDescricao().hashCode();
        return result;
    }
}
