package com.mphatek.ps.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mphatek.ps.model.User;

public interface ProfileDao extends JpaRepository<User, Integer> {
}
