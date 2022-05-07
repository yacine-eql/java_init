package fr.eql.ai111.java.init.oop;

public class Toy {

    private String toyname;
    private Jouet jouet;

    public Toy(String toyname, Jouet jouet) {
        this.toyname = toyname;
        this.jouet = jouet;
    }

    public Toy(String toyname) {
        this.toyname = toyname;
    }

    public String getToyname() {
        return toyname;
    }

    public void setToyname(String toyname) {
        this.toyname = toyname;
    }

    public Jouet getJouet() {
        return jouet;
    }

    public void setJouet(Jouet jouet) {
        this.jouet = jouet;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "toyname='" + toyname + '\'' +
                ", jouet=" + jouet +
                '}';
    }
}
