package be.heh.www;

public class CahierNotes
{

    private String nomCours;

    public CahierNotes()
    {
        this.nomCours = "TR2TI2- Techniques informatiques 2";
    }

    public void afficheNote()
    {
        String str = getNomCours();
        System.out.println("Bienvenue en " + str);
    }

    /*public void afficheNote (String cours)
    {
        System.out.println("Bienvenu en " + cours);
    }*/

    public String getNomCours()
    {
        return nomCours;
    }

    public void setNomCours(String nomCours)
    {
        this.nomCours = nomCours;
    }

}
