abstract class Character {
    protected String name;
    private int health;
    private int level;

    public Character(String name, int health, int level) {
        this.name = name;
        this.health = health;
        this.level = level;
    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }

    public void takeDamage(int damage) {
        if (damage > 0) {
            health = Math.max(0, health - damage); // prevent negative
        }
    }

    public void heal(int amount) {
        if (amount > 0) {
            health += amount;
        }
    }


    public abstract void attack(Character target);
}