package be.heh.www;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class FichierTab
{
    private int taille;
    private String fichier;

    public int getTaille() {
        return taille;
    }
    public void setTaille(int taille) {
        this.taille = taille;
    }
    public String getFichier() {
        return fichier;
    }
    public void setFichier(String fichier) {
        this.fichier = fichier;
    }

    public FichierTab(int taille, String fichier)
    {
        this.taille  = taille;
        this.fichier = fichier;
    }

    public void ecrire(int index,int valeur)
    {
        try
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("D://HEH/Java Cours/PratiqueJava/Fichier_Exercice3/fichier/" + getFichier() + ".text"), StandardCharsets.UTF_8));
            StringBuilder line = new StringBuilder(br.readLine());
            line.setCharAt(index,(char) valeur);
            FileWriter writer = new FileWriter("D://HEH/Java Cours/PratiqueJava/Fichier_Exercice3/fichier/"+ getFichier() + ".text");
            BufferedWriter bw = new BufferedWriter(writer,taille);
            writer.write(String.valueOf(line));
            br.close();
            bw.close();
            writer.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public int lire(int index)
    {
        int valeur = 0;
        BufferedReader br = null;
        try
        {
            br = new BufferedReader(new InputStreamReader(new FileInputStream("D://HEH/Java Cours/PratiqueJava/Fichier_Exercice3/fichier/tabInteger.text"), StandardCharsets.UTF_8));
            StringBuilder line = new StringBuilder(br.readLine());
            valeur = line.charAt(index);

        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        return valeur;
    }
}
