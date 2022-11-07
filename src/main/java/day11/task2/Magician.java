package day11.task2;

public class Magician extends Hero implements MagicAttack {
    public Magician() {
        physAtt = 5;
        magicAtt = 20;
        magicDef = 80;
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
        return "Magician{" +
                "health=" + health +
                '}';
    }
}
