package com.gomlek.coursetwo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gomlek.coursetwo.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
