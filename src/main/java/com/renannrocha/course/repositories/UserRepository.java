package com.renannrocha.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.renannrocha.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
