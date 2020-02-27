package be.heh.www;

public class Main extends Complexe
{

    public static void main(String[] args)
    {
        Complexe complexe1 = new Complexe(1,18);
        complexe1.afficherComplexe();
        Complexe complexe2 = new Complexe(20,15);
        complexe2.afficherComplexe();
        Complexe complexe = new Complexe();
        complexe.additionComplexe(complexe1,complexe2);
        complexe.soustractionComplexe(complexe1,complexe2);
        Complexe complexe3 = new Complexe(20,15);
        complexe3.afficherComplexe2();
    }
}
