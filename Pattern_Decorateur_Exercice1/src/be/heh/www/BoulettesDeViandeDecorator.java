package be.heh.www;

public class BoulettesDeViandeDecorator extends Decorator
{
    public BoulettesDeViandeDecorator(PizzaBase p)
    {
        pizza = p;
    }

    public String getNom()
    {
        return pizza.getNom() + " Boulettes de viande";
    }

    public double getPrix()
    {
        return pizza.getPrix() + 2;
    }
}
