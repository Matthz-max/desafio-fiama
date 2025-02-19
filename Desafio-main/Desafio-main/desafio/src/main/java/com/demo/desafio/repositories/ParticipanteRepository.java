package com.demo.desafio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.desafio.entities.Participante;

@Repository
public interface ParticipanteRepository extends JpaRepository<Participante, Long> {

}
