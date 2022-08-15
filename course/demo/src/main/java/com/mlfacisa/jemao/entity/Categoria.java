package com.mlfacisa.jemao.entity;

import java.util.ArrayList;
import java.util.List;

public class Categoria {
	
	private Integer id;
	private String name;
	private List<Produto> produtos = new ArrayList<>();
	
	public Categoria() {
	}

	public Categoria(Integer id, String name, List<Produto> produtos) {
		super();
		this.id = id;
		this.name = name;
		this.produtos = produtos;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}
	
}
