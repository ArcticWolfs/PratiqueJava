package be.heh.www.vue;

import be.heh.www.controler.ThermoControler;
import javax.swing.*;

public class ThermoAffichageFrm extends JFrame
{
    private ThermoControler controler;
    JPanel panel2 = new JPanel();
    JLabel degre = new JLabel("20°C");

    public JLabel getDegre() {
        return degre;
    }

    public ThermoAffichageFrm(ThermoControler controler)
    {
        this.controler = controler;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(300,150);
        setTitle("Thermo - Affichage");
        add(panel2);
        panel2.add(degre);
    }

}
