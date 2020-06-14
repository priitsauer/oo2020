import java.util.Random;

public class MyThread implements Runnable {

    private Thread thread;
    private String tName;
    private boolean succsess;
    private int points;
    


    public MyThread(String tName, int inter) {
        this.tName = tName;
    }

    public void run() {
        Random rand = new Random();
        try {
            for (int i = 0; i < 5; i++) {
                succsess = rand.nextBoolean();
                if(succsess == true){
                    points++;
                    System.out.println(tName + ": " + points);
                    
                }else{
                    System.out.println(tName + ": m66da");
                    
                }
                Thread.sleep(1000);

            }
            System.out.println(tName +" lõpptulemus :" + points);    
        } catch (InterruptedException e) {
            // TODO: handle exception
            System.out.println("Thread " + tName + " dead");
        }
    }

    public void start() {
        System.out.println("Thread " + tName + " starting");
        if (thread == null) {
            thread = new Thread(this, tName);
            thread.start();
    }
    }
}