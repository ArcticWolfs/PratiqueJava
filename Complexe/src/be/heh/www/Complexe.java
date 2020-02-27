package be.heh.www;

public class Complexe
{
    private float reel;
    private float imaginaire;

    public float getReel() {
        return reel;
    }

    public void setReel(float reel) {
        this.reel = reel;
    }

    public float getImaginaire() {
        return imaginaire;
    }

    public void setImaginaire(float imaginaire) {
        this.imaginaire = imaginaire;
    }

    public Complexe()
    {
        this.reel = 1;
        this.imaginaire = 1;

    }

    public Complexe(float reel,float imaginaire)
    {
        this.reel = reel;
        this.imaginaire = imaginaire;

    }

    public void afficherComplexe()
    {

        System.out.println(getReel() + " + " +getImaginaire() + "I");
    }

    public void afficherComplexe2()
    {
        System.out.println("(" + getReel() + "," +getImaginaire() + ")");
    }

    public void additionComplexe(Complexe complexe1,Complexe complexe2)
    {
        float sommeReel = complexe1.getReel() + complexe2.getReel();
        float someImaginaire = complexe1.getImaginaire() + complexe2.getImaginaire();
        System.out.println("La somme des deux complexe vaut : " + sommeReel + " + " + someImaginaire + "I");
    }

    public void soustractionComplexe(Complexe complexe1,Complexe complexe2)
    {
        float sommeReel = complexe1.getReel() - complexe2.getReel();
        float someImaginaire = complexe1.getImaginaire() - complexe2.getImaginaire();
        System.out.println("La somme des deux complexe vaut : " + sommeReel + " + " + someImaginaire + "I");
    }
}
