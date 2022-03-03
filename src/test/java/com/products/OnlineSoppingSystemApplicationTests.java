package com.products;

import static org.junit.Assert.assertEquals;

import static org.mockito.Mockito.when;

import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.products.Model.Products;
import com.products.Repository.ProductsRepository;
import com.products.service.IProduct;

@SpringBootTest
@RunWith(SpringRunner.class)
class OnlineSoppingSystemApplicationTests {

		@Autowired
	 IProduct service;
	
	@MockBean
	 ProductsRepository repository;
	
	

	@Test
	public void getProductsAddTest() {
		when(repository.findAll()).thenReturn(
				 Stream.of(new Products(123,"Fridge","HomeNeeds","Kitchen",10000.00),new Products(1234,"Fridge","HomeNeeds","Kitchen",10000.00)).collect(Collectors.toList()));
		assertEquals(2,service.findAllProducts().size());
	}
	
	/*
	 * @Test public void getProductsByName() { String city = "chennai";
	 * when(repository.findByName(name)) .thenReturn(Stream.of(new
	 * Products(123,"Fridge","HomeNeeds","Kitchen",10000.00)).collect(Collectors.
	 * toList()));
	 * 
	 * assertEquals(2, service.findByName(name).size()); }
	 */

	
	
	@Test
	public void saveUser() {
		Products products = new Products(123,"Fridge","HomeNeeds","Kitchen",10000.00);
		when(repository.save(products)).thenReturn(products);
		assertEquals(products, service.addProducts(products));

	} 
}
