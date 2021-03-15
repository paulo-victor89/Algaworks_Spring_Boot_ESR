package com.campelo.osvictor.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.campelo.osvictor.api.model.Comentario;


@Repository
public interface ComentarioRepository extends JpaRepository<Comentario, Long> {

	
}
