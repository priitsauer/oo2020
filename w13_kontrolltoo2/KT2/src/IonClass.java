package project.KT2.src;

public class IonClass implements Ions{
    
    String name;
    int atomicMass;
    int nucCharge;
    
    public IonClass(String name, int atomicMass, int nucCharge){
        
        this.name = name;
        this.atomicMass = atomicMass;
        this.nucCharge = nucCharge;
    
    }
    
    @Override


    public String getName() {
        return name;
    }

    public int getCharge() {
        return nucCharge;
    }
    public int getMass() {
        return atomicMass;
    }
}
    
