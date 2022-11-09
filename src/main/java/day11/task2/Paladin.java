package day11.task2;

public class Paladin extends Hero implements Healer {
    private int healHimself;
    private int healTeammate;

    public Paladin() {
        physAtt = Costants.PHY_ATT_PALADIN;
        physDef = Costants.PHY_DEF_PALADIN;
        magicDef = Costants.MAGIC_DEF_PALADIN;
        healHimself = Costants.HEALTH_HIMSELF_PALADIN;
        healTeammate = Costants.HEALTH_TEAMMATE_PALADIN;
    }

    @Override
    public void healHimself() {
        if (health + healHimself > Costants.MAX_HEALTH) {
            health = Costants.MAX_HEALTH;
        } else {
            health += healHimself;
        }

    }

    @Override
    public void healTeammate(Hero hero) {
        if (hero.health + healTeammate > Costants.MAX_HEALTH) {
            hero.health = Costants.MAX_HEALTH;
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
