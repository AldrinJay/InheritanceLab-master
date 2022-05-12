public class Wizard extends Character{
    Wizard(String name){
        super(name, 0, 100, 100);
    }
    public void fireStorm(Character enemyCharacter){
        manaPoints -=20;
        System.out.println("\n" + super.characterName + " attacks " + enemyCharacter.characterName + " with Firestorm (Damage - 50)");
        int damagePoints = 50;
        damageTarget(enemyCharacter, damagePoints);
    }

    public void Windblade(Character enemyCharacter){
        manaPoints -= 20;
        System.out.println("\n" + super.characterName + " attacks " + enemyCharacter.characterName + " with Windblade (Damage - 85)");
        int damagePoints = 85;
        damageTarget(enemyCharacter, damagePoints);
    }

    public void BlessingofMoonGoddess(){
        System.out.println("\nRyota used recovery spell");
        System.out.println("+80HP");
        System.out.println("40MP");
        healthPoints += 80;
        manaPoints += 40;
    }
    
}
