package objectOrientedProgramming.Polymorphism;

import objectOrientedProgramming.Interfaces.MeleeAttacker;

public class Warrior extends GameCharacter implements MeleeAttacker {

    public Warrior(String name, int health) {
        super(name, health);
    }

    @Override
    public void attack() {
        System.out.println(name + " strikes with sword dealing "
                + BASE_MELEE_DAMAGE + " damage");
    }


}
