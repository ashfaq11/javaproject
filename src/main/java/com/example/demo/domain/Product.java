package com.example.demo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name ="product")
@Data
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	String productName;
	String brand;
	String color;
	Double price;
	Integer quantity;
	
}
