import java.util.Scanner;
import java.util.Random;

/**
 * sixth
 */
public class sixth {
    public static void main(String[] args) {
        System.out.println("See programm sorteerib massiive");
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("sisesta massiivi suurus"); 
        Integer size  = myObj.nextInt(); //size is used for loop size
        int[] array = myMethod(size);//get my array back
        myObj.close();//sclose scanneri
        System.out.println(array[0]);
        PrintArray(array);
        int[] sorted = Bubble(array);//
        System.out.println(sorted[0]);
        PrintArray(sorted);
    }
    
    public static String PrintArray(int[] array){//print beatiful array
        String ret = "";
        
        for (int i : array) {
            System.out.print(i);
            System.out.print(",");
        }
        return ret;
    }

    public static int[] myMethod(int size){
        int[] array;//create array
        array = new int[size];//array size
        int n = 0;//create counter
        for (int i = 0; i < size; i++){
            Random random = new Random();
            int randomInteger = random.nextInt(100);;//generating random numbers
            array[n] = randomInteger;//give number to array
            n++;
        } 
        return array;
}
    public static int[] Bubble(int[] array){
        int len = array.length;
        for (int i = 0; i < len - 1; i++) {//compares first element with all others
            for (int j = 0; j < len-i-1; j++) //does the same with next elements
                if (array[j] > array[j+1]) 
                { 
                    // changes the spot in array
                    int temp = array[j]; 
                    array[j] = array[j+1]; 
                    array[j+1] = temp; 
                } 
            }    
        return array;
}
}