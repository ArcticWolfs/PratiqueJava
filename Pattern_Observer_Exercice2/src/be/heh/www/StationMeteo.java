package be.heh.www;

import java.util.ArrayList;
import java.util.List;

public class StationMeteo
{
    private float temperature;
    private float humidite;
    private float totalTemp = 0;
    private int nombreTemp = 0;
    private float min = 1000;
    private float max = 0;
    private float moy = 0;
    private List<Affichage> affichages = new ArrayList<Affichage>();

    public float getTemperature() {
        return temperature;
    }
    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }
    public float getHumidite() {
        return humidite;
    }
    public void setHumidite(float humidite) {
        this.humidite = humidite;
    }
    public float getTotalTemp() {
        return totalTemp;
    }
    public void setTotalTemp(float totalTemp) {
        this.totalTemp = totalTemp;
    }
    public int getNombreTemp() {
        return nombreTemp;
    }
    public void setNombreTemp(int nombreTemp) {
        this.nombreTemp = nombreTemp;
    }
    public float getMin() {
        return min;
    }
    public void setMin(float min) {
        this.min = min;
    }
    public float getMax() {
        return max;
    }
    public void setMax(float max) {
        this.max = max;
    }
    public float getMoy() {
        return moy;
    }
    public void setMoy(float moy) {
        this.moy = moy;
    }

    public void addObservateur(Affichage affichage)
    {
        affichages.add(affichage);
    }

    public void ajouterDonnees(float temperature, float humidite)
    {
        setTemperature(temperature);
        setHumidite(humidite);
        notifyAllObservers();
    }

    public void notifyAllObservers()
    {
        for (Affichage affichage : affichages)
        {
            affichage.afficher();
        }
    }
}
