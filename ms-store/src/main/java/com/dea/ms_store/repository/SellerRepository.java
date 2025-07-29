package com.dea.ms_store.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dea.ms_store.entity.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {
    
}
