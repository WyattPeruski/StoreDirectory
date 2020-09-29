package com.store.storeDirectory.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.store.storeDirectory.Entity.Inventory;


public interface PrimeShopDao extends JpaRepository<Inventory,Long> {

	List<Inventory> findAll();
	
}
