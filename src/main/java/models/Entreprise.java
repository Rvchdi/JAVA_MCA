package models;

public class Entreprise {
    private int num;
    private String nom;
    private String adresse;

    public Entreprise() {
    }

    public Entreprise(int num, String nom, String adresse) {
        this.num = num;
        this.nom = nom;
        this.adresse = adresse;
    }
    public Entreprise(String nom, String adresse) {
        this.nom = nom;
        this.adresse = adresse;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
}
