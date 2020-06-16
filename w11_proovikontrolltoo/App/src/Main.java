package App;

public class Main {
    public static void main(String[] args) throws Exception {
        Jook Fanta = new Jook("fanta",4,1);
        Joogipudel Purk = new Joogipudel( 10, Bottles.CAN, 5, Fanta);
        System.out.println(Purk.bottleMass());
        System.out.println(Purk.fullPrice());
    }
}