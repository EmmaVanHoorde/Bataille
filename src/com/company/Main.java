package com.company;

public class Main {

    public static void main(String[] args) {
        Joueur j1 = new Joueur("joueur1");
        Joueur j2 = new Joueur("joueur2");

        for(int i = 0; i < 52; i++){
            Carte c1 = j1.tireCarte();
            Carte c2 = j2.tireCarte();

            System.out.println(c1.toString());
            System.out.println(c2.toString());

            if(c1.compareTo(c2)){
                j1.gagnerUnPoint();
            }
            else{
                j2.gagnerUnPoint();
            }
        }
        System.out.println("joueur1: "+j1.getPoint());
        System.out.println("joueur2: "+j2.getPoint());
    }
}
