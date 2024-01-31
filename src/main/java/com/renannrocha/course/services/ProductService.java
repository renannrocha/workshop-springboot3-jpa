package com.renannrocha.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.renannrocha.course.entities.Product;
import com.renannrocha.course.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	// retornar todos os usuários do banco de dados
	public List<Product> findAll(){
		return repository.findAll();
	}
	
	// retornar por id
	public Product findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}
	
}
