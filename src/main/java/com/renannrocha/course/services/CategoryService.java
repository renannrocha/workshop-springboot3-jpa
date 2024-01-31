package com.renannrocha.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.renannrocha.course.entities.Category;
import com.renannrocha.course.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repository;
	
	// retornar todos os usuários do banco de dados
	public List<Category> findAll(){
		return repository.findAll();
	}
	
	// retornar por id
	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}
	
}
