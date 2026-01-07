package com.project.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.jaxb.SpringDataJaxb.OrderDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.project.entities.Order;
import com.project.services.OrderService;

import jakarta.validation.Valid;

public class OrderController {
	
	
	@Autowired
	OrderService service;
	
	@GetMapping("/")
	public ResponseEntity<List<Order>> findAll(){
		return new ResponseEntity<>(service.findAll(),HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Order> findById(Long id){
		return new ResponseEntity<>(service.findById(id),HttpStatus.OK);
	}
	@PostMapping("/")
	public ResponseEntity<Order> save(@Valid @RequestBody OrderDto orderDto);
	
	Order order=new Order();
	order.setCustomerName(orderDto.getCustomerName());
	order.setOrdDate(OrderDto.getOrdDate());
	return new ResponseEntity<>(service.save(order, orderDto.getItemIds()),HttpStatus.OK);
	

}
