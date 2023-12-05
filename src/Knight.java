public class Knight implements character{
    protected String playerName;
    protected int level;
    protected double hp;
    protected double max_hp;
    protected double mana;
    protected double max_mana;
    protected double dmg;
    protected double def;
    protected double base_dmg;
    protected double base_def;
    protected accessories Accessories;

    public Knight(String playerName){
        this.playerName = playerName;
        level = 1;
        hp = 200;
        max_hp = 200;
        mana = 50;
        max_mana = 50;
        base_dmg = 40;
        base_def = 40;
    }
    public void equipAccessories(accessories Accessories){
        if(Accessories instanceof Weapon){
            this.Accessories = Accessories;
            updateStatus();
        }
        if(Accessories instanceof Clothes){
            this.Accessories = Accessories;
            updateStatus();
        }

    }
    public void updateStatus(){
        this.base_def += Accessories.addDEF();
        this.base_dmg += Accessories.addDMG();
        this.max_hp += Accessories.addDMG();
        hp = max_hp ;
    }
    public void PrintStatus(){
        System.out.println("Role : Knight");
        System.out.println("Player Name : " + playerName );
        System.out.println("HP : " + hp + "/" + max_hp );
        System.out.println("MANA : " + mana + "/" + max_mana );
        System.out.println("BASE DAMAGE : " + base_dmg );
        System.out.println("BASE DEF : " + base_def );
    }
    public double getAtkDmg(){
        return base_dmg ;
    }

    public void Attacked(double Dmg){
        if( Dmg > base_def){
            hp = hp - (Dmg - base_def);
        }
    }
}