package be.heh.www;

public class AffichageAllemagne implements Affichage
{
    private float montant;

    @Override
    public void affiche(double montant)
    {
        System.out.println("Der Rechnungsbetrag ist : € " + montant);
    }
}
