package be.heh.www;

import java.io.File;
import java.io.IOException;

public class Main
{
    public static void main(String[] args)
    {
        String fileSrc = "D://HEH/Java Cours/PratiqueJava/Fichier_Exercice2/fichier/fichierSrc.txt";
        String fileDest = "D://HEH/Java Cours/PratiqueJava/Fichier_Exercice2/fichier/fichierDestination.txt";
	    CopierSansBlanc copier = new CopierSansBlanc();
        copier.copier(fileSrc,fileDest);
    }
}
