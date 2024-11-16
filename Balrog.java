
/**
 * Write a description of class Balrog here.
 *
 * @author Mari Modebadze
 * @version 2024.11.13
 */
public class Balrog extends Creature
{
    
    /**
     * Constructor for objects of class Balrog
     */
    public Balrog()
        {
        super(
            Randomizer.nextInt(51) + 50, // Strength: 50-100
            Randomizer.nextInt(121) + 80  // Hit Points: 80-200
        );
    }


    /**
     * An example of a method - replace this comment with your own
     *
     * @param  sample parameter for a method
     * @return    the sum of the damages
     */
    public int attack()
    {
        int damage1 = super.attack();
        int damage2 = super.attack(); // Attack twice
        return damage1 + damage2;
    }
}
