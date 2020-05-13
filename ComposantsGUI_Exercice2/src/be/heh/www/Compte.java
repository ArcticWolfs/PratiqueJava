package be.heh.www;

public interface Compte
{
    public void retrait(double amount);
    public void depot(double amount);
    public double getSolde();
    public void setSolde(double amount);
    public String toString();
    public void calculInterets();
}
