package be.heh.www.vue;

import be.heh.www.controler.ThermoControler;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ThermoControleFrm extends JFrame
{
    private ThermoControler controler;
    JTextField temperature = new JTextField("20");
    JLabel celsius = new JLabel("°C");
    JButton plus = new JButton("+");
    JButton moins = new JButton("-");
    JButton valider = new JButton("valider");

    public JTextField getTemperature() {
        return temperature;
    }

    public ThermoControleFrm(ThermoControler controler)
    {
        this.controler = controler;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(300,150);
        JPanel panel1 = new JPanel();
        setTitle("Thermo - Contrôle");

        GridBagConstraints gc = new GridBagConstraints();
        gc.insets = new Insets(5,5,5,5);
        gc.ipady = gc.anchor = GridBagConstraints.CENTER;
        gc.fill = GridBagConstraints.BOTH;
        gc.weightx = 1;
        gc.weighty = 1;

        add(panel1);
        panel1.setLayout(new GridBagLayout());

        gc.gridx = 0;
        gc.gridy = 0;
        gc.gridwidth = 2;
        gc.gridheight = 2;
        panel1.add(temperature,gc);
        gc.gridx = 2;
        gc.gridy = 0;
        panel1.add(celsius,gc);
        gc.gridwidth = 1;
        gc.gridheight = 1;
        gc.gridx = 0;
        gc.gridy = 2;
        panel1.add(plus,gc);
        gc.gridx = 1;
        gc.gridy = 2;
        panel1.add(moins,gc);
        gc.gridx = 0;
        gc.gridy = 3;
        gc.gridwidth = 2;
        panel1.add(valider,gc);

        ActionListener bouton = new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                float temperature =  Float.valueOf(getTemperature().getText());

                if (e.getSource() == plus)
                {
                    controler.calcule_Temp_ControleAffichage("BoutonPlus",temperature);
                }
                if (e.getSource() == moins)
                {
                    controler.calcule_Temp_ControleAffichage("BoutonMoins",temperature);
                }
                if (e.getSource() == valider)
                {
                    controler.calcule_Temp_ControleAffichage("Valider",temperature);
                }
            }
        };

        plus.addActionListener(bouton);
        moins.addActionListener(bouton);
        valider.addActionListener(bouton);
    }
}
