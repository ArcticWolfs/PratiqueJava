package be.heh.www;

public class AffichageStatistique implements Affichage
{
    private StationMeteo station;

    public StationMeteo getStation() {
        return station;
    }
    public void setStation(StationMeteo station) {
        this.station = station;
    }

    public AffichageStatistique(StationMeteo stationMeteo)
    {
        setStation(stationMeteo);
    }

    public void afficher()
    {
        stat(getStation().getTemperature());
        System.out.println(" Température min/max/moy : " + getStation().getMin() + "°C / " + getStation().getMax() + "°C / " + getStation().getMoy() + "°C" );
    }

    public void stat(float temp)
    {
        StationMeteo station = getStation();

        if (temp < station.getMin())
        {
            station.setMin(temp);
        }
        if (temp > station.getMax())
        {
            station.setMax(temp);
        }

        float total = station.getTotalTemp();
        total = total + temp;
        station.setTotalTemp(total);

        int nombreTemp = station.getNombreTemp();
        nombreTemp = nombreTemp + 1;
        station.setNombreTemp(nombreTemp);

        float moyenne = total/nombreTemp;
        station.setMoy(moyenne);
    }
}
