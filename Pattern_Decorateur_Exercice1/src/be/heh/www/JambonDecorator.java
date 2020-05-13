package be.heh.www;

public class JambonDecorator extends Decorator
{
    public JambonDecorator(PizzaBase p)
    {
        pizza = p;
    }

    public String getNom()
    {
        return pizza.getNom() + " Jambon";
    }

    public double getPrix()
    {
        return pizza.getPrix() + 1.50;
    }
}
