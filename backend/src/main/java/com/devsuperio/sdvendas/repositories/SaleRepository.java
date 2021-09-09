package com.devsuperio.sdvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperio.sdvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{
    
}
