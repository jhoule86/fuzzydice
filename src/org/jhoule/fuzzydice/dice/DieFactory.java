/*
 * File: DieFactory.java
 * Author: jhoule
 * Updated: 12 Jan 2010
 */
package fuzzydice.dice;

import fuzzydice.dice.sides.Side;
import fuzzydice.dice.list.SizeFixedSelectionList;

/**
 * DieFactory is a class that generates Die objects.
 * @author jhoule
 * 
 */
public class DieFactory
{

    /**
     * makes a list of integers of specified size, starting at 1 + offset.
     * @param size - the size of the list to create.
     * @param offset - the offset for the integer values.
     * @return the list created, as described.
     */
    public static SizeFixedSelectionList<Side<Integer>> makeIntList(int size, int offset)
    {

        SizeFixedSelectionList<Side<Integer>> lst = new SizeFixedSelectionList<Side<Integer>>(size);

        for (int i = 0; i < size; i++)
        {
            lst.set(i, new Side<Integer>(i + 1 + offset));
        }

        return lst;
    }

    /**
     * makes a list of integers of specified size, starting at 1 + offset.
     * @param size - the size of the list to create.
     * @return the list created, as described.
     */
    public static SizeFixedSelectionList<Side<Integer>> makeIntList(int size)
    {

        SizeFixedSelectionList<Side<Integer>> lst = new SizeFixedSelectionList<Side<Integer>>(size);

        for (int i = 0; i < size; i++)
        {
            lst.set(i, new Side<Integer>(i + 1));
        }

        return lst;
    }

    /**
     * makes a numerical die of certain size, with offset of values.
     * @param size - the number of sides
     * @param offset - the offset for values on the die.
     * @return the Die created.
     */
    public static PlayingDie<Integer> makeNumericalDie(int size, int offset)
    {
        return new PlayingDie(makeIntList(size, offset));
    }

    /**
     * makes a numerical die of certain size, with sides of 1 to size.
     * @param size - the number of sides to put in the Die.
     * @return the Die created.
     */
    public static PlayingDie<Integer> makeNumericalDie(int size)
    {
        return makeNumericalDie(size, 0);
    }

    /**
     * makes a visual "Dot" die, as is commonly seen in parlor games.
     * @param size - the size of the die to make
     * @param offset - the offest for the  side labels.
     * @return the die that was created.
     */
    public static VisualDie<Integer> makeDot(int size, int offset)
    {
        VisualDie d = new VisualDie(makeIntList(size, offset));

        // TODO: generate panels
        
        return d;
    }

    /**
     * makes a visual "Dot" die, as is commonly seen in parlor games.
     * @param size - the size of the die to make
     * @return the die that was created.
     */
    public static VisualDie<Integer> makeDot(int size)
    {
        VisualDie d = new VisualDie(makeIntList(size));
        
        // TODO: generate panels
        
        return d;
    }
}
