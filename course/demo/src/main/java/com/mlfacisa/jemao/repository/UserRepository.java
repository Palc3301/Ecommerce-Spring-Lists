package com.mlfacisa.jemao.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.mlfacisa.jemao.entity.User;

@Repository
public class UserRepository {
	
	
	private final List<User> users;
	
	public UserRepository(){
        this.users = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void deleteUser(User user) {
        users.remove(user);
    }

    public List<User> findAll() {
        return users;
    }

    public User findName(String name) {
        for (User user : users) {
            if (name.equals(user.getName())) return user;
        }
        return null;
    }
    
    public User findEmail(String email) {
        for (User user : users) {
            if (email.equals(user.getEmail())) return user;
        }
        return null;
}
}