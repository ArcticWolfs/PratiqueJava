package be.heh.www;

import java.io.*;

public class GenerateurFichier
{
    public void stockerNombres(File file,int nombreTableau[])
    {
        try
        {
            FileWriter writer = new FileWriter(file,true);
            BufferedWriter bw = new BufferedWriter(writer);
            for (int c = 0;c < nombreTableau.length; c++)
            {
                bw.write(Integer.toString(nombreTableau[c]));
                bw.newLine();
            }
            bw.close();
            writer.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }

    public void stockerCaracteres(File file,String lettreTableau[])
    {
        try
        {
            FileWriter writer = new FileWriter(file,true);
            BufferedWriter bw = new BufferedWriter(writer);
            for (int c = 0;c < lettreTableau.length; c++)
            {
                bw.write(lettreTableau[c]);
                bw.newLine();
            }
            bw.close();
            writer.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
