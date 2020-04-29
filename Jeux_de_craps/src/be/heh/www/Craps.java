package be.heh.www;

public class Craps
{
    private boolean point = false;
    private int numberDice1;
    private int numberDice2;
    final String nat = "NATURAL";
    final String yo = "YO_ELEVEN";
    final String snake = "SNAKE_EYES";
    final String ace = "ACE_DEUCE";
    final String box = "BOXCARS";


    public int getNumberDice1() {
        return numberDice1;
    }
    public void setNumberDice1(int numberDice1) {
        this.numberDice1 = numberDice1;
    }
    public int getNumberDice2() {
        return numberDice2;
    }
    public void setNumberDice2(int numberDice2) {
        this.numberDice2 = numberDice2;
    }

    public void play()
    {
        De dice1 = new De();
        De dice2 = new De();
        lancerLesDeuxDes(dice1,dice2);
        afficher();
        verification();
    }

    public void lancerLesDeuxDes(De dice1,De dice2)
    {
        dice1.lancer();
        dice2.lancer();
        setNumberDice1(dice1.getNumber());
        setNumberDice2(dice2.getNumber());
    }

    public void afficher()
    {
        System.out.println(getNumberDice1() + " et " + getNumberDice2());
    }

    public void verification()
    {
        int total = numberDice1 + numberDice2;

        switch (total)
        {
            case 2:
            {
                System.out.println(snake);
                System.out.println("Vous avez fait un craps");
                break;
            }
            case 3:
            {
                System.out.println(ace);
                System.out.println("Vous avez fait un craps");
                break;
            }
            case 12:
            {
                System.out.println(box);
                System.out.println("Vous avez fait un craps");
                break;
            }
            case 7:
            {
                System.out.println(nat);
                System.out.println("Vous avez gagner votre mise");
                break;
            }
            case 11:
            {
                System.out.println(yo);
                System.out.println("Vous avez gagner votre mise");
                break;
            }
            case 4:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            {
                System.out.println("Vous avez établis le point ");
                break;
            }
        }
    }

}
