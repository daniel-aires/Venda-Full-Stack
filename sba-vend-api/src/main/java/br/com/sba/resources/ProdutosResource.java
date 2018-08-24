package br.com.sba.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.sba.model.Produto;
import br.com.sba.repository.Produtos;

@CrossOrigin("*")
@RestController
@RequestMapping("/produtos")
public class ProdutosResource {

	@Autowired
	private Produtos produtos;

	@GetMapping
	public List<Produto> listar() {
		return produtos.findAll();
	}
	
	
}
