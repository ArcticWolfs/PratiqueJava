package be.heh.www.model;

import be.heh.www.controler.ThermoControler;

public class ThermoBouton implements ThermoUpdate
{
    private ThermoControler controler;

    public ThermoBouton(ThermoControler controler)
    {
        this.controler = controler;
    }

    public void update(String type,float temperature)
    {
        float total;
        if (type == "plus")
        {
            total =  temperature + 1;
            String temp = String.valueOf(total);
            controler.setValeur_ThermoUpdate_To_ThermoFrm("affichage",temp);
            controler.setValeur_ThermoUpdate_To_ThermoFrm("controle",temp);
        }
        if (type == "moins")
        {
            total = temperature - 1;
            String temp = String.valueOf(total);
            controler.setValeur_ThermoUpdate_To_ThermoFrm("affichage",temp);
            controler.setValeur_ThermoUpdate_To_ThermoFrm("controle",temp);
        }


    }
}
