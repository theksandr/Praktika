package PR5;

import javax.swing.*;

public class Loader {
    public static void main(String[] args) {
        Team team1 = new Team("Red Team");
        Team team2 = new Team("Bleu Team");

        new MyForm(team1, team2);
    }
}
