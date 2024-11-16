
/**
 * Write a description of class demon here.
 *
 * @author Mari Modebadze
 * @version 2024.11.13
 */
public class demon extends Creature
{


    /**
     * Constructor for objects of class demon
     */
    public demon(int str, int hp)
    {
        super(str, hp);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  calculates attack
     * @return   returns damage
     */
    public int attack()
    {
        int baseDamage = super.attack();
        if (Randomizer.nextInt(20) == 1) { // 5% chance for magical damage
            return baseDamage + 50;
        }
        return baseDamage;
    }
}
