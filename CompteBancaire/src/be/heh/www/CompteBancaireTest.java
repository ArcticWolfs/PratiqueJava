package be.heh.www;

public class CompteBancaireTest extends CompteBancaire
{

    public static void main(String[] args)
    {
	    CompteBancaire cb1 = new CompteBancaire(50);
	    cb1.afficherSolde();

        CompteBancaire cb2 = new CompteBancaire(-7.50);
        cb2.Depot(100);
        cb2.afficherSolde();
    }
}
