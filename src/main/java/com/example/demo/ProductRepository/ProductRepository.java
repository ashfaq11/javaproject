package com.example.demo.ProductRepository;

import java.util.List;

import org.hibernate.annotations.Sort;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
	
	@Query("Select p from Product p")
	public List<Product> getAllProducts();
	
//	List<Product> findByLastName(String lastName, Sort sort);

	
    Page<Product> findAll(Pageable pageable);

	
	

	
}
