package objectOrientedProgramming.Interfaces;

public interface MeleeAttacker {

    // uncommon variable (constant)
    int BASE_MELEE_DAMAGE = 30;   // public static final by default

    // abstract method
    void attack();

    // default method (has implementation)
    default void specialAttack() {
        System.out.println("Performs Whirlwind Slash dealing "
                + (BASE_MELEE_DAMAGE * 2) + " damage");
    }



}
