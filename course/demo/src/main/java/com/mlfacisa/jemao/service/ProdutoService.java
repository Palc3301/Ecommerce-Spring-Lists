package com.mlfacisa.jemao.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mlfacisa.jemao.entity.Produto;
import com.mlfacisa.jemao.repository.ProdutoRepository;

@Service
public class ProdutoService {
	
		@Autowired
		private ProdutoRepository produtoRepository;

		public Produto addProduto(Produto produto) {
				produtoRepository.addProduto(produto);
				return produto;
		}

		public void deleteProduto(String produto) {
			produtoRepository.deleteProduto(findName(produto));
		}

		public Produto findName(String name) {
			List<Produto> Produtos = produtoRepository.findAll();
			for (Produto Produto : Produtos) {
				if (name.equals(Produto.getName())) {
					return Produto;
				}
			}
			return null;
		}

		public List<Produto> findAll() {
			return produtoRepository.findAll();
		}

	}

