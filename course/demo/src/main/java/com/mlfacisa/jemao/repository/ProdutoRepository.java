package com.mlfacisa.jemao.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.mlfacisa.jemao.entity.Produto;

@Repository
public class ProdutoRepository {
	
	private final List<Produto> produtos;
	
	public ProdutoRepository(){
        this.produtos = new ArrayList<>();
    }

    public void addProduto(Produto produto) {
        produtos.add(produto);
    }

    public void deleteProduto(Produto produto) {
        produtos.remove(produto);
    }

    public List<Produto> findAll() {
        return produtos;
    }

    public Produto findProdutoName(String name) {
        for (Produto produto : produtos) {
            if (name.equals(produto.getName())); 
            	return produto;
        }
        return null;
    }
    
    public Produto findProdutoDescription(String description) {
        for (Produto produto : produtos) {
            if (description.equals(produto.getDescription())) return produto;
        }
        return null;
}
}