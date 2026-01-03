package objectOrientedProgramming.Polymorphism;

import objectOrientedProgramming.Interfaces.MagicAttacker;

public class Mage extends GameCharacter implements MagicAttacker {

    public Mage(String name, int health) {
        super(name, health);
    }

    @Override
    public void attack() {
        System.out.println(name + " casts Fireball dealing "
                + BASE_MAGIC_DAMAGE + " damage");
    }
}
