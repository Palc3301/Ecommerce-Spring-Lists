package com.mlfacisa.jemao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mlfacisa.jemao.entity.Produto;
import com.mlfacisa.jemao.service.ProdutoService;



@RestController
@RequestMapping(value = "/produtos")
public class ProdutoController {
	
	@Autowired
	private ProdutoService produtoService;

	@GetMapping
	public ResponseEntity<List<Produto>> findAll() {
		return new ResponseEntity<List<Produto>>(produtoService.findAll(), HttpStatus.OK);
	}

	@GetMapping("/{produto}")
	public ResponseEntity<Produto> findName(@PathVariable("name") String name) {
		Produto produto = produtoService.findName(name);
		return new ResponseEntity<Produto>(produto, HttpStatus.OK);

	}
	
	@PostMapping
	public ResponseEntity<Produto> addProduto(@RequestBody Produto produto) {
		return new ResponseEntity<Produto>(produtoService.addProduto(produto), HttpStatus.CREATED);
	}
	
	@DeleteMapping
	public ResponseEntity<String> deleteProduto(@RequestParam("produto") String produto) {
		if (produtoService.findName(produto)!=null) {
			produtoService.deleteProduto(produto);
			return new ResponseEntity<String>("PRODUTO DELETADO", HttpStatus.OK);
		}
		return new ResponseEntity<String>("PRODUTO NÃO EXISTE!", HttpStatus.NOT_FOUND);
	}

}


