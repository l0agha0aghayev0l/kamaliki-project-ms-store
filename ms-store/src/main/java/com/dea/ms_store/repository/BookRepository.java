package com.dea.ms_store.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dea.ms_store.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
    
}
