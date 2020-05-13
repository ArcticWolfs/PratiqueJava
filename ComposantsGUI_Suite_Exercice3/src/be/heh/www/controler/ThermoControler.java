package be.heh.www.controler;

import be.heh.www.model.*;
import be.heh.www.vue.*;
import java.awt.*;

public class ThermoControler
{
    private ThermoAffichageFrm affichageFrm;
    private ThermoControleFrm controleFrm;
    private ThermoBouton thermoBouton;
    private ThermoSet thermoSet;

    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                new ThermoControler();
            }
        });
    }

    /**
     * Demande de la vue pour avoir les valeurs à afficher;
     * @param type type d'action listener trigger
     */
    public void calcule_Temp_ControleAffichage(String type,float temp)
    {
        if (type == "BoutonPlus")
        {
            thermoBouton.update("plus",temp);
        }
        if (type == "BoutonMoins")
        {
            thermoBouton.update("moins",temp);
        }
        if (type == "Valider")
        {
            thermoSet.update("text",temp);
        }
    }


    public void setValeur_ThermoUpdate_To_ThermoFrm(String type,String temperature)
    {
        if (type == "affichage")
        {
            affichageFrm.getDegre().setText(temperature);
        }
        if (type == "controle")
        {
            controleFrm.getTemperature().setText(temperature);
        }
    }

    public ThermoControler()
    {
        affichageFrm = new ThermoAffichageFrm(this);
        affichageFrm.setVisible(true);
        controleFrm = new ThermoControleFrm(this);
        controleFrm.setVisible(true);
        thermoSet = new ThermoSet(this);
        thermoBouton = new ThermoBouton(this);
    }
}
