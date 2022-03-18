package com.philemon.globlehi;

public class Employe {
    // Attributs
    private String nom = "Ange";
    private String prenoms = "Didier";
    private int salaireDeBase = 235000;

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

    public int getSalaireDeBase() {
        return salaireDeBase;
    }

    public void setSalaireDeBase(int salaireDeBase) {
        this.salaireDeBase = salaireDeBase;
    }

    // Methodes
    public int calculerSalaire(int nombreHeureJournalier) {
        return (nombreHeureJournalier * 500) + salaireDeBase;
    }
}
