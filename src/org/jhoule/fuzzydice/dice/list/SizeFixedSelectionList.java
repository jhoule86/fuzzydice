/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fuzzydice.dice.list;

import java.util.ArrayList;

/**
 * FixedSlectionList objects are simple Lists with a selected index.
 * They only offer constructors, gets and sets, and sizing..
 * @author jhoule
 */
public class SizeFixedSelectionList<X>
{

    /**
     * the index of the Side that is currently "up" or selected.
     */
    private int selectedIndex;
    
    /**
     * The storage for the list items.
     */
    private ArrayList<X> store;

    /**
     * Constructor. Inits storage.
     */
    public SizeFixedSelectionList()
    {
        store = new ArrayList<X>();
        selectedIndex = -1;
    }

    /**
     * Constructor. Inits storage to size.
     * @param sides 
     */
    public SizeFixedSelectionList(int sides)
    {
        store = new ArrayList<X>(sides);
        selectedIndex = 0;
    }

    /**
     * returns the object that is currently selected.
     * @return the Object 
     */
    public X getSelectedObject()
    {
        return store.get(selectedIndex);
    }

    /**
     * gets the current "up"/selected index.
     * @return the old index.
     */
    public int setSelectedIndex(int i)
    {
        int o = selectedIndex;

        selectedIndex = i;

        return o;
    }

    /**
     * returns the size of this list.
     * @return the size.
     */
    public int size()
    {
        return store.size();
    }

    /**
     * returns the ith item in the list.
     * @param i - the index of the item.
     * @return the X found there.
     */
    public X get(int i)
    {
        return store.get(i);
    }

    /**
     * sets the ith item in the list.
     * @param i - the index of the item.
     * @param v - the value to set.
     * @return the old value at the index.
     */
    public X set(int i, X v)
    {
        X old = store.get(i);

        store.set(i, v);

        return old;
    }
}
