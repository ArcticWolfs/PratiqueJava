package be.heh.www;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class BanqueFrm extends JFrame
{
    JPanel panel = new JPanel();
    JLabel label = new JLabel("Montant");
    JTextField text = new JTextField("montant");
    JLabel label2 = new JLabel("Compte");
    JComboBox choice = new JComboBox();
    JLabel label3 = new JLabel("Transaction");
    JRadioButton radio = new JRadioButton("Dépot");
    JRadioButton radio2 =  new JRadioButton("Retrait");
    JButton bouton =  new JButton("Valider");
    JButton bouton2 = new JButton("Calculer les intérets");
    JTextArea textArea = new JTextArea();
    Compte current;
    List<Compte> lesComptes = new ArrayList<Compte>();

    public BanqueFrm()
    {
        Banque banque = new Banque();
        CompteCourant compteCourant = new CompteCourant(banque,50);
        CompteEpargne compteEpargne = new CompteEpargne(banque,50);
        ComptePayant comptePayant = new ComptePayant(banque,50);
        lesComptes = banque.collectionComptes();

        //Fenetre
        setTitle("SelfBanking");
        setSize(450,600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(panel);
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gc = new GridBagConstraints();
        gc.insets = new Insets(1, 1, 1, 1);
        gc.ipady = gc.anchor = GridBagConstraints.CENTER;
        gc.weightx = 2;
        gc.weighty = 2;


        ButtonGroup g = new ButtonGroup();
        g.add(radio);
        g.add(radio2);

        text.setPreferredSize(new Dimension(100,25));

        for (int c=0; c< (lesComptes.size()); c++)
        {
            Compte compte = lesComptes.get(c);
            if (c==0)
            {
                current = compte;
            }
            String nom = compte.getClass().getSimpleName();
            choice.addItem(nom);
        }

        afficher();

        text.setText(String.valueOf(current.getSolde()));

        gc.gridx = 0;
        gc.gridy = 0;
        panel.add(label,gc);
        gc.gridx = 1;
        gc.gridy = 0;
        panel.add(text,gc);
        gc.gridx = 0;
        gc.gridy = 1;
        panel.add(label2,gc);
        gc.gridx = 1;
        gc.gridy = 1;
        panel.add(choice,gc);
        gc.gridx = 0;
        gc.gridy = 2;
        panel.add(label3,gc);
        gc.gridx = 1;
        gc.gridy = 2;
        panel.add(radio,gc);
        gc.gridx = 2;
        gc.gridy = 2;
        panel.add(radio2,gc);
        gc.gridx = 0;
        gc.gridy = 3;
        panel.add(bouton,gc);
        gc.gridx = 2;
        gc.gridy = 3;
        panel.add(bouton2,gc);
        gc.gridx = 0;
        gc.gridy = 4;
        gc.gridwidth = 3;
        panel.add(textArea,gc);

        textArea.setEditable(false);
        setVisible(true);


        bouton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                double montant = Double.valueOf(text.getText());

                if (radio.isSelected())
                {
                    current.depot(montant);
                    afficher();
                }
                if (radio2.isSelected())
                {
                    current.retrait(montant);
                    afficher();
                }
            }
        });

        choice.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                for (int c=0; c< (lesComptes.size()); c++)
                {
                    Compte compte = lesComptes.get(c);
                    if (compte.getClass().getSimpleName() == choice.getSelectedItem())
                    {
                        current = compte;
                    }
                }
            }
        });

        bouton2.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                boolean result = current.getClass().equals(CompteEpargne.class);

                if (result == true)
                {
                    current.calculInterets();
                    afficher();
                }
            }
        });
    }

    public void afficher()
    {
        String affiche ="";
        for (int c=0; c< (lesComptes.size()); c++)
        {
            Compte compte = lesComptes.get(c);

             affiche = affiche + compte.toString() + "\n";
             textArea.setText(affiche);
        }
    }
}
