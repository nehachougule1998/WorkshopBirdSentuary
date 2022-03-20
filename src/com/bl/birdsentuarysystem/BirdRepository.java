package com.bl.birdsentuarysystem;
import java.util.HashSet;

import java.util.Set;
public class BirdRepository {
	private Set<Birds> birdSet = new HashSet();
	
     Set getbirdsList(){
       return birdSet;
    }
 	
    void add(Birds bird) {
		 birdSet.add(bird);
    }
	 
    void remove(Birds bird) {
    	 birdSet.remove(bird);
    }
}