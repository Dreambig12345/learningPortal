package com.dreambig.service;

import com.dreambig.model.User;

public interface UserService {
	public User findUserByEmail(String email);
	public void saveUser(User user);
}
