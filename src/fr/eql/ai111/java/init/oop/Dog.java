package fr.eql.ai111.java.init.oop;
 //POJO    plain old java object

public class Dog {

    //attribus
    private String name;
    private int age;               // private et public encapsulation
    private float size;
    private float weight;

    private Toy toy;
    private Jouet jouet;

 /////////////////////////////////////////////////////////////////////////////////////////
    //Constructeurs

    //en l'absence de declaration d'un constructer il y aura par defaut un constructeur vide dispo
    //par contre si un constructeur surchargé est declaré il faut declaer un constructeur vide si besoin

    public Dog() {
       // super();
    }

    public Dog(String name, int age, float size, float weight, Toy toy) {
        this.name = name;
        this.age = age;
        this.size = size;
        this.weight = weight;
        this.toy = toy;
    }

    public Dog(String name, int age, float size, float weight, Toy toy, Jouet jouet) {
        this.name = name;
        this.age = age;
        this.size = size;
        this.weight = weight;
        this.toy = toy;
        this.jouet = jouet;
    }

    public Dog(String name, float weight) {
        this.name = name;
        this.weight = weight;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////
    // méthodes

    public void bark() {
        System.out.println("ouaf ouaf !");
    }
    public void fetchBall(int times){
        System.out.println(name + "  rapporte " + times + " fois la baballe.");
    }
    public float sizeWeightRatio(){
        return size / weight ;
    }
    //accesseurs et mutateurs ( getters et setters)

    public String getName() {
        return name;
    }
    public void setName(String toto) {
        this.name = toto;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public float getSize() {
        return size;
    }
    public void setSize(float size) {
        this.size = size;
    }
    public float getWeight() {
        return weight;
    }
    public void setWeight(float weight) {
        this.weight = weight;
    }

    public Toy getToy() {
        return toy;
    }

    public void setToy(Toy toy) {
        this.toy = toy;
    }

    public Jouet getJouet() {
        return jouet;
    }

    public void setJouet(Jouet jouet) {
        this.jouet = jouet;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", size=" + size +
                ", weight=" + weight +
                ", toy=" + toy +
                ", jouet=" + jouet +
                '}';
    }
}
