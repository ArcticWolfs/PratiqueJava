package be.heh.www;

public class Facture
{
    final int tauxDeTva = 21;
    private int numeroFacture;
    private float montantHT;

    public int getTauxDeTva()
    {
        return tauxDeTva;
    }

    public int getNumeroFacture()
    {
        return numeroFacture;
    }

    public void setNumeroFacture(int numeroFacture)
    {
        this.numeroFacture = numeroFacture;
    }

    public float getMontantHT()
    {
        return montantHT;
    }

    public void setMontantHT(float montantHT)
    {
        if (montantHT > 0)
        {
            this.montantHT = montantHT;
        }
        else
        {
            this.montantHT = 0;
        }
    }

    public Facture()
    {

    }

    public Facture(float montantHT)
    {
        int numero = getNumeroFacture();

        if (ValideMontant(montantHT) == true)
        {
            System.out.println(numero);
            setNumeroFacture(numero++);
        }
        else
        {
            System.out.println("Montant incorect");
        }

    }

    public boolean ValideMontant(float montantHT)
    {
        boolean valide;

        if (montantHT < 0.0)
        {
            valide = false;
        }
        else
        {
            valide = true;
        }

        return valide;
    }

}
