package be.heh.www;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Fenetre extends JFrame
{

    private double resultat = 0;
    private String operation = "add";
    private String chaineDeCommande = "";

    public String getChaineDeCommande() {
        return chaineDeCommande;
    }
    public void setChaineDeCommande(String chaineDeCommande) {
        this.chaineDeCommande = chaineDeCommande;
    }
    public double getResultat() {
        return resultat;
    }
    public void setResultat(double resultat) {
        this.resultat = resultat;
    }
    public String getOperation() {
        return operation;
    }
    public void setOperation(String operation) {
        this.operation = operation;
    }

    public Fenetre()
    {
        JPanel panel = new JPanel();
        JTextField text = new JTextField("");
        JButton numero0  = new JButton("0");
        JButton numero1  = new JButton("1");
        JButton numero2  = new JButton("2");
        JButton numero3  = new JButton("3");
        JButton numero4  = new JButton("4");
        JButton numero5  = new JButton("5");
        JButton numero6  = new JButton("6");
        JButton numero7  = new JButton("7");
        JButton numero8  = new JButton("8");
        JButton numero9  = new JButton("9");
        JButton reset  = new JButton("c");
        JButton addition = new JButton("+");
        JButton soustraction = new JButton("-");
        JButton multiplication = new JButton("*");
        JButton division = new JButton("/");
        JButton egal = new JButton("=");




        setTitle("Calculatrice");
        setSize(400,600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(panel);
        panel.setLayout(new GridBagLayout());
        text.setEditable(false);
        text.setHorizontalAlignment(JTextField.CENTER);

        GridBagConstraints gc = new GridBagConstraints();
        gc.insets = new Insets(5,5,5,5);
        gc.ipady = gc.anchor = GridBagConstraints.CENTER;
        gc.fill = GridBagConstraints.BOTH;
        gc.weightx = 1;
        gc.weighty = 1;

        gc.gridx = 0;
        gc.gridy = 0;
        gc.gridwidth = 3;
        panel.add(text,gc);
        gc.gridwidth = 1;
        gc.gridx = 0;
        gc.gridy = 1;
        panel.add(numero1,gc);
        gc.gridx = 1;
        gc.gridy = 1;
        panel.add(numero2,gc);
        gc.gridx = 2;
        gc.gridy = 1;
        panel.add(numero3,gc);
        gc.gridx = 0;
        gc.gridy = 2;
        panel.add(numero4,gc);
        gc.gridx = 1;
        gc.gridy = 2;
        panel.add(numero5,gc);
        gc.gridx = 2;
        gc.gridy = 2;
        panel.add(numero6,gc);
        gc.gridx = 0;
        gc.gridy = 3;
        panel.add(numero7,gc);
        gc.gridx = 1;
        gc.gridy = 3;
        panel.add(numero8,gc);
        gc.gridx = 2;
        gc.gridy = 3;
        panel.add(numero9,gc);
        gc.gridx = 0;
        gc.gridy = 4;
        panel.add(numero0,gc);
        gc.gridx = 3;
        gc.gridy = 0;
        panel.add(reset,gc);
        gc.gridx = 3;
        gc.gridy = 1;
        panel.add(multiplication,gc);
        gc.gridx = 3;
        gc.gridy = 2;
        panel.add(division,gc);
        gc.gridx = 3;
        gc.gridy = 3;
        panel.add(addition,gc);
        gc.gridx = 3;
        gc.gridy = 4;
        panel.add(soustraction,gc);
        gc.gridx = 1;
        gc.gridy = 4;
        gc.gridwidth = 2;
        panel.add(egal,gc);

        ActionListener listener = new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String number = "";

                if (e.getSource() == numero0)
                {
                    number = number + "0";
                    getActionCommand("0");
                }
                if (e.getSource() == numero1)
                {
                    number = number + "1";
                    getActionCommand("1");
                }
                if (e.getSource() == numero2)
                {
                    number = number + "2";
                    getActionCommand("2");
                }
                if (e.getSource() == numero3)
                {
                    number = number + "3";
                    getActionCommand("3");
                }
                if (e.getSource() == numero4)
                {
                    number = number + "4";
                    getActionCommand("4");
                }
                if (e.getSource() == numero5)
                {
                    number = number + "5";
                    getActionCommand("5");
                }
                if (e.getSource() == numero6)
                {
                    number = number + "6";
                    getActionCommand("6");
                }
                if (e.getSource() == numero7)
                {
                    number = number + "7";
                    getActionCommand("7");
                }
                if (e.getSource() == numero8)
                {
                    number = number + "8";
                    getActionCommand("8");
                }
                if (e.getSource() == numero9)
                {
                    number = number + "9";
                    getActionCommand("9");
                }
                if (e.getSource() == addition)
                {
                    setOperation("add");
                    setResultat(Double.valueOf(text.getText()));
                    text.setText("");
                    getActionCommand(" + ");
                }
                if (e.getSource() == soustraction)
                {
                    setOperation("substract");
                    setResultat(Double.valueOf(text.getText()));
                    text.setText("");
                    getActionCommand(" - ");
                }
                if (e.getSource() == multiplication)
                {
                    setOperation("multiply");
                    setResultat(Double.valueOf(text.getText()));
                    text.setText("");
                    getActionCommand(" * ");
                }
                if (e.getSource() == division)
                {
                    setOperation("divide");
                    setResultat(Double.valueOf(text.getText()));
                    text.setText("");
                    getActionCommand(" / ");
                }
                if (e.getSource() == egal)
                {
                    setActionCommand(Double.valueOf(text.getText()));
                    text.setText(String.valueOf(getResultat()));
                    getActionCommand(" = " + getResultat());
                }
                text.setText(text.getText() + number);
                if (e.getSource() == reset)
                {
                    text.setText("");
                    setResultat(0);
                    setChaineDeCommande("");
                }
            }
        };

        numero0.addActionListener(listener);
        numero1.addActionListener(listener);
        numero2.addActionListener(listener);
        numero3.addActionListener(listener);
        numero4.addActionListener(listener);
        numero5.addActionListener(listener);
        numero6.addActionListener(listener);
        numero7.addActionListener(listener);
        numero8.addActionListener(listener);
        numero9.addActionListener(listener);
        addition.addActionListener(listener);
        soustraction.addActionListener(listener);
        multiplication.addActionListener(listener);
        division.addActionListener(listener);
        egal.addActionListener(listener);
        reset.addActionListener(listener);

        setVisible(true);
    }

    public void setActionCommand(double nombre2)
    {
        double total;

        switch (getOperation())
        {
            case "add" :
            {
                total = getResultat() + nombre2;
                setResultat(total);
                break;
            }
            case "substract" :
            {
                total = getResultat() - nombre2;
                setResultat(total);
                break;
            }
            case "multiply" :
            {
                total = getResultat() * nombre2;
                setResultat(total);
                break;
            }
            case "divide" :
            {
                total = getResultat() / nombre2;
                setResultat(total);
                break;
            }
        }
    }

    public void getActionCommand(String nom)
    {
        setChaineDeCommande(getChaineDeCommande() + nom);
        System.out.println(getChaineDeCommande());
    }
}
