package be.heh.www;

public class ConvBin extends Observer
{
    public ConvBin()
    {

    }

    @Override
    public void update(int nombre)
    {
        System.out.println( "Conversion en binaire: " + Integer.toBinaryString( nombre ) );
    }
}
