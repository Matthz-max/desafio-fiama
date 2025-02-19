package com.demo.desafio.dtos;

import com.demo.desafio.entities.Participante;

public class ParticipanteDTO {
	private Long id;
	private String nome;
	private String email;

	public ParticipanteDTO(Long id, String nome, String email) {
		this.id = id;
		this.nome = nome;
		this.email = email;
	}

	public ParticipanteDTO(Participante p) {
		id = p.getId();
		nome = p.getNome();
		email = p.getEmail();
	}

	public ParticipanteDTO() {
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
