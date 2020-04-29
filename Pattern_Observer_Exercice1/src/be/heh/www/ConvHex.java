package be.heh.www;

public class ConvHex extends Observer
{
    public ConvHex()
    {

    }

    @Override
    public void update(int nombre)
    {
        System.out.println( "Conversion en Hex: " + Integer.toHexString( nombre ).toUpperCase() );
    }
}
