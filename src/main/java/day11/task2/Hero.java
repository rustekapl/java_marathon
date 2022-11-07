package day11.task2;

public abstract class Hero implements PhysAttack {
    int health;
    double physDef;
    double magicDef;
    int physAtt;
    int magicAtt;

    public Hero() {
        health = 100;
    }

    @Override
    public void physicalAttack(Hero hero) {
        double phyAttackDamage = physAtt * (1 - hero.physDef / 100);
        if (hero.health - phyAttackDamage < 0) {
            hero.health = 0;
        } else {
            hero.health -= phyAttackDamage;
        }

    }
}


