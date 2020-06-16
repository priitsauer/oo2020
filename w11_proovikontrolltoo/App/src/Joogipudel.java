package App;

public class Joogipudel{
    public int mass;
    public int maht;
    public int price;
    public Bottles pudeliTyyp;
    public String taara;
    public Jook sisu;


    public Joogipudel(int maht, Bottles pudeliTyyp, int price, Jook sisu){
        this.maht = maht;
        this.pudeliTyyp = pudeliTyyp;
        this.price = price;
        
   }
   public int getVolume(){
        return maht;
    }
    
    public int getMass(){
        return mass;
    }

    public void filledBottle(Jook sisu){
        this.sisu = sisu;
}


public int wholeMass(){
    if(sisu == null){
        return mass;
    } else {
        return sisu.getWeight()*maht + mass;
    }
}

public int fullPrice(){
    if(sisu == null){
        return price;
    } else {
        return maht*sisu.getPrice() + price;
    }
}

public int bottleMass(){
    if (pudeliTyyp == Bottles.GLASS) {
        mass = 20;
    } else if(pudeliTyyp == Bottles.CAN) {
        mass = 10;
    }else if(pudeliTyyp == Bottles.BOX) {
        mass = 5;
    }else{
        mass = 1;
    }
    return mass;
}
}