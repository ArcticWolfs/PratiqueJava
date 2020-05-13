package be.heh.www;

public class CompteEpargne implements Compte
{
    private double tauxInteret = 1.5;
    private double solde;

    public double getSolde() {
        return solde;
    }
    public void setSolde(double solde) {
        this.solde = solde;
    }

    public CompteEpargne(Banque banque,double solde)
    {
        banque.addCompte(this);
        this.solde = solde;
    }

    public void calculInterets()
    {
        double total = getSolde() * tauxInteret;
        setSolde(total);
    }

    public void depot(double amount)
    {
        double total = amount + getSolde();

        if (total >= 0)
        {
            setSolde(total);
        }
    }

    public void retrait(double amount)
    {
        double total = getSolde() - amount;

        if (total >= 0)
        {
            setSolde(total);
        }
    }

    public String toString()
    {
        String text = "<Compte epargne> : solde = " + getSolde() + ">";
        return text;
    }
}
