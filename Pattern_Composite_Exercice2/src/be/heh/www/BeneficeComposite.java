package be.heh.www;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class BeneficeComposite implements Benefice
{
    private Collection BeneficeListe;

    public BeneficeComposite()
    {
        BeneficeListe = new ArrayList();
    }

    public void add(Benefice benefice)
    {
        BeneficeListe.add(benefice);
    }

    public void remove(Benefice benefice)
    {
        BeneficeListe.remove(benefice);
    }

    public Iterator getBeneficeListe()
    {
        return BeneficeListe.iterator();
    }

    @Override
    public float getBenefice()
    {
        float beneficeTotale = 0;
        for (Iterator i = BeneficeListe.iterator(); i.hasNext(); )
        {
            Object objet = i.next();
            Benefice benefice = (Benefice)objet;

            beneficeTotale += benefice.getBenefice();
        }
        return beneficeTotale;
    }
}
