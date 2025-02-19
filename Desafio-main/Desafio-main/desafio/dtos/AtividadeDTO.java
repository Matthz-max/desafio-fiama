package com.demo.desafio.dtos;

public class AtividadeDTO {
	private Long id;
	private String nome;
	private Double preco;
	private String descricao;

	public AtividadeDTO(Long id, String nome, Double preco, String descricao) {
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.descricao = descricao;
	}

	public AtividadeDTO(AtividadeDTO a) {
		id = a.getId();
		nome = a.getNome();
		descricao = a.getDescricao();
		preco = a.getPreco();
	}

	public AtividadeDTO() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
