package be.heh.www;

public class FormatEntier implements Format
{
    @Override
    public boolean isValide(String txt)
    {
        boolean isEntier;
        try
        {
            int i = Integer.parseInt(txt);
            isEntier = true;
        }
        catch (Exception e)
        {
            isEntier = false;
        }

        return isEntier;
    }
}
