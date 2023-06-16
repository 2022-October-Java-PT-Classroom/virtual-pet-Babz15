package virtual_pet;

public class VirtualPet {
    private int hunger;
    private int thirst;
    private int boredom;

    public int getHunger(){
        return hunger;
    }

    public int getThirst(){
        return thirst;
    }

    public int getBoredom(){
        return boredom;
    }

    
    public VirtualPet(){
        this.hunger = 4;
        this.thirst = 2;
        this.boredom = 6;
    }

    public void feed(){
        hunger = hunger - 1;
    }

    public void giveWater(){
        thirst = thirst -1;
    }

    public void play(){
        boredom = boredom -1;
    }

    public void tick(){
        hunger = hunger + 1;
        thirst = thirst +1;
        boredom = boredom +1;
    }

    
}
