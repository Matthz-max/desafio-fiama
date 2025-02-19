package com.demo.desafio.dtos;

import java.time.Instant;

import com.demo.desafio.entities.Bloco;

public class BlocoDTO {
	private Long id;
	private Instant inicio;
	private Instant fim;

	public BlocoDTO(Long id, Instant inicio, Instant fim) {
		this.id = id;
		this.inicio = inicio;
		this.fim = fim;
	}

	public BlocoDTO(Bloco b) {
		id = b.getId();
		inicio = b.getInicio();
		fim = b.getFim();
	}

	public BlocoDTO() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Instant getInicio() {
		return inicio;
	}

	public void setInicio(Instant inicio) {
		this.inicio = inicio;
	}

	public Instant getFim() {
		return fim;
	}

	public void setFim(Instant fim) {
		this.fim = fim;
	}

}
