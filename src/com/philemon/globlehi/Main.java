package com.philemon.globlehi;

public class Main {

    public static void main(String[] args) {
       Employe monEmploye = new Employe(); // Instanciation de l'object

       int nombreHeurParJour = 8;
       int salaire = monEmploye.calculerSalaire(nombreHeurParJour); // Appel a la méthode calculer salaire
        System.out.println("Le salaire brut de est de : " + salaire);
    }


}
