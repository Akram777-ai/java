class Character {
    void attack() {
        System.out.println("Character attacks");
    }
}

class Warrior extends Character {
    void attack() {
        System.out.println("Warrior attacks with sword");
    }
}

class Mage extends Character {
    void attack() {
        System.out.println("Mage casts spell");
    }
}

class Archer extends Character {
    void attack() {
        System.out.println("Archer shoots arrow");
    }
}