package be.heh.www;

public class Main {

    public static void main(String[] args)
    {
        Benefice magasin1 = new BeneficeMagasin(1000);

        Benefice magasin2 = new BeneficeMagasin(2000);

        BeneficeComposite beneficeVille = new BeneficeComposite();
        beneficeVille.add(magasin1);
        beneficeVille.add(magasin2);
        System.out.println("Le bénéfice totale est :" + beneficeVille.getBenefice() + "€");
    }
}
