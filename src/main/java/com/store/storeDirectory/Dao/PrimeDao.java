package com.store.storeDirectory.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.store.storeDirectory.Entity.Results;

public interface PrimeDao extends JpaRepository<Results, Long> {

	Results findByUsername(String username);
	
	
	
}
