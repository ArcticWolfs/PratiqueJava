package be.heh.www;

import javax.swing.*;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class ConvertisseurFrm extends JFrame
{
    final double TAUX_CONVERSION_USD = 1.09;
    final double TAUX_CONVERSION_EURO = 0.91;

    JPanel panel = new JPanel();
    JTextField montantEURO = new JTextField();
    JLabel dollar = new JLabel("EUR");
    JRadioButton montantRadio = new JRadioButton("Montant");
    JRadioButton taxeRadio = new JRadioButton("Taxe");
    ButtonGroup g = new ButtonGroup();
    JTextField montantUSD = new JTextField();
    JLabel euro = new JLabel("USD");
    JTextField taxePourcent = new JTextField("21");
    JLabel pourcent = new JLabel("%");
    DecimalFormat df = new DecimalFormat("0.00");

    public ConvertisseurFrm()
    {
        setTitle("Convertisseur de devises");
        setSize(600,200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        g.add(montantRadio);
        g.add(taxeRadio);
        montantRadio.setSelected(true);
        taxePourcent.setEditable(false);
        add(panel);

        panel.setLayout(new GridBagLayout());
        GridBagConstraints gc = new GridBagConstraints();
        gc.insets = new Insets(1, 1, 1, 1);
        gc.ipady = gc.anchor = GridBagConstraints.CENTER;
        gc.weightx = 2;
        gc.weighty = 2;
        gc.fill = GridBagConstraints.HORIZONTAL;

        gc.gridx = 0;
        gc.gridy = 0;
        panel.add(montantEURO,gc);
        gc.gridx = 1;
        gc.gridy = 0;
        panel.add(euro,gc);
        gc.gridx = 2;
        gc.gridy = 0;
        panel.add(montantRadio,gc);
        gc.gridx = 3;
        gc.gridy = 0;
        panel.add(taxeRadio,gc);
        gc.gridx = 0;
        gc.gridy = 1;
        panel.add(montantUSD,gc);
        gc.gridx = 1;
        gc.gridy = 1;
        panel.add(dollar,gc);
        gc.gridx = 2;
        gc.gridy = 1;
        panel.add(taxePourcent,gc);
        gc.gridx = 3;
        gc.gridy = 1;
        panel.add(pourcent,gc);

        setVisible(true);


        montantEURO.getDocument().addDocumentListener(new DocumentListener()
        {
            @Override
            public void insertUpdate(javax.swing.event.DocumentEvent e)
            {
                calcul("TO_USD");
            }

            @Override
            public void removeUpdate(javax.swing.event.DocumentEvent e)
            {
                calcul("TO_USD");
            }

            @Override
            public void changedUpdate(javax.swing.event.DocumentEvent e)
            {
                calcul("TO_USD");
            }

        });

        montantUSD.getDocument().addDocumentListener(new DocumentListener()
        {
            @Override
            public void insertUpdate(javax.swing.event.DocumentEvent e)
            {
                calcul("TO_EURO");
            }

            @Override
            public void removeUpdate(javax.swing.event.DocumentEvent e)
            {
                calcul("TO_EURO");
            }

            @Override
            public void changedUpdate(javax.swing.event.DocumentEvent e)
            {
                calcul("TO_EURO");
            }
        });

        taxePourcent.getDocument().addDocumentListener(new DocumentListener()
        {
            @Override
            public void insertUpdate(javax.swing.event.DocumentEvent e)
            {
                calcul("TAXE");
            }

            @Override
            public void removeUpdate(javax.swing.event.DocumentEvent e)
            {
                calcul("TAXE");
            }

            @Override
            public void changedUpdate(javax.swing.event.DocumentEvent e)
            {
                calcul("TAXE");
            }
        });

        ActionListener bouton = new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if (montantRadio.isSelected())
                {
                    taxePourcent.setEditable(false);
                    montantEURO.setText("");
                    montantUSD.setText("");
                    euro.setText("EUR");
                    dollar.setText("USD");
                }
                if (taxeRadio.isSelected())
                {
                    taxePourcent.setEditable(true);
                    montantEURO.setText("");
                    montantUSD.setText("");
                    euro.setText("HT");
                    dollar.setText("TTC");
                }
            }
        };
        montantRadio.addActionListener(bouton);
        taxeRadio.addActionListener(bouton);
    }

    public void calcul(String type)
    {
        if (type == "TO_USD")
        {
            if (montantRadio.isSelected())
            {
                try
                {
                    double montant = Double.valueOf(montantEURO.getText());
                    montant = montant * TAUX_CONVERSION_USD;
                    montantUSD.setText(String.valueOf(df.format(montant)));
                }
                catch (Exception exc)
                {

                }
            }
            if (taxeRadio.isSelected())
            {
                try
                {
                    double montant = Double.valueOf(montantEURO.getText());
                    double taxe = Double.valueOf(taxePourcent.getText());
                    montant = montant * (1+(taxe/100));
                    montantUSD.setText(String.valueOf(df.format(montant)));
                }
                catch (Exception exc)
                {

                }
            }
        }
        if (type == "TO_EURO")
        {
            if (montantRadio.isSelected())
            {
                try
                {
                    double montant = Double.valueOf(montantUSD.getText());
                    montant = montant * TAUX_CONVERSION_EURO;
                    montantEURO.setText(String.valueOf(df.format(montant)));
                }
                catch (Exception exc)
                {

                }
            }
            if (taxeRadio.isSelected())
            {
                try
                {
                    double montant = Double.valueOf(montantUSD.getText());
                    double taxe = Double.valueOf(taxePourcent.getText());
                    montant = montant * (1+(taxe/100));
                    montantEURO.setText(String.valueOf(df.format(montant)));
                }
                catch (Exception exc)
                {

                }
            }
        }
        if (type == "TAXE")
        {
            System.out.println("taxe");
            if (true)
            {
                try
                {
                    double montant = Double.valueOf(montantEURO.getText());
                    System.out.println(montant);
                    double taxe = Double.valueOf(taxePourcent.getText());
                    montant = montant * (1+(taxe/100));
                    montantUSD.setText(String.valueOf(df.format(montant)));
                }
                catch (Exception exc)
                {
                }
            }
        }
    }

}
