package be.heh.www;

public class ThonDecorator extends Decorator
{
    public ThonDecorator(PizzaBase p)
    {
        pizza = p;
    }

    public String getNom()
    {
        return pizza.getNom() + " Thon";
    }

    public double getPrix()
    {
        return pizza.getPrix() + 3;
    }
}
