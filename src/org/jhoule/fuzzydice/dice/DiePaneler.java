/*
 * File: DiePaneler.java
 * Author: jhoule
 * Updated: 12 Jan 2010
 */

package fuzzydice.dice;

import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 * DiePaneler generates JPanels for all sides of a Die,
 * in order to make it a Visual Die.
 * @author jhoule
 */
public class DiePaneler {
    
    /**
     * makes panels displaying the number for the values on each side of the die.
     * the number is represented by text.
     * adds the panels to the die so that it becomes a proper visual die.
     * @param die - a visual die to create panels for.
     * @return true iff the process passed, false otherwise.
     */
    public boolean dotADie(PlayingDie<Integer> die)
    {
//        for (int i = 0; i < die.size(); i++)
//        {
//            
//        }
        
        throw new UnsupportedClassVersionError("this function is not supported at this time.");
    }
    
    /**
     * makes panels displaying the number for the values on each side of the die.
     * the number is represented by classic dotted sides.
     * adds the panels to the die so that it becomes a proper visual die.
     * @param die - a visual die to create panels for.
     * @return true iff the process passed, false otherwise.
     */
    public boolean numberADie(VisualDie<Integer> die)
    {
        JPanel pnl;
        JTextArea area;
        int dimension = 100;
        String txt;
        
        for (int i = 0; i < die.size(); i++)
        {
            txt = die.getSide(i).getValue().toString();
            
            pnl = new JPanel();
            pnl.setSize(dimension, dimension);
            pnl.setName("DieSide" + txt);
            
            area = new JTextArea(txt);
            area.setSize(dimension, dimension);
            
            die.setPanel(i, pnl);
        }
        
        return true;
    }

}
