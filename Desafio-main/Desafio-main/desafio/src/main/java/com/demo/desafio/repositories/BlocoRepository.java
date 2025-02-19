package com.demo.desafio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.desafio.entities.Bloco;

@Repository
public interface BlocoRepository extends JpaRepository<Bloco, Long> {

}
