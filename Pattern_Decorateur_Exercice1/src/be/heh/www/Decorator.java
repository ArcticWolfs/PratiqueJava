package be.heh.www;

public abstract class Decorator extends PizzaBase
{
    protected PizzaBase pizza;

    public abstract String getNom();
    public abstract double getPrix();
}
