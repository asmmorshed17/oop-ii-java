class Enemy extends Character {

    public Enemy(String name, int health, int level) {
        super(name, health, level);
    }

    @Override
    public void attack(Character target) {
        int damage = 10;
        target.takeDamage(damage);
        System.out.println(name + " attacks with claws! Damage: " + damage);
    }
}