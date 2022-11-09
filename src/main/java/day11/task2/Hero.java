package day11.task2;

public abstract class Hero implements PhysAttack {
    int health;
    double physDef;
    double magicDef;
    int physAtt;


    public Hero() {
        health = Costants.HEALTH;
    }

    @Override
    public void physicalAttack(Hero hero) {
        double phyAttackDamage = physAtt * (1 - hero.physDef / 100);
        if (hero.health - phyAttackDamage < Costants.MIN_HEALTH) {
            hero.health = Costants.MIN_HEALTH;
        } else {
            hero.health -= phyAttackDamage;
        }

    }
}


