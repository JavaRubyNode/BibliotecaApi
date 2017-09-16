package com.vinicius.pos.enums;


public enum Sexo {
	
	MASCULINO("masculino"),FEMININO("feminino");
	
	private String descricao;

	public String getDescricao() {
		return descricao;
	}

	private Sexo(String descricao) {
		this.descricao = descricao;
	}
	
	
	

}
