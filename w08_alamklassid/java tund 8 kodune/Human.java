import java.util.*;

public class Human extends Army{
    public Human(String type, int size, int moraleSize){
        this.type = type;
        this.size = size;
        this.moraleSize = moraleSize;
    }
    @Override
    public int getReinforcments(){
        size = size + 5;
        System.out.println("Üksuse suurus " + size);
        return size;

    }

    @Override
    public int fight(){
        Random rand = new Random();
        moraleSize = rand.nextInt(3);
        size = moraleSize * size - 7;
        if(size < 19){
            System.out.println("lahing kaotatud ");
        }
        else{
            System.out.println("lahing võidetud ");
        }
        return size;
    }
    
}