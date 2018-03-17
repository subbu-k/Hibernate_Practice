package com.sm.demo2;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Bike {

@Id
private int model_no;
private String name;
private String brand ;
//Many Bikes can own by one Alien
@ManyToOne
private Alien alien;
public int getModel_no() {
	return model_no;
}
public void setModel_no(int model_no) {
	this.model_no = model_no;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}


public Alien getAlien() {
	return alien;
}
public void setAlien(Alien alien) {
	this.alien = alien;
}
@Override
public String toString() {
	return "Bike [model_no=" + model_no + ", name=" + name + ", brand=" + brand + "]";
}
	

	
	
}
