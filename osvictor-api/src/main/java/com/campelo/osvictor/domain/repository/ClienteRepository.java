package com.campelo.osvictor.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.campelo.osvictor.domain.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long>{
	//metodo que vai retornar apenas um nome especifico, colocar as informações no controller
	List<Cliente> findByNome(String nome);
	// Metodo que vai trazer as informações de parte do nome, funciona como  um like no sql
	List<Cliente> findByNomeContaining(String nome);
	Cliente findByEmail(String email);
	

}
