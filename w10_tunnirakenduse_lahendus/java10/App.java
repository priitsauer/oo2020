public class App {
    public static void main(String[] args) throws Exception {
        MyThread myThread1 = new MyThread("Aeglasem m4ngja", 1000);
        MyThread myThread2 = new MyThread("Kiirem m4ngija", 700);
        myThread1.start();
        myThread2.start();
    }
}