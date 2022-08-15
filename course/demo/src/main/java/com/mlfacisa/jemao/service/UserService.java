package com.mlfacisa.jemao.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mlfacisa.jemao.entity.User;
import com.mlfacisa.jemao.repository.UserRepository;

@Service
public class UserService {
	/*
	 * Injeção de Dependencia objeto depender de outro Autowired
	 */
	@Autowired
	private UserRepository userRepository;

	public User createUser(User user) {
		if (userExist(user.getName())) {
			userRepository.addUser(user);
			return user;
		}
		return null;

	}

	public boolean userExist(String name) {
		User user = findName(name);
		if (user != null) {
			return false;
		}
		return true;
	}

	public void deleteUser(String name) {
		userRepository.deleteUser(findName(name));
	}

	public User findName(String name) {
		List<User> users = userRepository.findAll();
		for (User user : users) {
			if (name.equals(user.getName())) {
				return user;
			}
		}
		return null;
	}

	public List<User> findAll() {
		return userRepository.findAll();
	}
	
	public boolean loginUser(String email, String password) {
		 User user = userRepository.findEmail(email);
		 if (user.getPassword().equals(password)){
			 return true;
		 }
		 return false;
	}

}
