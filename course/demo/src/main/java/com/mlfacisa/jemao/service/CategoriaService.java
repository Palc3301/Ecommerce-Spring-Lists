package com.mlfacisa.jemao.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mlfacisa.jemao.entity.Categoria;
import com.mlfacisa.jemao.entity.Produto;
import com.mlfacisa.jemao.repository.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private ProdutoService produtoService;
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public Categoria crieCategoria(Categoria categoria) {
		return categoriaRepository.addNovaCategoria(categoria);
	}
		
	public void deleteCategoria(int id) {
		Categoria DeleteCategoria = categoriaRepository.findCategoriaId(id);
		categoriaRepository.deleteCategoria(DeleteCategoria);
	}
	
	public Categoria findCategoriaId (int id) {
		return categoriaRepository.findCategoriaId(id);
	}
	
	public boolean addProduto (String name, int categoriaId) {
		Categoria categoria = findCategoriaId(categoriaId);
		if (categoria != null) {
			List<Produto> produtos = categoria.getProdutos();
			produtos.add(produtoService.findName(name));
			return true;
		}
		return false;
		
	}
	
	public List<Categoria> findAll() {
		return categoriaRepository.findAll();
	
	}
}
