package com.example.demo.service;

import java.util.List;
import java.util.Random;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.demo.ProductRepository.ProductRepository;
import com.example.demo.domain.Product;

@Service
public class ProductService {

	
	@Autowired
	ProductRepository productRepository;
	public Page<Product> getAllProducts(){
		return productRepository.findAll(PageRequest.of(0, 100));
	}
	

    @PersistenceContext
    private EntityManager entityManager;

    public List<Product> findByDynamicFilter(String columnName, String filterValue) {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Product> query = criteriaBuilder.createQuery(Product.class);
        Root<Product> root = query.from(Product.class);
        System.out.println(columnName +"---"+filterValue);
        Predicate predicate = criteriaBuilder.equal(root.get(columnName), filterValue);
        query.where(predicate);

        return entityManager.createQuery(query).getResultList();
    }

	public Product addProduct() {
		// TODO Auto-generated method stub
		Product p = new Product();
		p.setBrand("Nike");
		p.setColor("Blue");
		p.setPrice(new Random().nextDouble(10000));
		p.setProductName("Shoes");
	
		return productRepository.save(p); 
	}
}
