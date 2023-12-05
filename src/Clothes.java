public class Clothes implements accessories{
    protected double atk = 0;
    protected double def = 10;
    protected double HP = 20;

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