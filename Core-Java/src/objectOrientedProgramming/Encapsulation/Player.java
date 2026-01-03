package objectOrientedProgramming.Encapsulation;

public class Player {
    private int Id;
    private int health;
    private int level;

    public Player(int id) {
        this.Id = id;
        this.health = 100;   // default health
        this.level = 1; // starting level
    }

    public int getId() {
        return Id;
    }

    public int getHealth() {
        return health;
    }

    public int getLevel() {
        return level;
    }

    public void levelUp(){
        this.level++;
    }

    public void takeDamage(int damage) {
        if (damage > 0) {
            health -= damage;
            if (health < 0) {
                health = 0;
            }
        }
    }

    public void heal(int heal_amount){
        if (heal_amount > 0){
            health += heal_amount;
            if(heal_amount > level*100){
                health = level*100;
            }
        }
    }
}
