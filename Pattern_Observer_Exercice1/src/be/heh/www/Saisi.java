package be.heh.www;

import java.util.ArrayList;
import java.util.List;

public class Saisi
{
    private List<Observer> observers = new ArrayList<Observer>();
    private int nombre = 0;

    public int getNombre() {
        return nombre;
    }
    public void setNombre(int nombre) {
        this.nombre = nombre;
        notifyAllObservers();
    }

    public void add(Observer observer)
    {
        observers.add(observer);
    }

    public void notifyAllObservers()
    {
        for (Observer observer : observers)
        {
            observer.update(getNombre());
        }
    }
}
