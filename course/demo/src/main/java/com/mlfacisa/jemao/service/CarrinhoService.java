package com.mlfacisa.jemao.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mlfacisa.jemao.entity.Carrinho;
import com.mlfacisa.jemao.entity.Pedido;
import com.mlfacisa.jemao.repository.CarrinhoRepository;

@Service
public class CarrinhoService {
	
	@Autowired
	CarrinhoRepository carrinhoRepository;
	
	@Autowired
	UserService userService;
	
	@Autowired
	PedidoService pedidoService;
	
	public Carrinho addCarrinho (Carrinho carrinho) {
		return carrinhoRepository.addNovoCarrinho(carrinho);
	}
	
	public void deleteCarrinho(int id) {
		Carrinho  DeleteCarrinho = carrinhoRepository.findId(id);
		carrinhoRepository.deleteCarrinho(DeleteCarrinho);
	}
	
	public Carrinho findCarrinhoId(int id) {
		return carrinhoRepository.findId(id);
	}
	
	public boolean addPedido(int id, int carrinhoId) {
		Carrinho carrinho = findCarrinhoId(carrinhoId);
		if (carrinho != null) {
			Pedido pedido = pedidoService.findId(id);
			carrinho.addCarrinho(pedido);
			return true;
		}
		return false;
	}
	
	public List<Carrinho> findAll() {
		return carrinhoRepository.findAll();
	
	}
	
	
}
