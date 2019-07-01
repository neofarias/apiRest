package com.conta.apirest.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.conta.apirest.models.Conta;
import com.conta.apirest.repository.ContaRepository;

@RestController
@RequestMapping(value="/api")
public class ContaResource {
	
	@Autowired
	ContaRepository contaRepository;
	
	@GetMapping("/conta")
	public List<Conta> listaContas() {
		return contaRepository.findAll();
	}
	
	@GetMapping("/conta/{id}")
	public Conta listaContaId(@PathVariable(value="id") long id) {
		return contaRepository.findById(id);
	}
	
	@PostMapping("/conta")
	public Conta insertConta(@RequestBody Conta conta) {
		return contaRepository.save(conta);
	}
	
	@PutMapping("/conta")
	public Conta updateConta(@RequestBody Conta conta) {
		return contaRepository.save(conta);
	}
	
	@DeleteMapping("/conta/{id}")
	public void deleteConta(@PathVariable(value="id") long id) {
		contaRepository.deleteById(id);
	}

}
