package com.dea.ms_store.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dea.ms_store.entity.Genre;

public interface GenreRepository extends JpaRepository<Genre, Long> {
    
}
