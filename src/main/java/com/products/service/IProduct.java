package com.products.service;


import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.products.Model.Products;
@Service
@Transactional
public interface IProduct {
	 Products addProducts(Products products);
	
	   Products updateProducts(Products products);
	  
	   List<Products> findAllProducts();
	  
	   Optional<Products> findByName(String name);




	 Products deleteByName(String name);

	 List<Products> findByName();

	 	

}
