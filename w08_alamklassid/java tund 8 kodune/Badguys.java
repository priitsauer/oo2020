import java.util.Random;

public class Badguys extends Army {
    Random rand = new Random();
    public Badguys(String type, int size, int moraleSize){
        this.type = type;
        this.size = size;
    }
    @Override
    public int getReinforcments(){
        int reinforments = rand. nextInt(10);
        size = size + reinforments;
        System.out.println("Üksuse suurus " + size);
        return size;

    }

    @Override
    public int fight(){
        int casualtiess = rand.nextInt(100);
        size = size - casualtiess;
        if(size < 19){
            System.out.println("Pahade armee purustatud ");
        }
        else{
            System.out.println("Pahade armee purustatud");
        }
        return size;
    }


    
 
}