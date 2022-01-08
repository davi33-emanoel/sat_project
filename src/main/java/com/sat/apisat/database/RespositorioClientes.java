package com.sat.apisat.database;

import com.sat.apisat.entidade.Clientes;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RespositorioClientes extends JpaRepository<Clientes,Long>{
	Clientes findById(long id);
	Clientes deleteById(long id);

}
