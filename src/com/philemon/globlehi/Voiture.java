package com.philemon.globlehi;

public class Voiture {
    // Déclaration de l'attribut couleur
    private String couleur = "Rouge";

    // Déclaration de l'attribut kilométrage
    private float kilometrage = 340.7f;

    // Déclaration de l'attribut marque
    private String marque = "Range Rover";

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public float getKilometrage() {
        return kilometrage;
    }

    public void setKilometrage(float kilometrage) {
        this.kilometrage = kilometrage;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void afficherCaracteristiques() {
        System.out.println("Ma voiture a les caracteristiques suivantes: " + "Couleur: " + couleur + " Kilométrage : " + kilometrage + " Marque : " + marque);
    }

}
