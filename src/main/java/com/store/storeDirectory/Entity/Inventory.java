package com.store.storeDirectory.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Inventory")
public class Inventory {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String catagory;
	private Double price;
	
	public Inventory() {
		
		
	}

	public Inventory(Long id, String name, String catagory, Double price) {
		super();
		this.id = id;
		this.name = name;
		this.catagory = catagory;
		this.price = price;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCatagory() {
		return catagory;
	}

	public void setCatagory(String catagory) {
		this.catagory = catagory;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Inventory [id=" + id + ", name=" + name + ", catagory=" + catagory + ", price=" + price + "]";
	}
	
	

}
