package com.demo.desafio.dtos;

import com.demo.desafio.entities.Categoria;

public class CategoriaDTO {

	private Long id;
	private String descricao;

	public CategoriaDTO(Long id, String descricao) {
		this.id = id;
		this.descricao = descricao;
	}

	public CategoriaDTO(Categoria c) {
		id = c.getId();
		descricao = c.getDescricao();
	}

	public CategoriaDTO() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
