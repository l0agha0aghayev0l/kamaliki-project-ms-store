package com.dea.ms_store.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dea.ms_store.entity.Author;

public interface AuthorRepository extends JpaRepository<Author, Long>{
    
}
