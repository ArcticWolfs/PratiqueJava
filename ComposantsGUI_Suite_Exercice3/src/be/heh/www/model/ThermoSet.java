package be.heh.www.model;

import be.heh.www.controler.ThermoControler;

public class ThermoSet implements ThermoUpdate
{
    private ThermoControler controler;

    public ThermoSet(ThermoControler controler)
    {
        this.controler = controler;
    }

    public void update(String type,float temperature)
    {
        controler.setValeur_ThermoUpdate_To_ThermoFrm("affichage",String.valueOf(temperature));
    }
}
