package be.heh.www;

public class PizzaTests
{

    public static void main(String[] args)
    {
	    PizzaBase pizza1 = new PizzaPateFromage();
	    pizza1.afficher();

	    PizzaBase pizza2 = new PizzaPateFine();
	    pizza2 = new JambonDecorator(pizza2);
	    pizza2 = new OignonsDecorator(pizza2);
	    pizza2.afficher();
    }
}
