package com.mphatek.ps.service;

import java.util.List;

import com.mphatek.ps.model.User;

public interface ProfileService {

	public User createProfile(User user);
	public List<User> getProfile();
	public User updateProfile(User user);
	public void deleteUser(int id);
	
}
