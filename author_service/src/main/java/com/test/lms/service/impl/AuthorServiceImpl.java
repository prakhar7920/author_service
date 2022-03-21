package com.test.lms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.lms.entity.Author;
import com.test.lms.repository.AuthorRepository;
import com.test.lms.service.AuthorService;

@Service
public class AuthorServiceImpl implements AuthorService{
	@Autowired
	AuthorRepository authorRepository;
	
	@Override
	public List<Author> getAllAuthors() {
		return authorRepository.findAll();
	}
}
