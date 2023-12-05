public class Mage implements character{
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

    public Mage(String playerName){
        this.playerName = playerName;
        level = 1;
        hp = 100.0;
        max_hp = 100.0;
        mana = 75;
        max_mana = 75;
        base_dmg = 60;
        base_def = 30;
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
        System.out.println("Role : Mage");
        System.out.println("Player Name : " + playerName );
        System.out.println("HP : " + hp + "/" + max_hp );
        System.out.println("MANA : " + mana + "/" + max_mana );
        System.out.println("BASE DAMAGE : " + base_dmg );
        System.out.println("BASE DEF : " + base_def );

    }
    public double getAtkDmg(){
        return base_dmg;
    }

    public void Attacked(double Dmg){
        if( Dmg > base_def){
            hp = hp - (Dmg - base_def);
        }
    }
}