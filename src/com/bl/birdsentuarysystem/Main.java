package com.bl.birdsentuarysystem;

public class Main {
	 static final int MAINEXIT = 5;
	    void addbird() {
           //to do bird creation via user input
			Penguin penguin = new Penguin("D001");
			Penguin penguin2 = new Penguin("D001");
			Duck duck = new Duck("D002");
			Parrot parrot = new Parrot("D003");
			Ostrich ostrich = new Ostrich("D004");
			Pigeon pigeon = new Pigeon("D005");
			
			BirdRepository birdrepository = new BirdRepository();
			
			birdrepository.add(penguin);
			birdrepository.add(penguin2);
			birdrepository.add(duck);
			birdrepository.add(parrot);
			birdrepository.add(ostrich);
			birdrepository.add(pigeon);
		}
     void HandleUserSelection(int option){
    	 switch (option) {
    	 case 1:
    		 addbird();
    		  break;
        case 2:
        	System.out.println("enter bird id u want to remove");
		     break;
	    case 3:
		     break;
	    case 4:
		     break;
	    case MAINEXIT:
	    	 System.out.println("tata byby");
		     break;
		     
		 default:
			 System.out.println("choose proper option");
	 }
 } 
    public static void main(String[] args) {
    	
		System.out.println("welcome to bird sentuary");
	    UserInterface userinterface = new UserInterface();
	    Main main = new Main();
	    int option;
	  do {
	    option = userinterface.showMainMenu();
        main.HandleUserSelection(option);
      }
	    while (option != MAINEXIT);
    
        

//		Penguin penguin = new Penguin("D001");
//		Penguin penguin2 = new Penguin("D001");
//		Duck duck = new Duck("D002");
//		Parrot parrot = new Parrot("D003");
//		Ostrich ostrich = new Ostrich("D004");
//		Pigeon pigeon = new Pigeon("D005");
//		
//		BirdRepository birdrepository = new BirdRepository();
//		
//		birdrepository.add(penguin);
//		birdrepository.add(penguin2);
//		birdrepository.add(duck);
//		birdrepository.add(parrot);
//		birdrepository.add(ostrich);
//		birdrepository.add(pigeon);
//		
//		UserInterface ui = new UserInterface();
//		ui.print(birdrepository.getbirdsList());
//		System.out.println("..........");
//		ui.printswimmable(birdrepository.getbirdsList());
//		System.out.println("..........");
//		ui.printflyable(birdrepository.getbirdsList());
//	    
//		birdrepository.remove(pigeon);
//	    birdrepository.remove(parrot);
//	    System.out.println("..........");
//	    System.out.println("removed 2 birds");
//	    ui.print(birdrepository.getbirdsList());
//	    
	   	}
}
