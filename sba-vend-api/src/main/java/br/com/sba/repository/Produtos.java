package br.com.sba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sba.model.Produto;

public interface Produtos extends JpaRepository<Produto, Long> {

}
