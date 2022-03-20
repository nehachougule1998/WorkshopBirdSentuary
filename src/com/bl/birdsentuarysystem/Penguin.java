package com.bl.birdsentuarysystem;

public class Penguin extends Birds implements Swimmable{
	
	public Penguin(String id) {
		 this.id = id;
		 name = "penguin";
		 color = Color.BLACK_WHITE;
	}
	
	@Override
	public void swim(){
		System.out.println("Penguin can swim");
	}
	}


