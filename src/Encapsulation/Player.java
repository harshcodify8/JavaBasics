package Encapsulation;
/*
public class Player {
    private String name;
    private int health;
    private String weapon;

    public Player(String name, int health, String weapon) {
        this.name = name;
        this.health = health;
        this.weapon = weapon;
    }

    public void looseHealth(int damage) {
        this.health = this.health - damage;
        if(this.health<=0) {
            System.out.println("Player knocked out");
        }
    }

    public int remaningHealth() {
        return this.health;
    }
 }
 */
public class Player {
    private String name;
    private int health;
    private String weapon;

    public Player(String name, int health, String weapon) {
        this.name = name;
        if(health>=0 && health <=200) {
            this.health = health;
        }
        this.weapon = weapon;
    }

    public void looseHealth(int damage) {
        this.health = this.health - damage;
        if(this.health<=0) {
            System.out.println("Player knocked out");
        }
    }

    public int getHealth() {
        return health;
    }
}
