package br.com.sba.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.sba.model.Cliente;
import br.com.sba.repository.Clientes;

@CrossOrigin("*")
@RestController
@RequestMapping("/clientes")
public class ClientesResource {

	@Autowired
	private Clientes clientes;

	@GetMapping
	public List<Cliente> listar() {
		return clientes.findAll();
	}
	
	
}
