package objectOrientedProgramming.Polymorphism;

public class GameCharacter {
    String name;
    int health;

    public GameCharacter(String name, int health) {
        this.health = health;
        this.name = name;
    }

    public void namedAttack(){
        System.out.println("First named attack");
    }

    public void namedAttack(int powerMultiplier) {
        System.out.println("Second named attack with input parameter: " + powerMultiplier);
    }
}
