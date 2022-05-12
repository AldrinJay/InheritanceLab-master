public class Character {
    public String characterName = "Gandalf";
    public int level = 0;
    public int healthPoints = 100;
    public int manaPoints = 200;


    Character(String name){
        characterName = name;
    }
    Character(String name, int newLevel, int newHp, int newMp){
        characterName = name;
        level =  newLevel;
        healthPoints = newHp;
        manaPoints = newMp;
    }
    public void displayDetails(){
        System.out.println("Name: " + characterName);
        System.out.println("Level: " + level);
        System.out.println("Health: " + healthPoints);
        System.out.println("Mana: " + manaPoints);
    }
    public void displayCharacter(Character name){
        System.out.println("Character Initialized: " + characterName + "\n");
    }
    public void displayMana(Character charcterName, int manaPoints){
        charcterName.manaPoints -= manaPoints; 
    }
    public void healTarget(Character enemyCharacter, int healPoints){
        enemyCharacter.healthPoints += healPoints;
        System.out.println("HEAL!\n");
    }
    public void damageTarget(Character enemyCharacter,int damagePoints){
        enemyCharacter.healthPoints -= damagePoints;

    if (enemyCharacter.healthPoints<=0){
        System.out.println(enemyCharacter.characterName + "is dead\n");
    }
    if (enemyCharacter.healthPoints<=0){
        System.out.println("\n" + characterName + "Reached level 10!\n");
        }   
    }
}