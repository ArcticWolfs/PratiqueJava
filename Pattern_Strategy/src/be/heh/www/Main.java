package be.heh.www;

public class Main {

    public static void main(String[] args)
    {
	    Facture maFacture = new Facture(50.50);
        System.out.println("Par Défaut (Belgique)");
        System.out.println("-------------------------");
        maFacture.affiche();
        System.out.println("\nAllemagne");
        System.out.println("-------------------------");
        maFacture.setAffichage(new AffichageAllemagne());
        maFacture.affiche();
        System.out.println("\nRoyaume-Uni");
        System.out.println("-------------------------");
        maFacture.setAffichage(new AffichageRoyaumeUni());
        maFacture.affiche();
    }
}
