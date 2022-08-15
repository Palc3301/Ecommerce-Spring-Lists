 package com.mlfacisa.jemao.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.mlfacisa.jemao.enums.PedidoStatus;

public class Pedido {
	
	private int id;
	private Date horaEnvio;
	private PedidoStatus pedidoStatus;
	private String name;
	private List<Produto> produtos = new ArrayList<>();
	
	public Pedido(int id, Date horaEnvio, PedidoStatus pedidoStatus, String name) {
		super();
		this.id = id;
		this.horaEnvio = horaEnvio;
		this.pedidoStatus = pedidoStatus;
		
		this.name = name;
	}

	public Pedido() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public PedidoStatus getPedidoStatus() {
		return pedidoStatus;
	}

	public void setPedidoStatus(PedidoStatus pedidoStatus) {
		this.pedidoStatus = pedidoStatus;
	}


	public Date getHoraEnvio() {
		return horaEnvio;
	}


	public void setHoraEnvio(Date date) {
		this.horaEnvio = date;
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


	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	
	
}
