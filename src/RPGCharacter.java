interface RPGCharacter {
    int getHP();
    int getATK();
    int getDEF();
    int getMana();
    int getSpeed();
    int getLevel();
}

interface Role {
    String getRoleName();
    int getHPBonus();
    int getATKBonus();
    int getDEFBonus();
    int getManaBonus();
    int getSpeedBonus();
}

class Barbarian implements RPGCharacter, Role {
    
}

class Knight implements RPGCharacter, Role {
    
}

class Mage implements RPGCharacter, Role {
    
}

class Ranger implements RPGCharacter, Role {
    
}

class Rogue implements RPGCharacter, Role {
    
}

// Task 2: อินเทอร์เฟซสำหรับอุปกรณ์เสริม
interface Equipment {
    int getHPBonus();
    int getATKBonus();
    int getDEFBonus();
    int getManaBonus();
    int getSpeedBonus();
}

class Headwear implements Equipment {
   

class Weapon implements Equipment {
    
}

class Clothes implements Equipment {
    
}

class Rings implements Equipment {
   
}

class Boots implements Equipment {
    
}
}
