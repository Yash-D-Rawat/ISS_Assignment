package objectOrientedProgramming.Polymorphism;

import objectOrientedProgramming.Interfaces.MeleeAttacker;
import objectOrientedProgramming.Interfaces.MagicAttacker;

public class BattleMage extends GameCharacter
        implements MeleeAttacker, MagicAttacker {

    public BattleMage(String name, int health) {
        super(name, health);
    }

    @Override
    public void attack() {
        System.out.println(name + " performs enchanted strike dealing "
                + (BASE_MELEE_DAMAGE + BASE_MAGIC_DAMAGE) + " damage");
    }

    @Override
    public void specialAttack() {
        // Because two special attacks are present we specify the specialattack method of MagicAttacker
        MagicAttacker.super.specialAttack();
    }

}
