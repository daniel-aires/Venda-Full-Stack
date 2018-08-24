package br.com.sba.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sba.model.Venda;
import br.com.sba.repository.Produtos;
import br.com.sba.repository.Vendas;

@Service
public class VendaService {

	@Autowired
	private Vendas vendas;

	@Autowired
	private Produtos produtos;

	public Venda adicinar(Venda venda) {
		venda.setCadastro(LocalDateTime.now());
		venda.getItens().forEach(i -> {
			i.setVenda(venda);
			i.setProduto(produtos.findById(i.getProduto().getId()).get());
		});

		/**
		 * Lambda Java 8
		 */
		BigDecimal totalItens = venda.getItens().stream()
				.map(i -> i.getProduto().getValor().multiply(new BigDecimal(i.getQuantidade())))
				.reduce(BigDecimal.ZERO, BigDecimal::add);
		
		venda.setTotal(totalItens.add(venda.getFrete()));
		
		return vendas.save(venda);
	}
}
