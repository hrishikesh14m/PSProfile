package com.mphatek.ps.service.impl;

import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.mphatek.ps.dao.ProfileDao;
import com.mphatek.ps.model.User;
import com.mphatek.ps.service.ProfileService;

@ExtendWith(MockitoExtension.class)
public class ProfileServiceImplTest {

	@MockBean
	private ProfileDao dao;

	@Autowired
	private ProfileService service;
/*
	@Test
	public void getProfile() {

		User user = new User();
		
		user.setFirstName("hrishikesh");
		user.setLastName("muley");
		user.setEmail("hrisikesh.muley@gmail.com");
		user.setPhone("7020089884");

		Mockito.when(dao.save(user)).thenReturn(user);

		assertEquals(service.createProfile(user), CoreMatchers.equalTo(user));
	}
*/
}
