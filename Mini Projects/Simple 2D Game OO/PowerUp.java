class PowerUp {
    private String type;

    public PowerUp(String type) {
        this.type = type;
    }

    public void apply(Character c) {
        if (type.equals("HEALTH")) {
            c.heal(30);
            System.out.println("Health boosted!");
        }
    }
}