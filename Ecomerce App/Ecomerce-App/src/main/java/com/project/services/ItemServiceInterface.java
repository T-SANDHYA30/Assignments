package com.project.services;

import java.util.List;

import com.project.dtos.ItemDto;
import com.project.entities.Item;

public interface ItemServiceInterface {
	
	public List<Item> findAll();
	public Item findById(Long id);
	public Item save(Item item);
	public Item update(ItemDto itemDto,Long id);
	public void delete(Long id);
	
	

}
