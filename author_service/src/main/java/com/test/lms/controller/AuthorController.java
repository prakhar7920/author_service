package com.test.lms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.lms.entity.Author;
import com.test.lms.service.AuthorService;

@RestController
public class AuthorController {
	@Autowired
	AuthorService authorService;
		
	public AuthorController(AuthorService authorService) {
		super();
		this.authorService = authorService;
	}

	@GetMapping("/author")
	public List<Author> home() {
		List<Author> list = authorService.getAllAuthors();
		return list;
	}
}
