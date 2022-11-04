package com.test.connect.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.connect.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	
}
