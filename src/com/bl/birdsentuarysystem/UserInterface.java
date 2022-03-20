package com.bl.birdsentuarysystem;
import java.util.Scanner;
import java.util.Set;
public class UserInterface {
	int showMainMenu() {
		System.out.println("Enter 1:Add bird");
		System.out.println("Enter 2:remove bird");
		System.out.println("Enter 3:edit bird");
		System.out.println("Enter 4:print bird");
		System.out.println(Main.MAINEXIT + ":exit bird");
		
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		return option;
	}
	void print(Set birdlist) {
		for(Object list: birdlist) {
			System.out.println(list);
		}
   	}
	
	void printflyable(Set <Birds> birdSet) {
		for(Birds bird: birdSet) {
			if(bird instanceof Flyable) {
				((Flyable)bird).fly();
			}
		}
	}
	
	void printswimmable(Set <Birds> birdSet) {
		for(Birds bird: birdSet) {
			if(bird instanceof Swimmable) {
				((Swimmable)bird).swim();
           	}  
		}
    }
}