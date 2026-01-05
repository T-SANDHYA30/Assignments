package com.project.daos;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.entities.Item;
import com.project.repositories.ItemRepository;

@Repository
public class ItemDao implements ItemDaoInterface {
	
	@Autowired
	ItemRepository repository;
	
	public List<Item> findAll(){
		return repository.findAll();
	}
	
	public Optional<Item> findById(Long id) {
		return repository.findById(id);
	}

	public Item save(Item item) {
		return repository.save(item);
	}

	@Override
	public Item update(Item item) {
		return repository.save(item);
	}

	@Override
	public void delete(Long id) {	
		repository.deleteById(id);
	}

}
