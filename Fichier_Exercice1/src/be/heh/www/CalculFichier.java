package be.heh.www;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class CalculFichier
{
    public void calcul(File operand1, File operand2, File operateur)
    {
        try
        {
            ArrayList<String> nombre1 = new ArrayList();
            ArrayList<String> nombre2 = new ArrayList();
            ArrayList<String> operation =  new ArrayList();

            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(operand1),StandardCharsets.UTF_8));
            String line = reader.readLine();
            while (line != null)
            {
                nombre1.add(line);
                line = reader.readLine();
            }
            reader.close();

            BufferedReader reader2 = new BufferedReader(new InputStreamReader(new FileInputStream(operand2), StandardCharsets.UTF_8));
            String line2 = reader2.readLine();
            while (line2 != null)
            {
                nombre2.add(line2);
                line2 = reader2.readLine();
            }
            reader2.close();

            BufferedReader reader3 = new BufferedReader(new InputStreamReader(new FileInputStream(operateur), StandardCharsets.UTF_8));
            String line3 = reader3.readLine();
            while (line3 != null)
            {
                operation.add(line3);
                line3 = reader3.readLine();
            }
            reader3.close();

            for (int c=0;c<(nombre1.size());c++)
            {
                double total;
                double chiffre1 = Double.valueOf(nombre1.get(c));
                double chiffre2 = Double.valueOf(nombre2.get(c));

                switch (operation.get(c))
                {
                    case "+":
                    {
                        total = chiffre1 +chiffre2;
                        System.out.println(nombre1.get(c) + " + " + nombre2.get(c) + " = " + total);
                        break;
                    }
                    case "-":
                    {
                        total = chiffre1 - chiffre2;
                        System.out.println(nombre1.get(c) + " - " + nombre2.get(c) + " = " + total);
                        break;
                    }
                    case "*":
                    {
                        total = chiffre1 * chiffre2;
                        System.out.println(nombre1.get(c) + " * " + nombre2.get(c) + " = " + total);
                        break;
                    }
                    case "/":
                    {
                        if (chiffre2 == 0)
                        {
                            System.out.println(nombre1.get(c) + " / " + nombre2.get(c) + " = infini");
                        }
                        else
                        {
                            total = chiffre1 / chiffre2;
                            System.out.println(nombre1.get(c) + " / " + nombre2.get(c) + " = " + total);
                        }
                        break;
                    }
                }
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
