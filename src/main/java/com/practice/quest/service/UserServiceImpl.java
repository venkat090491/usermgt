package com.practice.quest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.quest.entity.User;
import com.practice.quest.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public List<User> getUsers() {
		return userRepository.findAll();
	}

	@Override
	public User createUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public User updateUser(Integer id, User user) {
		User currUser = userRepository.findById(id).get();
		currUser.setName(user.getName());
		currUser.setEmail(user.getEmail());
		return userRepository.save(currUser);
	}

	@Override
	public void deleteUser(Integer id) {
		userRepository.deleteById(id);
	}

}
