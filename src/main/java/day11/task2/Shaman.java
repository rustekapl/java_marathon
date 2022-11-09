package day11.task2;

public class Shaman extends Hero implements Healer, MagicAttack {
    private int healHimself;
    private int healTeammate;
    private int magicAtt;

    public Shaman() {
        physAtt = Costants.PHY_ATT_SHAMAN;
        magicAtt = Costants.MAGIC_ATT_SHAMAN;
        physDef = Costants.PHY_DEF_SHAMAN;
        magicDef = Costants.MAGIC_DEF_SHAMAN;
        healHimself = Costants.HEALTH_HIMSELF_SHAMAN;
        healTeammate = Costants.HEALTH_TEAMMATE_SHAMAN;
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
    public void magicalAttack(Hero hero) {
        double magicAttackDamage = magicAtt * (1 - hero.magicDef / 100);
        if (hero.health - magicAttackDamage < Costants.MIN_HEALTH) {
            hero.health = Costants.MIN_HEALTH;
        } else {
            hero.health -= magicAttackDamage;
        }
    }


    @Override
    public String toString() {
        return "Shaman{" +
                "health=" + health +
                '}';
    }
}
