package project.KT2.src;

public class IonMain {
    public static void main(String[] args) throws Exception {
        
        IonClass Hplus = new IonClass("H+", 1, 1);
        IonClass Hminus = new IonClass("H-", 1, -1);
        IonClass NO3 = new IonClass("NO3", 62, -1);
        
        System.out.println("Molecule " + Hplus.getName() + " Charge " + Hplus.getCharge() + " Mass " + Hplus.getMass());
        System.out.println("Molecule " + Hminus.getName() + "Charge " + Hminus.getCharge() + " Mass " + Hminus.getMass());
        System.out.println("Molecule " + NO3.getName() + "Charge " + NO3.getCharge() + " Mass " + NO3.getMass());
    }
}