package com.store.storeDirectory.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="member_info")
public class Results {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;
private String name;
private String username;
private String password;
private Integer card;
private Integer admin;

public Results() {
	
	
	
}
public Results(Long id, String name, String username, String password, Integer card, Integer admin) {
	
	super();
	this.id = id;
	this.name = name;
	this.username = username;
	this.password = password;
	this.card = card;
	this.admin = admin;
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
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public Integer getCard() {
	return card;
}
public void setCard(Integer card) {
	this.card = card;
}
public Integer getAdmin() {
	return admin;
}
public void setAdmin(Integer admin) {
	this.admin = admin;
}
@Override
public String toString() {
	return "Results [id=" + id + ", name=" + name + ", username=" + username + ", password=" + password + ", card="
			+ card + ", admin=" + admin + "]";
}




	
}
