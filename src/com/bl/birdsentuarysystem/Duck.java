package com.bl.birdsentuarysystem;

public class Duck extends Birds implements Flyable,Swimmable{
	
	public Duck(String id) {
   		 this.id = id;
		 name = "duck";
		 color = Color.WHITE;
	}

		@Override
	    public	void fly(){
			System.out.println( "duck can fly");
		}

        @Override
        public void swim(){
	       System.out.println("duck can swim");
}
}


