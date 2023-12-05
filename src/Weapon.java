public class Weapon implements accessories{
    protected double atk = 10;
    protected double def = 0;
    protected double HP = 0;

    public void PrintStatus(){
    }
    public double addDEF(){
        return def;
    }
    public double addDMG(){
        return atk;
    }
    public double addHP(){
        return HP;
    }
}