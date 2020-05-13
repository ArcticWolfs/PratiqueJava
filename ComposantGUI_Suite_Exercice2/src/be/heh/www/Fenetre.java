package be.heh.www;

import javax.print.Doc;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Fenetre extends JFrame
{
    JPanel panel = new JPanel();
    JLabel label_Rouge = new JLabel("Rouge");
    JLabel label_Vert = new JLabel("Vert");
    JLabel label_Bleu = new JLabel("Bleu");
    JLabel decimal = new JLabel("Déc = ");
    JSlider slider_Rouge = new JSlider(JSlider.VERTICAL,0,255,0);
    JSlider slider_Vert = new JSlider(JSlider.VERTICAL,0,255,0);
    JSlider slider_Bleu = new JSlider(JSlider.VERTICAL,0,255,0);
    SpinnerNumberModel model1 = new SpinnerNumberModel(0,0,255,1);
    SpinnerNumberModel model2 = new SpinnerNumberModel(0,0,255,1);
    SpinnerNumberModel model3 = new SpinnerNumberModel(0,0,255,1);
    JSpinner spinner_Rouge = new JSpinner(model1);
    JSpinner spinner_Vert = new JSpinner(model2);
    JSpinner spinner_Bleu = new JSpinner(model3);
    JLabel label_Hexadecimal = new JLabel("Hex = ");
    JLabel label_Color = new JLabel("0x000000");

    public Fenetre()
    {
        setSize(300,400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GridBagConstraints gc = new GridBagConstraints();
        gc.insets = new Insets(0,5,0,5);
        gc.ipady = gc.anchor = GridBagConstraints.CENTER;
        gc.fill = GridBagConstraints.BOTH;
        gc.weightx = 1;
        gc.weighty = 1;

        add(panel);
        panel.setLayout(new GridBagLayout());
        label_Rouge.setHorizontalAlignment(SwingConstants.CENTER);
        label_Rouge.setOpaque(true);
        label_Rouge.setBackground(Color.red);
        label_Rouge.setForeground(Color.WHITE);
        label_Vert.setHorizontalAlignment(SwingConstants.CENTER);
        label_Vert.setOpaque(true);
        label_Vert.setBackground(Color.green);
        label_Bleu.setHorizontalAlignment(SwingConstants.CENTER);
        label_Bleu.setOpaque(true);
        label_Bleu.setBackground(Color.blue);
        label_Bleu.setForeground(Color.WHITE);
        label_Color.setHorizontalAlignment(SwingConstants.CENTER);
        label_Color.setOpaque(true);
        label_Color.setBackground(Color.black);
        label_Color.setForeground(Color.WHITE);

        gc.gridx = 1;
        gc.gridy = 0;
        panel.add(label_Rouge,gc);
        gc.gridx = 2;
        gc.gridy = 0;
        panel.add(label_Vert,gc);
        gc.gridx = 3;
        gc.gridy = 0;
        panel.add(label_Bleu,gc);
        gc.gridx = 1;
        gc.gridy = 1;
        panel.add(slider_Rouge,gc);
        gc.gridx = 2;
        gc.gridy = 1;
        panel.add(slider_Vert,gc);
        gc.gridx = 3;
        gc.gridy = 1;
        panel.add(slider_Bleu,gc);
        gc.gridx = 0;
        gc.gridy = 2;
        panel.add(decimal,gc);
        gc.gridx = 1;
        gc.gridy = 2;
        gc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(spinner_Rouge,gc);
        gc.gridx = 2;
        gc.gridy = 2;
        panel.add(spinner_Vert,gc);
        gc.gridx = 3;
        gc.gridy = 2;
        panel.add(spinner_Bleu,gc);
        gc.gridx = 0;
        gc.gridy = 3;
        panel.add(label_Hexadecimal,gc);
        gc.gridx = 1;
        gc.gridy = 3;
        gc.gridwidth = 3;
        gc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(label_Color,gc);


        ChangeListener value = new ChangeListener()
        {
            @Override
            public void stateChanged(ChangeEvent e)
            {
                if (e.getSource() == slider_Rouge)
                {
                    spinner_Rouge.setValue(slider_Rouge.getValue());
                }
                if (e.getSource() == slider_Vert)
                {
                    spinner_Vert.setValue(slider_Vert.getValue());
                }
                if (e.getSource() == slider_Bleu)
                {
                    spinner_Bleu.setValue(slider_Bleu.getValue());
                }
                if (e.getSource() == spinner_Rouge)
                {
                    slider_Rouge.setValue((int)spinner_Rouge.getValue());
                }
                if (e.getSource() == spinner_Vert)
                {
                    slider_Vert.setValue((int)spinner_Vert.getValue());
                }
                if (e.getSource() == spinner_Bleu)
                {
                    slider_Bleu.setValue((int)spinner_Bleu.getValue());
                }
                calculHexa();
            }
        };

        DocumentListener update = new DocumentListener()
        {
            @Override
            public void insertUpdate(DocumentEvent e)
            {
                slider_Rouge.setValue((int)spinner_Rouge.getValue());
                slider_Vert.setValue((int)spinner_Vert.getValue());
                slider_Bleu.setValue((int)spinner_Bleu.getValue());
            }

            @Override
            public void removeUpdate(DocumentEvent e)
            {
                slider_Rouge.setValue((int)spinner_Rouge.getValue());
                slider_Vert.setValue((int)spinner_Vert.getValue());
                slider_Bleu.setValue((int)spinner_Bleu.getValue());
            }

            @Override
            public void changedUpdate(DocumentEvent e)
            {
                slider_Rouge.setValue((int)spinner_Rouge.getValue());
                slider_Vert.setValue((int)spinner_Vert.getValue());
                slider_Bleu.setValue((int)spinner_Bleu.getValue());
            }
        };

        slider_Rouge.addChangeListener(value);
        slider_Vert.addChangeListener(value);
        slider_Bleu.addChangeListener(value);
        spinner_Rouge.addChangeListener(value);
        spinner_Vert.addChangeListener(value);
        spinner_Bleu.addChangeListener(value);

        setVisible(true);
    }

    public void calculHexa()
    {
        String rouge = Integer.toHexString(slider_Rouge.getValue());
        String vert = Integer.toHexString(slider_Vert.getValue());
        String bleu = Integer.toHexString(slider_Bleu.getValue());
        if (rouge.length() == 1)
        {
            rouge = rouge + "0";
        }
        if (vert.length() == 1)
        {
            vert = vert + "0";
        }
        if (bleu.length() == 1)
        {
            bleu = bleu + "0";
        }
        Color myColor = Color.decode("#"+rouge+vert+bleu);

        label_Color.setBackground(myColor);
        if (myColor.getRed() > 50 || myColor.getGreen() > 50)
        {
            label_Color.setForeground(Color.black);
        }
        else
        {
            label_Color.setForeground(Color.WHITE);
        }
        label_Color.setText("0x" + rouge + vert + bleu);
    }
}
