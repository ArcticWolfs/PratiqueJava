package be.heh.www;

public class Rationnel
{
    private int numerateur;
    private int denominateur;

    public int getNumerateur() {
        return numerateur;
    }

    public int getDenominateur() {
        return denominateur;
    }

    public Rationnel(int numerateur)
    {
        this.numerateur = numerateur;
        this.denominateur = 1;
    }

    public Rationnel(int numerateur,int denominateur)
    {
        this.numerateur = numerateur;
        this.denominateur = denominateur;
    }

    public Rationnel plus(Rationnel rationnelPlus)
    {

        return rationnelPlus;
    }
}
