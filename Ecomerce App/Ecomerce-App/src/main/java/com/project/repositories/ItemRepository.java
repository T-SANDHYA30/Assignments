package com.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.entities.Item;

public interface ItemRepository extends JpaRepository<Item,Long>{

}
