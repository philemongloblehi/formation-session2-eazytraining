package com.philemon.globlehi;

public class Personne {
    private String nom = "Patrick";
    private String prenoms = "Hermann";
    private int age = 21;
    private float taille = 1.78f;
    private char sexe = 'M';
    private boolean estDeveloppeur = true;
    private String nationalite = "Ivoirienne";

    // Déclaration des getters et setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenoms() {
        return prenoms;
    }

    public void setPrenoms(String prenoms) {
        this.prenoms = prenoms;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getTaille() {
        return taille;
    }

    public void setTaille(float taille) {
        this.taille = taille;
    }

    public char getSexe() {
        return sexe;
    }

    public void setSexe(char sexe) {
        this.sexe = sexe;
    }

    public boolean isEstDeveloppeur() {
        return estDeveloppeur;
    }

    public void setEstDeveloppeur(boolean estDeveloppeur) {
        this.estDeveloppeur = estDeveloppeur;
    }

    public String getNationalite() {
        return nationalite;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }

    public void afficherDetails() {
        System.out.println(nom + " " + prenoms + " est de nationalité " + nationalite);
    }

}
