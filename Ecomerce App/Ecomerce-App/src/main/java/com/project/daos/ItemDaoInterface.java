package com.project.daos;

import java.util.List;
import java.util.Optional;

import com.project.entities.Item;

public interface ItemDaoInterface {
	
	public List<Item> findAll();
	public Optional<Item> findById(Long id);
	public Item save(Item item);
	public Item update(Item item);
	public void delete(Long id);

}
