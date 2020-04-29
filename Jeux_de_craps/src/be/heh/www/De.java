package be.heh.www;


import java.util.Random;

public class De
{
    private int number = 0;

    public int getNumber()
    {
        return number;
    }

    public void setNumber(int number)
    {
        this.number = number;
    }


    public void lancer()
    {
        Random r = new Random();
        int alea = (r.nextInt(6)) + 1;
        setNumber(alea);
    }

}
