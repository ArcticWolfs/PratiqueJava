package be.heh.www;

public class CompteBancaire
{
    public double getSolde()
    {
        return solde;
    }

    private double solde;

    public  CompteBancaire()
    {
        this.solde = 0.0;
    }

    public CompteBancaire(double solde)
    {
        if(solde < 0.0)
        {
            this.solde = 0.0;
        }
        else
        {
            this.solde = solde;
        }
    }

    public void Depot(double depot)
    {
        double s = getSolde();
        s = s + depot;
        solde = s;
    }

    public void afficherSolde()
    {
        System.out.println("Votre compte a : " + getSolde());
    }


}
