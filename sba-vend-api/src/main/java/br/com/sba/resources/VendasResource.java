package br.com.sba.resources;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.sba.model.Venda;
import br.com.sba.repository.Vendas;
import br.com.sba.service.VendaService;

@CrossOrigin("*")
@RestController
@RequestMapping("/vendas")
public class VendasResource {

	@Autowired
	private Vendas vendas;

	@Autowired
	private VendaService vendaService;

	@GetMapping
	public List<Venda> listar() {
		return vendas.findAll();
	}

	@PostMapping
	public Venda adicionar(@RequestBody @Valid Venda venda) {
		return vendaService.adicinar(venda);
	}

}
