package day11.task2;

public class Shaman extends Hero implements Healer, MagicAttack {
    public int healHimself;
    public int healTeammate;

    public Shaman() {
        physAtt = 10;
        magicAtt = 15;
        physDef = 20;
        magicDef = 20;
        healHimself = 50;
        healTeammate = 30;
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
    public void magicalAttack(Hero hero) {
        double magicAttackDamage = magicAtt * (1 - hero.magicDef / 100);
        if (hero.health - magicAttackDamage < 0) {
            hero.health = 0;
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
