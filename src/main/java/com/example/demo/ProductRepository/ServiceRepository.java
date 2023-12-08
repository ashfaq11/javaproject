package com.example.demo.ProductRepository;

import java.util.List;

import org.hibernate.annotations.Sort;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.Product;
import com.example.demo.domain.Transactions;

@Repository
public interface ServiceRepository extends JpaRepository<Transactions, Long>{
	 

	
	

	
}
