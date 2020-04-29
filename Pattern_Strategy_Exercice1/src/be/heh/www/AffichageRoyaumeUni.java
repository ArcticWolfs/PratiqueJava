package be.heh.www;

public class AffichageRoyaumeUni implements Affichage
{
    private float montant;

    @Override
    public void affiche(double montant)
    {
        System.out.println("The amount of the invoice is : £ " + montant);
    }
}
