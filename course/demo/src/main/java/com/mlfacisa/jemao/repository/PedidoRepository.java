package com.mlfacisa.jemao.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.mlfacisa.jemao.entity.Pedido;
import com.mlfacisa.jemao.entity.Produto;

@Repository
public class PedidoRepository {
	
	private List<Pedido> pedidos = new ArrayList<>();
	
	public PedidoRepository() {
	}

	public List<Pedido> findAll() {
		return pedidos;
	}
	
	public void novoPedido(Pedido pedido) {
		pedidos.add(pedido);
	}
	
	public void deletePedido(Pedido pedido) {
        pedidos.remove(pedido);
    }
	
}
