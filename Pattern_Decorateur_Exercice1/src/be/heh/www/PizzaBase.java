package be.heh.www;

public abstract class PizzaBase
{
    protected String nom;
    protected double prix;

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setPrix(double prix) {
        this.prix = prix;
    }
    public double getPrix()
    {
        return prix;
    }

    public void afficher()
    {
        System.out.println("Pizza : " + getNom() + ", Prix : " + getPrix());
    }

}
