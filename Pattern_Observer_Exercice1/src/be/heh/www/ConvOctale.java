package be.heh.www;

public class ConvOctale implements Observer
{
    public ConvOctale()
    {

    }

    @Override
    public void update(int nombre)
    {
        System.out.println( "Conversion en Octal : " + Integer.toOctalString( nombre ) );
    }
}
