package com.products.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.checkerframework.common.aliasing.qual.Unique;

@Entity
@Table(name="products")
public class Products {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Unique
	@Column(unique=true)
	@Size(min=3,message="User must have atleast two characters")
	private String name;
	private String category;
	private String subCategory;
	private double price;
	
	
	
	
	
	/*
	 * public Products(int i, String string, String string2, String string3, double
	 * d) { // TODO Auto-generated constructor stub
	 * 
	 * }
	 */
	 
	public Products() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Products(int id, @Unique @Size(min = 3, message = "User must have atleast two characters") String name,
			String category, String subCategory, double price) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.subCategory = subCategory;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getSubCategory() {
		return subCategory;
	}
	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Products [id=" + id + ", name=" + name + ", category=" + category + ", subCategory=" + subCategory
				+ ", price=" + price + "]";
	}
	

}
