package com.products.Repository;


import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.products.Model.Products;

public interface ProductsRepository extends JpaRepository<Products,Integer> {

	
	  
	  @Query("select e from Products e where e.name=name") List<Products>
	  findByname(@Param("name")String name);
	  
	  @Modifying
	  
	  @Query("update Products p set p.name = inputName, p.category = inputCategory, p.subCategory = inputsubCategory, p.price = inputPrice where p.name = inputName"
	  ) void setProductsInfoByName(String name, String category, String
	  subCategory,double price);
	  
	  @Modifying
	  
	  @Query("delete from Products p where p.name=inputName") void
	  deleteProducts(@Param("name") String name);

	Optional<Products> findByName(String name);
	  
	 
}
