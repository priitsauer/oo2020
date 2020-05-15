import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class Calc {

    public static void main(String[] args) throws IOException {
    
        BufferedReader reader = new BufferedReader(new FileReader("jagasis.txt"));
        ArrayList<Integer> basketArray = new ArrayList<Integer>();
        String line;

        
        int placement = 0;
        int sum = 0;
        int arrayLength = 0;
        

        line = reader.readLine();
        // loeb faili masiivi
        while(line != null){
            basketArray.add(Integer.valueOf(line));
            line = reader.readLine();
            arrayLength ++;
            //array.length ei t66ta mingil pohjusel seega loon basic lugeri
        }

        reader.close();

       
        

        //arvutan kogusumma 
        for (int i=0; i <= arrayLength - 1; i++){
            sum += basketArray.get(i);
            System.out.println(sum);

        }

        int j = 0;
        int halfaBucket = basketArray.get(j) ;
        int previousBucket = 0;
        
    
        while (placement == 0)

            if (sum / 2 <= halfaBucket){
                //vaatan ega eelnev koht parem pole
                if(halfaBucket - sum / 2 > sum / 2 - previousBucket){
                    placement = j;
                }
                
                else{
                    placement = j + 1;
                }
            }

            else{
                halfaBucket += basketArray.get(j);
                previousBucket = halfaBucket;
                j++;
            }
        
        
        // kirjutab uude faili
        BufferedWriter writer = new BufferedWriter(new FileWriter("jagaval.txt"));

        System.out.println(placement);
        writer.write(placement + "");
        writer.close();
    }
}