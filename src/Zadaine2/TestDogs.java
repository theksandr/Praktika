package Zadaine2;

public class TestDogs extends Dog {
    public static void main(String[] args)
    {
        Doges.Doge doge = new Doges.Doge();
        Doges.Cheems cheems = new Doges.Cheems();
        Doges.Walter walter = new Doges.Walter();
        Doges corny = new Doges("Corny", 4,15,"black", 8);

        System.out.println(doge.getAge());
        System.out.println(cheems.getColour());
        System.out.println(walter.getHeight());
        System.out.println(corny.getHair());

        doge.setAge(8);
        corny.setHair(7);
        cheems.setColour("red");
        walter.setHeight(60);

        System.out.println(doge.toString());
        System.out.println(cheems.toString());
        System.out.println(walter.toString());
        System.out.println(corny.toString());
    }

}
