package objectOrientedProgramming.Polymorphism;

import objectOrientedProgramming.Interfaces.MeleeAttacker;
import objectOrientedProgramming.Interfaces.MagicAttacker;

// This section demonstrates interfaces, polymorphism, multiple inheritance
// The method 'attack' is overridden by mage, warrior, battlemage showcasing runtime polymorphism
// battlemage inherits two interfaces (MagicAttacker, MeleeAttacker) showcasing multiple inheritance

public class Main {
    public static void main(String[] args) {

        System.out.println("Demonstrating interfaces, polymorphism, multiple inheritance\n");

        MeleeAttacker warrior = new Warrior("Thor", 120);
        MagicAttacker mage = new Mage("Merlin", 80);
        BattleMage battlemage = new BattleMage("Ezio", 100);


        System.out.println("Warrior normal attack:");
        warrior.attack();

        System.out.println("\nWarrior special attack: (MeleeAttacker's special attack is called)");
        warrior.specialAttack();

        System.out.println("\nMage normal attack:");
        mage.attack();

        System.out.println("\nMage special attack:");
        mage.specialAttack();

        System.out.println("\nBattlemage combined attack:");
        battlemage.attack();

        System.out.println("\nBattlemage melee special attack: (MagicAttacker's special attack would be called)");
        battlemage.specialAttack();


        System.out.println("\n\nCompile time polymorphism");
        GameCharacter newWarrior = new Warrior("Thor", 120);
        newWarrior.namedAttack();
        newWarrior.namedAttack(10);
    }
}
