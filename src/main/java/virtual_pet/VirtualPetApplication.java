package virtual_pet;

import java.util.ArrayList;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class VirtualPetApplication {

    public static void main(String[] args) {
        //Interact with a VirtualPet object in this method
    VirtualPet myVirtualPet = new VirtualPet();
    System.out.println("Penny The Parrot ");
    System.out.println("Hunger: " + myVirtualPet.getHunger());
    System.out.println("Thirst: " + myVirtualPet.getThirst());
    System.out.println("Boredom: " + myVirtualPet.getBoredom());
    System.out.println("What would you like to do?. Select whichever number that corresponds to the option you want. ");

    
    ArrayList<String> options = new ArrayList<String>();
    options.add("1. Feed Penny");
    options.add("2. Give Penny Water");
    options.add("3. Play with Penny");
    System.out.println(options);
    Scanner userInput = new Scanner(System.in);
    int selection = userInput.nextInt();
    
    if(selection == 1){
        myVirtualPet.feed();
        System.out.println("Penny's Hunger: " + myVirtualPet.getHunger());
        }
    
    if(selection == 2){
        myVirtualPet.giveWater();
        System.out.println("Penny's Thirst: " + myVirtualPet.getThirst());
        }

    if(selection == 3){
        myVirtualPet.play();
        System.out.println("Penny's Boredom: " + myVirtualPet.getBoredom());
    }
    }

}


