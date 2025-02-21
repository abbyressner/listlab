package edu.grinnell.csc207.listlab;

/**
 * A linked implementation of the list ADT.
 */
public class LinkedList {
    
    private static class Node {
        public int value;
        
        public Node next;
        
        public Node(int n){
            this.value = n;
        }
    }
    
    int sz;
    Node head;
    
    public LinkedList() {
        this.sz = 0;
        
        this.head = null;
    }
    
    /**
     * Adds <code>value</code> to the end of the list
     * 
     * @param value the value to add to the end of the list
     */
    public void add(int value) {
        Node newNode = new Node(value);
        if (sz == 0){
            this.head = newNode;
            sz++;
        }
        else {
            Node cursor = this.head;
            for (int i = 0; i < sz - 1; i++) {
                cursor = this.head.next;

            }
            cursor.next = newNode;
            this.sz++;
        }
    }

    /**
     * @return the number of elements in the list
     */
    public int size() {
      return this.sz;
    }

    /**
     * @param index the index of the element to retrieve
     * @return the value at the specified <code>index</code>
     */
    public int get(int index) {
        Node cursor = this.head;
        if (index > sz) {
            throw new IndexOutOfBoundsException();
        }
        else {
            for (int i = 0; i < index; i++){
                cursor = this.head.next;
            }
        }
        return cursor.value;
    }

    /**
     * Removes the value at <code>index</code> from the list
     * 
     * @param index the index of the element to remove
     * @return the element at <code>index</code>
     */
    public int remove(int index) {
        Node cursor = this.head;
        int ret;
        if (index > sz || index > 0) {
            throw new IndexOutOfBoundsException();
        }
        else if (index == 0) {
            ret = this.head.value;
            this.head = this.head.next;
        }
        else {
            for (int i = 0; i < index - 1; i++){
                cursor = this.head.next;
            }
            ret = cursor.next.value;
            cursor.next = cursor.next.next;
            
        }
        this.sz--;
        return ret;
    }
}
