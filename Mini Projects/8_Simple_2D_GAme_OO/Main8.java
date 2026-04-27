public class Main8 {
    public static void main(String[] args) {

        Character player = new Player("Morshed", 100, 1);
        Character enemy = new Enemy("Mishu", 80, 1);
        Character boss = new Boss("Rashed", 200, 5);


        player.attack(enemy);
        enemy.attack(player);
        boss.attack(player);


        PowerUp p = new PowerUp("HEALTH");
        p.apply(player);

        System.out.println("Player Health: " + player.getHealth());
    }
}