public class App {
    public static void main(String[] args) throws Exception {
        Army zombies = new Badguys("Zombid",1000,10);
        Army humans = new Human("Inimesed",1000, 10);
        zombies.fight();
        zombies.getReinforcments();
        humans.fight();
        humans.getReinforcments();
    }

}