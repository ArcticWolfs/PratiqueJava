package be.heh.www;

public class OignonsDecorator extends Decorator
{
    public OignonsDecorator(PizzaBase p)
    {
        pizza = p;
    }

    public String getNom()
    {
        return pizza.getNom() + " Oignons";
    }

    public double getPrix()
    {
        return pizza.getPrix() + 0.20;
    }
}
