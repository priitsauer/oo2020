package App;

public class Jook{
    public int omaHind;
    public int erikaal;
    public String nimetus;

    

    public Jook(String nimetus, int omaHind, int erikaal) {
        this.omaHind = omaHind;
        this.nimetus = nimetus;
        this.erikaal = erikaal;
    }

    public String getName(){
        return nimetus;
    }

    public int getPrice(){
        return omaHind;
    }

    public int getWeight(){
        return erikaal;
    }

}