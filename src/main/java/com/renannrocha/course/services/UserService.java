package com.renannrocha.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.renannrocha.course.entities.User;
import com.renannrocha.course.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	// retornar todos os usuários do banco de dados
	public List<User> findAll(){
		return repository.findAll();
	}
	
	// retornar por id
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
	
	// inserir
	public User insert(User obj) {
		return repository.save(obj);
	}
	
	// deletar
	public void delete(Long id) {
		repository.deleteById(id);
	}
	
}
