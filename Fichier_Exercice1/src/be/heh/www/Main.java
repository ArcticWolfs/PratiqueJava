package be.heh.www;

        import java.io.File;
        import java.io.FileOutputStream;
        import java.io.IOException;

public class Main
{
    public static void main(String[] args)
    {
        GenerateurFichier generateurFichier = new GenerateurFichier();
        int nombre[] = {0,1,2,3,4,5,6,7,8,9};
        int nombre2[] = {9,8,7,6,5,4,3,2,1,0};
        String operateur[] = {"+","-","*","/","+","-","*","/","+","-"};

        File operande1 = new File("D://HEH/Java Cours/PratiqueJava/Fichier_Exercice1/fichier/operande1.dat");
        if (!operande1.exists())
        {
            try
            {
                operande1.createNewFile();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
        generateurFichier.stockerNombres(operande1,nombre);


        File operande2 = new File("D://HEH/Java Cours/PratiqueJava/Fichier_Exercice1/fichier/operande2.dat");
        if (!operande2.exists())
        {
            try
            {
                operande2.createNewFile();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
        generateurFichier.stockerNombres(operande2,nombre2);


        File operateurs = new File("D://HEH/Java Cours/PratiqueJava/Fichier_Exercice1/fichier/operateurs.dat");
        if (!operateurs.exists())
        {
            try
            {
                operateurs.createNewFile();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
        generateurFichier.stockerCaracteres(operateurs,operateur);

        CalculFichier calcul = new CalculFichier();
        calcul.calcul(operande1,operande2,operateurs);
    }
}
