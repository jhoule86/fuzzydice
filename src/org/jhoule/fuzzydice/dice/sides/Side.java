/*
 * File: Side.java
 * Author: jhoule
 * Updated: 12 Jan 2010
 */
package fuzzydice.dice.sides;

/**
 * A Side is a face of a Die.
 * @author  jhoule
 * @param <Y> - the type for the value that is represented on the Side.
 */
public class Side<Y>
{

    /**
     * the value that is represented on the Side of the Die.
     */
    protected Y value;
    
    /**
     * constructor. sets value to null.
     */
    public Side()
    {
        value = null;
    }
    
    /**
     * Constructor. sets value to passed value.
     * @param val 
     */
    public Side(Y val)
    {
        value = val;
    }
    
    /**
     * returns the value found on the Side.
     * @return the value on the side.
     */
    public Y getValue()
    {
        return value;
    }
}
