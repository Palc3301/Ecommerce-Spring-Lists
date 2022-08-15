package com.ecommercefacisa1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommercefacisa1.entities.User;


public interface UserRepository extends JpaRepository<User, Long> {

}
