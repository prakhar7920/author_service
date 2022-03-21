package com.test.lms.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.test.lms.entity.Author;

public interface AuthorService {
	public List<Author> getAllAuthors();
}
