public class Doges extends Dog {
    Doges(String n, int a, int he, String c, int ha) {
        name = n;
        age = a;
        height = he;
        colour = c;
        hair = ha;
    }

    public static class Doge extends Dog {
        Doge() {
            name = "Doge";
            age = 7;
            height = 30;
            colour = "yellow";
            hair = 5;
        }
    }

    public static class Cheems extends Dog {
        Cheems() {
            name = "Cheems";
            age = 4;
            height = 25;
            colour = "orange";
            hair = 6;
        }
    }

    public static class Walter extends Dog {
        Walter() {
            name = "Walter";
            age = 9;
            height = 50;
            colour = "white";
            hair = 2;
        }
    }
}

