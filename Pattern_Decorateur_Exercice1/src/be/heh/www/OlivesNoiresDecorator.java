package be.heh.www;

public class OlivesNoiresDecorator extends Decorator
{
    public OlivesNoiresDecorator(PizzaBase p)
    {
        pizza = p;
    }

    public String getNom()
    {
        return pizza.getNom() + " Olives noires";
    }

    public double getPrix()
    {
        return pizza.getPrix() + 2.25;
    }
}
