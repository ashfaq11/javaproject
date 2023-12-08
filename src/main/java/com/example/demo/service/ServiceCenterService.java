package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.ProductRepository.ServiceRepository;
import com.example.demo.domain.Transactions;
import com.example.demo.request.ServiceRequest;

@Service
public class ServiceCenterService {

	
	@Autowired
	ServiceRepository repository;
	public String bookService(ServiceRequest serviceRequest) {
		// map to transaction
		//restcall
		
		Transactions tr = new Transactions();
		repository.save(tr);
		return "";
	}

}
