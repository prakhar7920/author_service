package com.test.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.lms.entity.Author;

public interface AuthorRepository extends JpaRepository<Author, Long>{

}
