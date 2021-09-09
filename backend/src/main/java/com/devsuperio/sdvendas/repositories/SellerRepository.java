package com.devsuperio.sdvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperio.sdvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long>{
    
}
