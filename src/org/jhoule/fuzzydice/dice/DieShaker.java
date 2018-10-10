/*
 * File: DieShaker.java
 * Author: jhoule
 * Updated: 12 Jan 2010
 */
package fuzzydice.dice;

import java.util.Random;

/**
 * DieShaker Objects "shake" Die Objects, randomly 
 * setting the "up"/selected side.
 * 
 * Since the "shake" produces a "random" value, the die may "shake out" to be
 * the same value it had prior to the the "shake."
 * 
 * @author jhoule
 */
public class DieShaker
{

    /**
     * "shakes" the Die specified.
     * @param d - the Die that is shaken.
     * @return the Die, after shaking.
     */
    public static PlayingDie shakeDie(PlayingDie d)
    {
        Random rand = new Random(System.currentTimeMillis());
        
        d.setSelectedIndex(rand.nextInt(d.size()));

        return d;
    }
}
