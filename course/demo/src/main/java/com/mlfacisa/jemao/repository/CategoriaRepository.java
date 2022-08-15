package com.mlfacisa.jemao.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.mlfacisa.jemao.entity.Categoria;

@Repository
public class CategoriaRepository {
	
	private List<Categoria> categorias;
	
	public CategoriaRepository() {
		this.categorias = new ArrayList<>();
	}
	
	public Categoria addNovaCategoria(Categoria categoria) {
		categorias.add(categoria);
		return categoria;
	}
	
	public void deleteCategoria(Categoria categoria) {
		categorias.remove(categoria);
	}
	
	public List<Categoria> findAll() {
		return categorias;
	}
	
	public Categoria findCategoriaId(int id) {
		for(Categoria categoria: categorias) {
			if (categoria.getId() == id) 
				return categoria;
		}
		return null;
	}
}
