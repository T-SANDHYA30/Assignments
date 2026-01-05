package com.project.services;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.controllers.ItemController;
import com.project.daos.ItemDao;
import com.project.entities.Item;
import com.project.exceptions.ItemNotFoundException;

import jakarta.validation.ValidationException;



@Service
public class ItemService implements ItemServiceInterface{
	private static final Logger logger=LoggerFactory.getLogger(ItemService.class);
	
	@Autowired
	ItemDao dao;

	@Override
	@Transactional
	public List<Item> findAll() {
		logger.info("findAll Started");	
		return dao.findAll();
	}

	@Override
	public Item findById(Long id) {
		logger.info("retrieving employee by Id");
		return dao.findById(id)
				.orElseThrow(()->new ItemNotFoundException("Id cannot be negative"));
	}

	@Override
	@Transactional
	public Item save(Item item) {
		logger.info("saving an Item");
		if(item.getItemCost()<1000) {
			throw new ValidationException("Item Cost must be greater than 1000");
		}
		return dao.save(item);
	}

	@Override
	@Transactional
	public Item update(Item item, Long id) {
		logger.info("updating item by id");
		Item exItem= dao.findById(id)
	              .orElseThrow(() -> new ItemNotFoundException("No item found with this id."));

		
			exItem.setItemName(item.getItemName());
			exItem.setItemCost(item.getItemCost());
			return dao.update(exItem);		
	}

	@Override
	@Transactional
	public void delete(Long id) {
		logger.info("deleting item by id");
		Item exItem=dao.findById(id)
				.orElseThrow(()-> new ItemNotFoundException("No item present with this id "+id));
			dao.delete(id);
			System.out.println("Item deleted");
	}

}
