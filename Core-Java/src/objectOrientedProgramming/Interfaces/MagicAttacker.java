package objectOrientedProgramming.Interfaces;

public interface MagicAttacker {

    int BASE_MAGIC_DAMAGE = 40;

    void attack();

    default void specialAttack() {
        System.out.println("Casts Arcane Blast dealing "
                + (BASE_MAGIC_DAMAGE * 2) + " damage");
    }


}
