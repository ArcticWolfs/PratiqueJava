package be.heh.www;

public class Facture
{
    private double montant;

    private Affichage affichage = new Default();

    public Facture(double montant)
    {
       this.montant = montant;
    }

    public void affiche()
    {
        getAffichage().affiche(montant);
    }

    public void setAffichage(Affichage affichage)
    {
        this.affichage = affichage;
    }

    private Affichage getAffichage() {
        return affichage;
    }


}
