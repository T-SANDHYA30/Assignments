package com.project.entities;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;


@Entity
@Table(name="orderss")
public class Order {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long ordId;
	@NotNull
	private LocalDate ordDate;
	@NotBlank(message ="customer nmae must not be null")
	@Size(min=3,message="Id must me more than 3 char")
	private String customerName;
	private List<Item> itemList;

}
