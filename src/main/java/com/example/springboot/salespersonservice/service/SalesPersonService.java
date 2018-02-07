package com.example.springboot.salespersonservice.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.springboot.salespersonservice.model.SalesPerson;

@Service
public class SalesPersonService {
	
	// Creating a list of sales persons in-memory 
	// In read world scenarios we will call the DAO layer to get the sales persons
	private List<SalesPerson> prepareSalesPersons() {
		List<SalesPerson> salesPersons= new ArrayList<>();
		salesPersons.add(new SalesPerson(1, "Amit", "Books", "Pune"));
		salesPersons.add(new SalesPerson(2, "Radha", "Pens", "Pune"));
		salesPersons.add(new SalesPerson(4, "Rakesh", "Brushes", "Pune"));
		salesPersons.add(new SalesPerson(5, "Sumeet", "Notepads", "Mysore"));
		salesPersons.add(new SalesPerson(6, "Leena", "Files", "Mumbai"));
		salesPersons.add(new SalesPerson(3, "Mohan", "Books", "Indore"));
		return salesPersons;
	}
	
	public List<SalesPerson> getSalesPerson(String sortBy) {
		List<SalesPerson> salesPersons= prepareSalesPersons();
				
		salesPersons=SortByAlgorithm.getAlgorithmFromCondition(sortBy).execute(salesPersons);
		
		return salesPersons;
	}
}
