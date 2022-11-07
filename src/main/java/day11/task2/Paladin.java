package day11.task2;

public class Paladin extends Hero implements Healer {
    public int healHimself;
    public int healTeammate;

    public Paladin() {
        physAtt = 15;
        physDef = 50;
        magicDef = 20;
        healHimself = 25;
        healTeammate = 10;
    }

    @Override
    public void healHimself() {
        if (health + healHimself > 100) {
            health = 100;
        } else {
            health += healHimself;
        }

    }

    @Override
    public void healTeammate(Hero hero) {
        if (hero.health + healTeammate > 100) {
            hero.health = 100;
        } else {
            hero.health += healTeammate;
        }
    }


    @Override
    public String toString() {
        return "Paladin{" +
                "health=" + health +
                '}';
    }
}
