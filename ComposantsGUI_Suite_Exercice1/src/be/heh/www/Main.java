package be.heh.www;

import javax.swing.*;

public class Main
{

    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                ConvertisseurFrm fenetre = new ConvertisseurFrm();
            }
        });
    }
}
