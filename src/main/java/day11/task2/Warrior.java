package day11.task2;

public class Warrior extends Hero {
    public Warrior() {
        physAtt = Costants.PHY_ATT_WARRIOR;
        physDef = Costants.PHY_DEF_WARRIOR;
    }


    @Override
    public String toString() {
        return "Warrior{" +
                "health=" + health +
                '}';
    }
}
