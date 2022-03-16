package com.philemon.globlehi;

public class Main {

    public static void main(String[] args) {

        // Utilisation de la boucle For pour afficher notre table de multiplication par 2
        // i = i +1 équivaut à i++
        for(int i = 0;  i <= 10; i++) {
            System.out.println("2 x " + i +" = " + 2*i);
        }


        // Utilisation de la boucle While pour afficher notre table de multiplication par 5
        int i = 0;
        while (i <= 10) {
            System.out.println("5 x " + i +" = " + 5*i);
            i++;
        }

        // Utilisation de la boucle Do...While pour afficher notre table de multiplication par 6
        int initialisation = 100;
        do {
            System.out.println("5 x " + initialisation +" = " + 5*initialisation);
            initialisation++;
        } while (initialisation <= 10);



    }


}
