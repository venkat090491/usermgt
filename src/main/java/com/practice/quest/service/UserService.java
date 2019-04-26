package com.practice.quest.service;

import java.util.List;

import com.practice.quest.entity.User;

public interface UserService {
	List<User> getUsers();
	User createUser(User user);
	User updateUser( Integer id, User user);
	void deleteUser(Integer id);
}
