
public class Main {
    public static void main(String[] args) {
        System.out.println("------------------------------------------------------");
        System.out.println("Chosen profession.");
        Mage T1 = new Mage("lica");
        Clothes S1 = new Clothes();
        T1.PrintStatus();
        Weapon S2 = new Weapon();

        T1.equipAccessories(S1);
        T1.equipAccessories(S2);
        System.out.println("------------------------------------------------------");
        System.out.println("After putting on the weapon.");
        T1.PrintStatus();;

        System.out.println("------------------------------------------------------");
        character enemy1 = new Enemy("Evil");
        T1.attack(enemy1);
        System.out.println("After being attacked.");
        enemy1.PrintStatus();
    }
}