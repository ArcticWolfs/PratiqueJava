package be.heh.www;

public class FormatMail implements Format
{
    @Override
    public boolean isValide(String txt)
    {
        boolean isMail;

        int a = txt.indexOf("@");
        if (a >= 0)
        {
            isMail = true;
        }
        else
        {
            isMail = false;
        }

        return isMail;
    }
}
