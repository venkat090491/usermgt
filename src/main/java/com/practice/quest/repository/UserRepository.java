package com.practice.quest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practice.quest.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	

}
