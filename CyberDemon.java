
/**
 * Write a description of class CyberDemon here.
 *
 * @author Mari Modebadze
 * @version 2024.11.13
 */
public class CyberDemon extends demon
{
    
    /**
     * Constructor for objects of class CyberDemon
     */
    public CyberDemon()
    {
        super(
            Randomizer.nextInt(21) + 20, // Strength: 20-40
            Randomizer.nextInt(76) + 25   // Hit Points: 25-100
        );
    }
}