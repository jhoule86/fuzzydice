/*
 * File: VisualDie.java
 * Author: jhoule
 * Updated: 12 Jan 2010
 */
package fuzzydice.dice.sides;

import javax.swing.JPanel;

/**
 * A "Visual" side of a die, providing a visual representation of the 
 * value, as a JPanel.
 * VisualSides are intended for providing visual feedback in a Dice game or
 * other visual application.
 * @author jhoule
 */
public abstract class VisualSide<X> extends Side<X>
{
    /**
     * the panel used to show the data on this side.
     */
    public JPanel myPanel;

    /**
     * Sets the panel used to show data.
     * @param pnl - the panel to use.
     */
    public void setPanel(JPanel pnl)
    {
        this.myPanel = pnl;
    }
}
