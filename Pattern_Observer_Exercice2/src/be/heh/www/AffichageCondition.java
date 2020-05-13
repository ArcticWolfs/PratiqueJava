package be.heh.www;

public class AffichageCondition implements Affichage
{
    private StationMeteo station;

    public StationMeteo getStation() {
        return station;
    }
    public void setStation(StationMeteo station) {
        this.station = station;
    }

    public AffichageCondition(StationMeteo stationMeteo)
    {
        setStation(stationMeteo);
    }

    public void afficher()
    {
        System.out.print("Température : " + station.getTemperature() + "°C - Humidité " + station.getHumidite() + "% >>");
    }
}
