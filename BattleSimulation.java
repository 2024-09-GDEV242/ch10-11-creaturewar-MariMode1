

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

/**
 * The test class BattleSimulation.
 *
 * @author  Mari Modebadze
 * @version 2024.11.13
 */
public class BattleSimulation
{
    private ArrayList<Creature> goodArmy;
    private ArrayList<Creature> evilArmy;

    /**
     * Default constructor for test class BattleSimulation
     */
    public BattleSimulation()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        goodArmy = new ArrayList<>();
        evilArmy = new ArrayList<>();

        // Populate good army
        for (int i = 0; i < 100; i++) {
            if (Randomizer.nextInt(10) <= 7) {
                goodArmy.add(new Human());
            } else {
                goodArmy.add(new Elf());
            }
    }
     // Populate evil army
        for (int i = 0; i < 50; i++) {
            if (Randomizer.nextInt(10) <= 7) {
                evilArmy.add(new CyberDemon());
            } else {
                evilArmy.add(new Balrog());
            }
        }
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
        goodArmy.clear();
        evilArmy.clear();
    }

    /**
     * Test the battle simulation.
     */
    @Test
    public void testBattleSimulation()
    {
        int goodIndex = 0;
        int evilIndex = 0;

        while (goodIndex < goodArmy.size() && evilIndex < evilArmy.size()) {
            Creature goodCreature = goodArmy.get(goodIndex);
            Creature evilCreature = evilArmy.get(evilIndex);

            // Simulate one-on-one combat
            while (goodCreature.isAlive() && evilCreature.isAlive()) {
                goodCreature.takeDamage(evilCreature.attack());
                evilCreature.takeDamage(goodCreature.attack());
            }

            // Check who is alive and update indices
            if (!goodCreature.isAlive()) {
                goodIndex++;
            }
            if (!evilCreature.isAlive()) {
                evilIndex++;
            }
        }

        // Determine the result of the battle
        if (goodIndex < goodArmy.size()) {
            System.out.println("Good army wins!");
        } else {
            System.out.println("Evil army wins!");
        }

        // Optionally assert the results
        assertTrue(goodIndex < goodArmy.size() || evilIndex < evilArmy.size());
    }

}
