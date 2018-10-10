/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fuzzydice.dice;

import fuzzydice.dice.list.SizeFixedSelectionList;
import fuzzydice.dice.sides.Side;
import javax.swing.JPanel;

/**
 * A Playing Die that has a JPanel for visually representing each of its Sides.
 * @author jhoule
 */
public class VisualDie<X> extends PlayingDie<X>
{
    /**
     * the panels for the sides.
     */
    private SizeFixedSelectionList<JPanel> panels;

    /**
     * Constructor. sets the info sides, then prepares the panel storage.
     * @param lst 
     */
    public VisualDie(SizeFixedSelectionList<Side<X>> lst)
    {
        super(lst);
        panels = new SizeFixedSelectionList<JPanel>();
    }

    /**
     * Sets the panel storage to the specified list.
     * @param pnls - the panels to use.
     */
    public void setPanels(SizeFixedSelectionList<JPanel> pnls)
    {
        panels = pnls;
    }
    
    /**
     * gets the list of panels that is used for visually representing the sides
     * of the Die.
     * @return the panel list.
     */
    public SizeFixedSelectionList<JPanel> getPanels()
    {
        return panels;
    }
    
    /**
     * sets the panel for the ith side of the die.
     * @param i - the index of the side
     * @param pnl - the panel to use.
     */
    public void setPanel(int i, JPanel pnl)
    {
        panels.set(i, pnl);
    }
    
    /**
     * gets the ith panel on the die.
     * @param i - the index of the panel to retrieve.
     * @return the panel found.
     */
    public JPanel getPanel(int i)
    {
        return panels.get(i);
    }
}
