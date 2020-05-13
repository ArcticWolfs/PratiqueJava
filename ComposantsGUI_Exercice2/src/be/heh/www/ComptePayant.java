package be.heh.www;

public class ComptePayant implements Compte
{
    private double solde;

    public double getSolde() {
        return solde;
    }
    public void setSolde(double solde) {
        this.solde = solde;
    }

    public ComptePayant(Banque banque, double solde)
    {
        banque.addCompte(this);
        this.solde = solde;
    }

    public void depot(double amount)
    {
        double cout = amount * 0.95;
        double total = cout + getSolde();

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
        String text = "<Compte payant> : solde = " + getSolde() + ">";
        return text;
    }
}
