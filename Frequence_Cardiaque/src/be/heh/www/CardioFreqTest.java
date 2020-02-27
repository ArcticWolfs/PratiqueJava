package be.heh.www;

import java.time.LocalDate;
import java.util.Scanner;

public class CardioFreqTest extends CardioFreq
{

    public static void main(String[] args)
    {
        CardioFreq User1 = new CardioFreq();
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez entrer votre nom : ");
        String nom = sc.nextLine();
        User1.setName(nom);
        System.out.println("Veuillez entrer votre prenom : ");
        String prenom = sc.nextLine();
        User1.setSurname(prenom);
        System.out.println("Veuillez entrer votre date de naissance (de type dd/mm/yyyy: ");
        String dateDeNaissance = sc.nextLine();
        User1.setDay(dateDeNaissance.substring(0,2));
        User1.setMonth(dateDeNaissance.substring(3,5));
        User1.setYear(dateDeNaissance.substring(6,10));
        User1.afficher(dateDeNaissance);


    }
}
