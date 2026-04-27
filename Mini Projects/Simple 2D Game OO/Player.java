class Player extends Character {

    public Player(String name, int health, int level) {
        super(name, health, level);
    }

    @Override
    public void attack(Character target) {
        int damage = 20;
        target.takeDamage(damage);
        System.out.println(name + " attacks with sword! Damage: " + damage);
    }
}