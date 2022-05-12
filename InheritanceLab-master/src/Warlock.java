public class Warlock extends Character{
    Warlock(String name){
        super(name, 0, 100, 100);
    }

    public void VoidBlast(Character enemyCharacter){
        manaPoints -= 15;
        System.out.println("\n" + super.characterName + " attacks " + enemyCharacter.characterName + " with Void Blast (Damage - 25)");
        int damagePoints = 25;
        damageTarget(enemyCharacter, damagePoints);
    }

    public void VoidCrystal(Character enemyCharacter){
        manaPoints = 25;
        System.out.println("\n" + super.characterName + " attacks " + enemyCharacter.characterName + " with Void Crystal (Damage - 40)");
        int damagePoints = 40;
        damageTarget(enemyCharacter, damagePoints);
    }

    public void MotivationRoar(){
        System.out.println("\nKillua used recovery spell used");
        System.out.println("+90HP");
        System.out.println("+60MP");
        healthPoints += 90;
        manaPoints += 60;
    }
}
