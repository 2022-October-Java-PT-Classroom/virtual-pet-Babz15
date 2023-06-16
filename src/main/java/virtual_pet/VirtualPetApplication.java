package virtual_pet;

import java.util.ArrayList;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class VirtualPetApplication {

    public static void main(String[] args) {
        // Interact with a VirtualPet object in this method
        VirtualPet myVirtualPet = new VirtualPet();
        String userSelector = "What would you like to do?. Select whichever number that corresponds to the option you want. ";

        System.out.println("Penny The Parrot ");
        System.out.println("Hunger: " + myVirtualPet.getHunger());
        System.out.println("Thirst: " + myVirtualPet.getThirst());
        System.out.println("Boredom: " + myVirtualPet.getBoredom());
        System.out.println(userSelector);
        ArrayList<String> options = new ArrayList<String>();
        options.add("1. Feed Penny");
        options.add("2. Give Penny Water");
        options.add("3. Play with Penny");
        options.add("4. EXIT");
        System.out.println(options.get(0));
        System.out.println(options.get(1));
        System.out.println(options.get(2));
        System.out.println(options.get(3));
        Scanner userInput = new Scanner(System.in);
        int selection = userInput.nextInt();
        while (selection != 4) {
            if (selection == 1) {
                myVirtualPet.feed();
                System.out.println("Penny's Hunger: " + myVirtualPet.getHunger());
            } else if (selection == 2) {
                myVirtualPet.giveWater();
                System.out.println("Penny's Thirst: " + myVirtualPet.getThirst());
            } else if (selection == 3) {
                myVirtualPet.play();
                System.out.println("Penny's Boredom: " + myVirtualPet.getBoredom());
            } else {
                myVirtualPet.tick();
                System.out.println("Hunger: " + myVirtualPet.getHunger());
                System.out.println("Thirst: " + myVirtualPet.getThirst());
                System.out.println("Boredom: " + myVirtualPet.getBoredom());
            }

            System.out.println(userSelector);
            System.out.println(options.get(0));
            System.out.println(options.get(1));
            System.out.println(options.get(2));
            System.out.println(options.get(3));
            selection = userInput.nextInt();

            // if(selection == 4){
            // break;
        }
    }
    // for(int iCount = 0; iCount > 0; iCount++){
    // if(iCount % 4 == 0){
    // myVirtualPet.tick();
    // System.out.println(myVirtualPet.getHunger());
    // }
    // }
}

// need to fix the minimum values for attributes
