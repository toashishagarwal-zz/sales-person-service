package com.example.springboot.salespersonservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.salespersonservice.model.SalesPerson;
import com.example.springboot.salespersonservice.service.SalesPersonService;

@RestController
public class SalesPersonServiceController {

	@Autowired SalesPersonService salesPersonService;
	
	@GetMapping("/salespersons/{sortBy}")
	public List<SalesPerson> getSalesPerson(@PathVariable String sortBy){
		return salesPersonService.getSalesPerson(sortBy);
	}
}
