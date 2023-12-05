public class Enemy implements character {
    protected String enemyName;
    protected double hp;
    protected double max_hp;
    protected double dmg;
    protected double def;
    protected double base_dmg;
    protected double base_def;
    protected accessories Accessories;

    public Enemy(String enemyName) {
        this.enemyName = enemyName;
        hp = 100.0;
        max_hp = 100.0;
        base_dmg = 30;
        base_def = 30;
    }

    @Override
    public void attack(character player) {
        player.Attacked(getAtkDmg());
    }

    public void attackPlayer(Knight player) {
        player.Attacked(getAtkDmg());
    }

    @Override
    public void Attacked(double Dmg) {
        if (Dmg > base_def) {
            hp = hp - (Dmg - base_def);
        }
    }

    @Override
    public double getAtkDmg() {
        return base_dmg;
    }

    @Override
    public void PrintStatus() {
        System.out.println("Role: Enemy");
        System.out.println("Enemy Name: " + enemyName);
        System.out.println("HP: " + hp + "/" + max_hp);
        System.out.println("BASE DAMAGE: " + base_dmg);
        System.out.println("BASE DEF: " + base_def);
    }
}