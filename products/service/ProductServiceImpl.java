package com.products.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.products.Model.Products;
import com.products.Repository.ProductsRepository;
@Service
public class ProductServiceImpl implements IProduct {
	@Autowired
	 ProductsRepository dao;
	 public Products addProducts(Products products) {
		
	Products product=dao.save(products);
	
		return products;
	}
	 
	 //Finding all Products From DB
	 public List<Products> findAllProducts() 
		{
			List<Products> products=dao.findAll();
			return products;
		}
		
		
		  @Override public Optional<Products> findByName(String name) { 
			  Optional<Products> products=dao.findByName(name); 
			  return products; }
		  
		  
		  
		  @Override 
		  public Products updateProducts(Products products) {
		  Products product=dao.save(products); return products; }

		/*
		 * @Override public Products deleteProducts(Products products) { // TODO
		 * Auto-generated method stub Products product=dao.saveAndFlush(products);
		 * return null; }
		 */

		@Override
		public Products deleteProducts(String name) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Products deleteByName(String name) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<Products> findByName() {
			// TODO Auto-generated method stub
			return null;
		}

		
		  
		  
		  
		  
	
		 	
}
