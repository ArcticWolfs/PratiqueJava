package be.heh.www;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CompteBancaireFrm  extends JFrame
{
    JPanel panel = new JPanel();
    JButton button = new JButton("Ajouter montant");
    JLabel label = new JLabel("Montant : ");
    JLabel label2 = new JLabel();
    JTextField text = new JTextField(5);
    JTextArea textArea = new JTextArea(5,15);
    JScrollPane scroll = new JScrollPane(textArea);

    public CompteBancaireFrm(CompteBancaire compte)
    {
        //Fenetre
        setVisible(true);
        setTitle("Compte Bancaire : " + compte);
        setSize(450,200);
        setLocationRelativeTo(null);
        //Pour que l'app se termine lorsque l'on appuie sur la croix
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(panel);
        panel.add(label);
        panel.add(text);
        panel.add(button);
        panel.add(label2);
        panel.add(scroll);

        textArea.setEditable(false);
        label2.setText("Votre solde = " + compte.getSolde() + "€");
        textArea.setText("Vos anciens soldes : ");

        button.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                ajouteMontantEcouteur(compte);
            }
        });
    }

    public void ajouteMontantEcouteur(CompteBancaire compte)
    {
        String listeSolde = textArea.getText();
        listeSolde = listeSolde + "\n" + compte.getSolde();
        textArea.setText(listeSolde);
        float montant = Integer.parseInt(text.getText());
        compte.depot(montant);
        label2.setText("Votre solde : " + compte.getSolde() + "€");

    }

}
