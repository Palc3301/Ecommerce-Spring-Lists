package com.mlfacisa.jemao.entity;

import com.mlfacisa.jemao.enums.UserEnums;

public class User {
	
	private static final long serialVersionUID = 1L;

		
		private Long id;
	    private String name;
	    private String email;
	    private String phone;
	    private String password;
	    private Double balance;
	    private UserEnums typeUser;
	    //private UserEnums typeUser;
	    //private Cart userCart = new Cart();
	    //private List<String> userOrders = new ArrayList<>();	
	public User() {
		
	}

	public User(Long id, String name, String email, String phone, String password, Double balance, UserEnums typeUser) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.password = password;
		this.balance = balance;
		this.typeUser = typeUser;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}
	
	
	
	
	

}
