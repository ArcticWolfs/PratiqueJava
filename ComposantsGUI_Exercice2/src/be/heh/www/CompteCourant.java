package be.heh.www;

public class CompteCourant implements Compte
{
    private double solde;

    public double getSolde() {
        return solde;
    }
    public void setSolde(double solde) {
        this.solde = solde;
    }

    public CompteCourant(Banque banque, double solde)
    {
        banque.addCompte(this);
        this.solde = solde;
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
        double cout = amount * 1.05;
        double total = getSolde() - cout;

        if (total >= 0)
        {
            setSolde(total);
        }
    }

    public  void calculInterets()
    {

    }

    public String toString()
    {
        String text = "<Compte courant> : solde = " + getSolde() + ">";
        return text;
    }
}
