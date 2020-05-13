package be.heh.www;

public class ChampignonDecorator extends Decorator
{
    public ChampignonDecorator(PizzaBase p)
    {
        pizza = p;
    }

    public String getNom()
    {
        return pizza.getNom() + " champignons";
    }

    public double getPrix()
    {
        return pizza.getPrix() + 1.25;
    }
}
