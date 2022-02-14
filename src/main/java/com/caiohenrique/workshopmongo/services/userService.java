package com.caiohenrique.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caiohenrique.workshopmongo.domain.User;
import com.caiohenrique.workshopmongo.repository.userRepository;
import com.caiohenrique.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class userService {
	
	@Autowired
	private userRepository repo;

	public List<User> findAll(){
		return repo.findAll();
	}
	
	public User findById(String id) {
		Optional<User> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
}
