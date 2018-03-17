package com.sm.demo2;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Alien {
	
	@Id
	private int id;
	//private String name;
	
	private Name name;
	
	private int points;
	//One Alien Can Have Many Bike's(mappedBy="alien" is mapped is done by bike table with alien_id column [alien object mentioned in Bike Entity])
	@OneToMany(mappedBy="alien")
	private List<Bike> bike;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public Name getName() {
		return name;
	}
	public void setName(Name name) {
		this.name = name;
	}
	
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	
	public List<Bike> getBike() {
		return bike;
	}
	public void setBike(List<Bike> bike) {
		this.bike = bike;
	}
	@Override
	public String toString() {
		return "Alien [id=" + id + ", name=" + name + ", points=" + points + ", bike=" + bike + "]";
	}

	
	
	
}
