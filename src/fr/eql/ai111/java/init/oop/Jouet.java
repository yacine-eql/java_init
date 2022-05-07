package fr.eql.ai111.java.init.oop;

public class Jouet {

    private String myjouet ;

    public Jouet(String myjouet) {
        this.myjouet = myjouet;
    }

    public String getMyjouet() {
        return myjouet;
    }

    public void setMyjouet(String myjouet) {
        this.myjouet = myjouet;
    }

    @Override
    public String toString() {
        return "Jouet{" +
                "myjouet='" + myjouet + '\'' +
                '}';
    }
}
