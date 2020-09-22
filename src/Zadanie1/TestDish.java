package Zadanie1;

public class TestDish
{
    public static void main(String[] args)
    {
        Spoon spoon = new Spoon(2, 100);
        Fork fork = new Fork(4,100);
        Plate plate = new Plate(10,50);

        System.out.println("Spoon volume: "+spoon.getProperty());
        System.out.println("Fork prongs: "+fork.getProperty());
        System.out.println("Plate area: "+plate.getProperty());

        spoon.setStock(50);
        fork.setStock(50);
        plate.setStock(25);


        spoon.setProperty(3);
        fork.setProperty(2);
        plate.setProperty(15);

        System.out.println(spoon.toString());
        System.out.println(fork.toString());
        System.out.println(plate.toString());
    }

}
