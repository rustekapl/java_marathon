package day11.task2;

public class Magician extends Hero implements MagicAttack {

    private int magicAtt;
    public Magician() {
        physAtt = Costants.PHY_ATT_MAGICIAN;
        magicAtt = Costants.MAGIC_ATT_MAGICIAN;
        magicDef = Costants.MAGIC_DEF_MAGICIAN;
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
        return "Magician{" +
                "health=" + health +
                '}';
    }
}
