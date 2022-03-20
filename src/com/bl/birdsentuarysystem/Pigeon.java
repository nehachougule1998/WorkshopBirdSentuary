package com.bl.birdsentuarysystem;

public class Pigeon extends Birds implements Flyable{
	
	public Pigeon(String id) {
		this.id = id;
	    name = "pigeon";
	    color = Color.RED;
	}
	
	@Override
	 public void fly(){
		System.out.println(" Pigeon can fly");
	}
}