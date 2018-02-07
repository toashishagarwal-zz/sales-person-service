package com.example.springboot.salespersonservice.service;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.example.springboot.salespersonservice.model.SalesPerson;

public enum SortByAlgorithm {
	ID {
		boolean match(String condition) {
			return condition.equals("id");
        }
         
		List<SalesPerson> execute(List<SalesPerson> salesPersons) {
			Collections.sort(salesPersons, new Comparator<SalesPerson>(){
				@Override
				public int compare(SalesPerson p1, SalesPerson p2) {
					return p1.getId().compareTo(p2.getId());
				}
			});
			return salesPersons;
        }
	},
	NAME {
		boolean match(String condition) {
			return condition.equals("name");
        }
         
		List<SalesPerson> execute(List<SalesPerson> salesPersons) {
			Collections.sort(salesPersons, new Comparator<SalesPerson>(){
				@Override
				public int compare(SalesPerson p1, SalesPerson p2) {
					return p1.getName().compareTo(p2.getName());
				}
			});
			return salesPersons;
        }
	},
	PRODUCT {
		boolean match(String condition) {
           return condition.equals("product");
        }
         
		List<SalesPerson> execute(List<SalesPerson> salesPersons) {
			Collections.sort(salesPersons, new Comparator<SalesPerson>(){
				@Override
				public int compare(SalesPerson p1, SalesPerson p2) {
					return p1.getProduct().compareTo(p2.getProduct());
				}
			});
			return salesPersons;
        }
	},
	LOCATION {
		boolean match(String condition) {
			return condition.equals("location");
        }
         
		List<SalesPerson> execute(List<SalesPerson> salesPersons) {
			Collections.sort(salesPersons, new Comparator<SalesPerson>(){
				@Override
				public int compare(SalesPerson p1, SalesPerson p2) {
					return p1.getLocation().compareTo(p2.getLocation());
				}
			});
			return salesPersons;
        }
	};
	
	public static SortByAlgorithm getAlgorithmFromCondition(String condition) {		
        for(SortByAlgorithm c : values()) {
            if(c.match(condition))
                return c;
        }
        return null;
    }
     
    abstract boolean match(String condition); 
    abstract List<SalesPerson> execute(List<SalesPerson> salesPersons);
}
