package com.caiohenrique.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caiohenrique.workshopmongo.domain.User;
import com.caiohenrique.workshopmongo.repository.userRepository;

@Service
public class userService {
	
	@Autowired
	private userRepository repo;

	public List<User> findAll(){
		return repo.findAll();
	}
}
