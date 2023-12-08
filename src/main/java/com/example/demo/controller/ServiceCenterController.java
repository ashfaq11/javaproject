package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.request.ServiceRequest;
import com.example.demo.service.ServiceCenterService;

@RestController
public class ServiceCenterController {

	
	@Autowired 
	ServiceCenterService service; 
	
	@PostMapping("/bookService")
	public String bookService(@RequestBody ServiceRequest serviceRequest) {
		
		String transactionId = service.bookService(serviceRequest);
		//validate serviceRequest
		return transactionId;
		
		
	}
	
}
