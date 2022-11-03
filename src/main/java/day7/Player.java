package day7;

public class Player {
    int stamina;
    final int MAX_STAMINA = 100;
    final int MIN_STAMINA = 0;
    static int countPlayers=0;

    public Player(int stamina) {
        this.stamina = stamina;
        countPlayers++;
    }

    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }
    public void run(){
        stamina--;
        if(stamina==0){
            countPlayers--;
        }
    }
    public void info(){
        if(countPlayers<6){
            System.out.println("Команды неполные. На поле еще есть "+(6-countPlayers)+" свободных мест");
        }
        else
            System.out.println("На поле нет свободных мест");
    }
}
