package com.devsuperio.sdvendas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperio.sdvendas.dto.SaleDTO;
import com.devsuperio.sdvendas.dto.SaleSucessDTO;
import com.devsuperio.sdvendas.dto.SaleSumDTO;
import com.devsuperio.sdvendas.service.SaleService;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {

	@Autowired
	private SaleService service;
	
	@GetMapping
	public ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable) {
		Page<SaleDTO> list = service.findAll(pageable);
		return ResponseEntity.ok(list);
	}
	
	@GetMapping(value = "/amount-by-seller")
	public ResponseEntity<List<SaleSumDTO>> amountGroupedBySeller() {
		List<SaleSumDTO> list = service.amountGroupedBySeller();
		return ResponseEntity.ok(list);
	}
	
	@GetMapping(value = "/sucess-by-seller")
	public ResponseEntity<List<SaleSucessDTO>> sucessGroupedBySeller() {
		List<SaleSucessDTO> list = service.sucessGroupedBySeller();
		return ResponseEntity.ok(list);
	}
}