package be.heh.www;

public class FromageDecorator extends Decorator
{
    public FromageDecorator(PizzaBase p)
    {
        pizza = p;
    }

    public String getNom()
    {
        return pizza.getNom() + " Fromage";
    }

    public double getPrix()
    {
        return pizza.getPrix() + 0.50;
    }
}
