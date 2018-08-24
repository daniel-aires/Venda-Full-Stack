package br.com.sba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sba.model.Cliente;

public interface Clientes extends JpaRepository<Cliente, Long> {

}
