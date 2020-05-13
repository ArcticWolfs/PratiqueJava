package be.heh.www;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Banque
{
    private List<Compte> comptes = new ArrayList<Compte>();

    public List<Compte> collectionComptes() {
        return comptes;
    }

    public Banque()
    {

    }

    public void addCompte(Compte compte)
    {
        comptes.add(compte);
    }

    public Compte getCompte(int index)
    {
       Compte compte = comptes.get(index);

        return compte;
    }

}
