package com.service;

import com.bean.User;

public interface UserService
{
	public User login(User user);
	
	public boolean register(User user);
}
