package be.heh.www;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employe
{
    private String nom;
    private Date dateNaissance;

    public Date getDateNaissance()
    {
        return dateNaissance;
    }

    public Employe()
    {

    }

    public Employe(String nom, int jour , int mois , int annee )
    {
        this.nom = nom;
        GregorianCalendar calendrier = new GregorianCalendar ( annee , mois-1, jour );
        dateNaissance = calendrier.getTime();
    }
}
