class GameCharacter {
    String characterName;

    GameCharacter(String characterName) {
        this.characterName = characterName;
    }

    void performAttack() {
        System.out.println("Attack");
    }
}

class Warrior extends GameCharacter {

    Warrior(String name) {
        super(name);
    }

    @Override
    void performAttack() {
        System.out.println(characterName + " attacks with Sword");
    }
}

class Mage extends GameCharacter {

    Mage(String name) {
        super(name);
    }

    @Override
    void performAttack() {
        System.out.println(characterName + " casts Fireball");
    }
}

class Archer extends GameCharacter {

    Archer(String name) {
        super(name);
    }

    @Override
    void performAttack() {
        System.out.println(characterName + " shoots Arrow");
    }
}

public class AdventureGame {

    static void startBattle(GameCharacter characters[]) {

        int warriors = 0;
        int mages = 0;
        int archers = 0;

        System.out.println("Battle Starts\n");

        for (GameCharacter c : characters) {

            c.performAttack();

            if (c instanceof Warrior)
                warriors++;
            else if (c instanceof Mage)
                mages++;
            else if (c instanceof Archer)
                archers++;
        }

        System.out.println("\nWarriors : " + warriors);
        System.out.println("Mages : " + mages);
        System.out.println("Archers : " + archers);
    }

    public static void main(String[] args) {

        GameCharacter characters[] = {
                new Warrior("Thor"),
                new Mage("Merlin"),
                new Archer("Robin"),
                new Warrior("Leon"),
                new Archer("Legolas")
        };

        startBattle(characters);
    }
}