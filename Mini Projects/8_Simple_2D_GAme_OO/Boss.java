class Boss extends Character {

    public Boss(String name, int health, int level) {
        super(name, health, level);
    }

    @Override
    public void attack(Character target) {
        int damage = 40;
        target.takeDamage(damage);
        System.out.println(name + " uses ultimate attack! Damage: " + damage);
    }
}