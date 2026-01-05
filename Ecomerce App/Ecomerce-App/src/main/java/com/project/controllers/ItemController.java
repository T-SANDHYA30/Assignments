package com.project.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.entities.Item;
import com.project.services.ItemService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/item")
public class ItemController {
	private static final Logger logger=LoggerFactory.getLogger(ItemController.class);
	
	@Autowired
	ItemService service;
	
	@GetMapping("/")
	public ResponseEntity< List<Item>> findAll(){
		logger.info("findAll Started");
		return new ResponseEntity<>(service.findAll(),HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Item> findById(@PathVariable Long id) {
		logger.info("retrieving employee by Id");
		if(id<=0)
			throw new IllegalArgumentException("id cannot be negative");
		return new ResponseEntity<>(service.findById(id),HttpStatus.FOUND);
		//return service.findById(id);
	}
	
	@PostMapping("/")
	public ResponseEntity<Item> save(@Valid @RequestBody Item item) {
		logger.info("saving an Item");
		Item savedItem=service.save(item);
		return ResponseEntity.status(HttpStatus.CREATED).body(savedItem);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Item> update(@Valid @RequestBody Item item,@PathVariable Long id) {
		logger.info("updating item by id");
		if(id<=0)
			throw new IllegalArgumentException("id cannot be negative");
		return new ResponseEntity<>(service.update(item, id),HttpStatus.OK);
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<String> delete(@PathVariable Long id) {
		logger.info("deleting item by id");
		if(id<=0)
			throw new IllegalArgumentException("id cannot be negative");
		
		service.delete(id);
		return ResponseEntity.status(HttpStatus.OK)
				.body("item deleted");
	}
	

}
