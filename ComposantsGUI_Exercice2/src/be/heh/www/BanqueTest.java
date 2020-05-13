package be.heh.www;

import javax.swing.*;

public class BanqueTest
{

    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                BanqueFrm fenetre = new BanqueFrm();
            }
        });
    }
}
