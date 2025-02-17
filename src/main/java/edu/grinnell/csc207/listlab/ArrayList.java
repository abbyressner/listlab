package edu.grinnell.csc207.listlab;

import java.lang.IndexOutOfBoundsException;
/**
 * An array-based implementation of the list ADT.
 */
public class ArrayList {
    
    int length;
    int[] arr;
    
    private static final int INITIAL_SIZE = 8;
    
    public ArrayList(){
        this.length = 0;
        this.arr = new int[INITIAL_SIZE];
    }
    
    
 
    /**
     * Adds <code>value</code> to the end of the list
     * 
     * @param value the value to add to the end of the list
     */
    public void add(int value) {
        if (length >= this.arr.length){
            int[] temp = arr;
            arr = new int[this.arr.length * 2];
            for (int i = 0; i< length; i++){
                arr[i] = temp[i];
            }
        } 
        arr[this.length] = value;
        this.length += 1;
    }

    /**
     * @return the number of elements in the list
     */
    public int size() {
        return this.length;
    }

    /**
     * @param index the index of the element to retrieve
     * @return the value at the specified <code>index</code>
     */
    public int get(int index) {
        if (index >= length){
            throw new IndexOutOfBoundsException();
        }
        else {
            return arr[index];
        }
    }

    /**
     * Removes the value at <code>index</code> from the list
     * 
     * @param index the index of the element to remove
     * @return the element at <code>index</code>
     */
    public int remove(int index) {
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }
}
