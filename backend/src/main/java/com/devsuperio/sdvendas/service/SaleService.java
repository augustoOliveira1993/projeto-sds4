package com.devsuperio.sdvendas.service;

import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.devsuperio.sdvendas.dto.SaleDTO;
import com.devsuperio.sdvendas.entities.Sale;
import com.devsuperio.sdvendas.repositories.SaleRepository;

@Service
public class SaleService{

	@Autowired
	private SaleRepository repository;
	
	public Page<SaleDTO> findAll(Pageable pageable) {
		Page<Sale> result = repository.findAll(pageable);
		return result.map(x -> new SaleDTO(x));
	}
}
