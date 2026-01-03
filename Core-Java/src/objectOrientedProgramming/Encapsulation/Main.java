package objectOrientedProgramming.Encapsulation;
// This code implements encapsulation with a scenario of gaming system

public class Main {

    public static void main(String[] args) {

        System.out.println("Creating a Player object");
        Player player = new Player(1);

        System.out.println("\nInitial Player State");
        System.out.println("Player ID: " + player.getId());
        System.out.println("Health: " + player.getHealth());
        System.out.println("Level: " + player.getLevel());

        System.out.println("\nPlayer takes damage during gameplay");
        player.takeDamage(30);
        System.out.println("Health after damage: " + player.getHealth());

        System.out.println("\nPlayer heals using a health item");
        player.heal(20);
        System.out.println("Health after healing: " + player.getHealth());

        System.out.println("\nPlayer levels up after completing a mission");
        player.levelUp();
        System.out.println("Current Level: " + player.getLevel());

        System.out.println("\nAttempting to exceed maximum allowed health for current level");
        player.heal(500);
        System.out.println("Health after excessive healing attempt: " + player.getHealth());

        System.out.println("\nDirect modification of health or level is not allowed");
        System.out.println("All state changes occur through controlled methods only");

//        player.level = 100; private variables cannot be accessed
    }
}
