package com.mlfacisa.jemao.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.mlfacisa.jemao.entity.Carrinho;
import com.mlfacisa.jemao.entity.Categoria;

@Repository
public class CarrinhoRepository {
	
private List<Carrinho> carrinhos;
	
	public CarrinhoRepository() {
		this.carrinhos = new ArrayList<>();
	}
	public Carrinho addNovoCarrinho(Carrinho carrinho) {
		carrinhos.add(carrinho);
		return carrinho;
	}
	
	public void deleteCarrinho(Carrinho carrinho) {
		carrinhos.remove(carrinhos);
	}
	
	public List<Carrinho> findAll() {
		return carrinhos;
	}
	public Carrinho findId(int id) {
		for (Carrinho carrinho : carrinhos) {
			if (carrinho.getId() == id)
				return carrinho;
		}
		return null;
	}
}
