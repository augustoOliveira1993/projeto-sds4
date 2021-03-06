package com.devsuperio.sdvendas.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperio.sdvendas.dto.SellerDTO;
import com.devsuperio.sdvendas.entities.Seller;
import com.devsuperio.sdvendas.repositories.SellerRepository;

@Service
public class SellerService{

	@Autowired
	private SellerRepository repository;
	
	@Transactional(readOnly = true)
	public List<SellerDTO> findAll() {
		List<Seller> result = repository.findAll();
		return result.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
	}
}
