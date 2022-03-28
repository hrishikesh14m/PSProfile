package com.mphatek.ps.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mphatek.ps.dao.ProfileDao;
import com.mphatek.ps.model.User;
import com.mphatek.ps.service.ProfileService;

@Service
public class ProfileServiceImpl implements ProfileService {

	@Autowired
	private ProfileDao dao;

	@Override
	public User createProfile(User user) {
		return dao.save(user);
	}

	@Override
	public List<User> getProfile() {
		return dao.findAll();
	}

	@Override
	public User updateProfile(User user) {
		Optional<User> optional = dao.findById(user.getId());
		if (optional.isPresent()) {
			dao.save(user);
		}
		return user;
	}

	@Override
	public void deleteUser(int id) {
		Optional<User> optional = dao.findById(id);
		if (optional.isPresent()) {
			dao.deleteById(id);
		}
	}

}
