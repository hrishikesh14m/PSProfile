package com.mphatek.ps.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mphatek.ps.constants.ProfileConstants;
import com.mphatek.ps.model.User;
import com.mphatek.ps.service.ProfileService;

@RestController
@RequestMapping("/api")
public class ProfileController {

	@Autowired
	private ProfileService service;

	// @PreAuthorize("hasRole('ADMIN')")
	@PostMapping(value = ProfileConstants.CREATE_USER)
	public User createProfile(@Valid @RequestBody User user) {
		return service.createProfile(user);
	}

	@GetMapping(value = ProfileConstants.GET_USER)
	public List<User> getProfile() {
		return service.getProfile();
	}

	// @PreAuthorize("hasRole('ADMIN')")
	@PutMapping(value = ProfileConstants.UPDATE_USER)
	public User updateProfile(@RequestBody User user) {
		return service.updateProfile(user);
	}

	@DeleteMapping(value = ProfileConstants.DELETE_USER)
	public String deleteUser(@PathVariable int id) {
		service.deleteUser(id);
		return "User Deleted Successfully";

	}

}
