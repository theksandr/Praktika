package PR5;

public class TestTeam {
    public static void main(String[] args) {
        Team team1 = new Team("Red Team");
        Team team2 = new Team("Blue Team");

        new MyForm(team1, team2);
    }
}
