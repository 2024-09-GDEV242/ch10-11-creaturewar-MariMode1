
/**
 * Write a description of class Elf here.
 *
 * @author Mari Modebadze
 * @version 2024.11.13
 */
public class Elf extends Creature
{

    /**
     * Constructor for objects of class Elf
     */
    public Elf()
    {
        super(
            Randomizer.nextInt(14) + 5, // Strength: 5-18
            Randomizer.nextInt(18) + 8   // Hit Points: 8-25
        );
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  calculates the attack 
     * @return    returns damage
     */
    public int attack()
    {
        int baseDamage = super.attack();
        if (Randomizer.nextInt(10) <= 1) { // 10% chance for magical damage
            return baseDamage * 2;
        }
        return baseDamage; 
    }
}
