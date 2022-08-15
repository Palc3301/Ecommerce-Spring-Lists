package com.mlfacisa.jemao.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mlfacisa.jemao.entity.Categoria;
import com.mlfacisa.jemao.entity.Pedido;
import com.mlfacisa.jemao.entity.Produto;
import com.mlfacisa.jemao.repository.PedidoRepository;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository pedidoRepository;
	
	@Autowired
	private ProdutoService produtoService;
	
	public Pedido findId (int id) {
		List<Pedido> pedidos = pedidoRepository.findAll();
		for (Pedido pedido : pedidos) {
			if (pedido.getId() == id ) {
				return pedido;
			}
		}
		return null;
	}
	
	public boolean addPedido (Pedido pedido) {
		pedido.setHoraEnvio(new Date());
		pedidoRepository.novoPedido(pedido);
		return true;
	}
	
	public List<Pedido> findAll() {
		return pedidoRepository.findAll();
	}
	
	public void deletePedido(int id) {
		pedidoRepository.deletePedido(findId(id));
	}
	
	public boolean addProduto (String name, int pedidoId) {
		Pedido pedido = findId(pedidoId);
		if (pedido != null) {
			List<Produto> produtos = pedido.getProdutos();
			produtos.add(produtoService.findName(name));
			return true;
		}
		return false;
}
}

