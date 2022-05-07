package fr.eql.ai111.java.init.oop;

import java.nio.charset.StandardCharsets;

public class Launcher {

    public static void main(String[] args) {

        //instanciation d'un objet avec son constructeur vide


        Dog dog1 = new Dog();

        // instanciation d'un objet avec constructeur surchargé

        Toy dog2Toy = new Toy("babale");

        Jouet jouet1 = new Jouet("peluche");
        Jouet jouet3 = new Jouet("ballon");

        Toy toy2 = new Toy("baton",jouet3);

        Dog dog2 = new Dog("Fido", 8 , 100, 30 ,dog2Toy );

        Dog dog3 = new Dog("felix",7,56,45,dog2Toy,jouet1);

        Dog dog4 = new Dog();

        // affectation des attributs
        dog4.setName("milou");
        dog4.setAge(4);
        dog4.setSize(40);
        dog4.setWeight(20);
        dog4.setToy(toy2);
        dog4.setJouet(jouet3);

       dog1.setName("laika");
       dog1.setAge(12);
       //dog1.setSize(80);
       dog1.setWeight(20);
       dog1.setJouet(jouet1);

    //affichage des attributs

        System.out.println("dog1 :");
        System.out.println(dog1.getName());
        System.out.println(dog1.getSize());
        System.out.println(dog1.getWeight());
        System.out.println(dog1.getAge());

        System.out.println("dog2 :");
        System.out.println(dog2.getName());
        System.out.println(dog2.getSize());
        System.out.println(dog2.getWeight());
        System.out.println(dog2.getAge());

        String dog2ToyName;
        // recuperation du nom du jouet de dog2 en 2 fois
        Toy dog2ToyInstance = dog2.getToy();
        dog2ToyName = dog2ToyInstance.getToyname();
        System.out.println(dog2ToyName);

        // recuperation du nom du jouet en 1 etape
        dog2ToyName =  dog2.getToy().getToyname();
        System.out.println(dog2ToyName);

        System.out.println(dog2.getToy().getToyname());



        System.out.println();
        //si l attribut name est public alors on y accede directement et le changer sans passer par des accesseurs
        //System.out.println(dog1.name);
        //dog1.name = "toto";
        //System.out.println(dog1.name);
     /////////////////////////////////////////////////////////////////////////////////////////////////////

     // Appel des méthodes
     dog1.bark();
     dog2.bark();
     dog1.fetchBall(5);
     dog2.fetchBall(10);

     float ratio = dog1.sizeWeightRatio();
     System.out.println(ratio);

        System.out.println(dog2.toString());

        System.out.println();

        System.out.println((dog1.getJouet().getMyjouet()));
        float ratio2 = dog4.sizeWeightRatio();
        System.out.println(ratio2);


        System.out.println(dog1.toString());
        System.out.println(dog3.toString());
        System.out.println(dog4.toString());
        
    }


}
