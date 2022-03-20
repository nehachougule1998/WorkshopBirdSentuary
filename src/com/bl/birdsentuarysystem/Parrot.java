package com.bl.birdsentuarysystem;

public class Parrot extends Birds implements Flyable{
	
	public Parrot(String id) {
		this.id = id;
	    name = "parrot";
	    color = Color.GREEN;
	}
	
	@Override
	public void fly(){
		System.out.println("parrot can fly");
	}
	}


