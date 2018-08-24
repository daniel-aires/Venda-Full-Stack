package br.com.sba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sba.model.Venda;

public interface Vendas extends JpaRepository<Venda, Long> {

}
