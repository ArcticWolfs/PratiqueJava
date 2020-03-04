package be.heh.www;

public class Validateur
{
    private String txt;
    private Format format;

    public String getTxt()
    {
        return txt;
    }

    public Format getFormat()
    {
        return format;
    }

    public Validateur(Format format,String txt)
    {
        this.format = format;
        this.txt = txt;
    }

    public boolean isValide()
    {
        boolean valid;

        valid = getFormat().isValide(getTxt());

        return valid;
    }
}
