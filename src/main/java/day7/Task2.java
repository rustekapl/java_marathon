package day7;

public class Task2 {
    public static void main(String[] args) {
        Player player1 = new Player(90);
        Player.info();
        Player player2 = new Player(91);
        Player.info();
        Player player3 = new Player(92);
        Player.info();
        Player player4 = new Player(93);
        Player.info();
        Player player5 = new Player(95);
        Player.info();
        Player player6 = new Player(99);
        Player.info();
        Player player7 = new Player(100);
        Player.info();

        for (int i = 0; i < 100; i++) {
            player3.run();
        }
        Player.info();
    }
}
