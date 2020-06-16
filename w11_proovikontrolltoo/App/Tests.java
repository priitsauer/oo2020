package app;

import org.junit.Test;
import roulette.Round;

import static org.junit.Assert.*;

public class MainTest {


  
    @Test
    public Void calculator(){
        Jook Sprite = new Jook("Sprite",3,1);
        Joogipudel klaas = new Joogipudel( 10, Bottles.GLASS, 5, Sprite);
        assertTrue(klaas.mass == 20);
    }
    // testib kas mass on 6ige
    public static void main(String[] args) {
        
    }

}