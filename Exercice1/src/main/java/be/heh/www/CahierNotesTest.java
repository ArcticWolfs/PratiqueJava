package be.heh.www;

import java.util.Scanner;

public class CahierNotesTest extends CahierNotes
{

    public static void main(String[] args)
    {
        CahierNotes monCahier = new CahierNotes();
        //monCahier.afficheNote();
        monCahier.afficheNote();
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez entrez votre classe");
        String cours = sc.nextLine();
        monCahier.setNomCours(cours);
        monCahier.afficheNote();


}


}
