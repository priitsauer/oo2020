package project.KT2.src;

public interface Ions {
    String name = "Ion name";
    double atomicMass = 0;
    int nucCharge = -1;
    
    public String getName();
    public int getMass();
    public int getCharge();

}