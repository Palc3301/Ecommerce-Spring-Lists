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

import com.mlfacisa.jemao.entity.Pedido;
import com.mlfacisa.jemao.service.PedidoService;

@RestController
@RequestMapping(value = ("/pedido"))
public class PedidoController {
	
	@Autowired
	private PedidoService pedidoService;
	
	@GetMapping
	public ResponseEntity<List<Pedido>> findAll() {
		return new ResponseEntity<List<Pedido>>(pedidoService.findAll(), HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Pedido> findId(@PathVariable("id") int id) {
		Pedido Pedido = pedidoService.findId(id);
		return new ResponseEntity<Pedido>(Pedido, HttpStatus.OK);

	}
	
	@PostMapping
	public ResponseEntity<String> addPedido(@RequestBody Pedido Pedido) {
		pedidoService.addPedido(Pedido);
		return new ResponseEntity<String>("PEDIDO ADICIONADO",HttpStatus.CREATED);
	}
	
	@PostMapping("/{id}")
	public ResponseEntity<String> addProdutoNoPedido(@RequestParam("name") String name, @PathVariable("id") int id ) {
		pedidoService.addProduto(name, id);
		return new ResponseEntity<String> ("PRODUTO ADICIONADO AO PEDIDO", HttpStatus.OK);
	}
	
	@DeleteMapping
	public ResponseEntity<String> deletePedido(@RequestParam("id") int id) {
		if (pedidoService.findId(id)!=null) {
			pedidoService.deletePedido(id);
			return new ResponseEntity<String>("PEDIDO DELETADO", HttpStatus.OK);
		}
		return new ResponseEntity<String>("PEDIDO NÂO ENCONTRADO!", HttpStatus.NOT_FOUND);

}
}
