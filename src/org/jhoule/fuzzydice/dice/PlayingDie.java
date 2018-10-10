/*
 * File: Die.java
 * Author: jhoule
 * Updated: 12 Jan 2010
 */
package fuzzydice.dice;

import fuzzydice.dice.sides.Side;
import fuzzydice.dice.list.SizeFixedSelectionList;

/**
 * PlayingDie objects represent a playing die.
 * @author jhoule
 */
public class PlayingDie<X>
{

    /**
     * the storage for the Sides of the Die.
     */
    protected SizeFixedSelectionList<Side<X>> sideStore;

    /**
     * Constructor. sets number of sides for the die.
     * Randomizes the side that is "up"/selected.
     * @param numSides - the number of sides for the die.
     */
    public PlayingDie(int numSides)
    {
        sideStore = new SizeFixedSelectionList<Side<X>>(numSides);

        DieShaker.shakeDie(this);
    }

    /**
     * Constructor. Sets the sides fo the die.
     * Randomizes the side that is "up"/selected.
     * @param lst - the list of Sides to use for the Die.
     */
    public PlayingDie(SizeFixedSelectionList<Side<X>> lst)
    {
        sideStore = lst;

        DieShaker.shakeDie(this);
    }

    /**
     * no-argument constructor.
     */
    public PlayingDie()
    {
        sideStore = new SizeFixedSelectionList<Side<X>>();
    }

    /**
     * gets the value of the side that is currently "up" or selected.
     * @return the "up" side of the Die.
     */
    public X getSelectedVal()
    {
        return this.sideStore.getSelectedObject().getValue();
    }

    /**
     * gets the current "up"/selected index.
     * @return the old index.
     */
    public int setSelectedIndex(int i)
    {
        return this.sideStore.setSelectedIndex(i);
    }

    /**
     * returns the number of sides on this die.
     * @return the number of sides.
     */
    public int size()
    {
        return sideStore.size();
    }
    
    /**
     * returns the ith side of the die.
     * @param i - the index of the side.
     * @return the side chosen.
     */
    public Side<X> getSide(int i)
    {
        return sideStore.get(i);
    }
}
