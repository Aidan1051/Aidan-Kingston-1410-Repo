package week13examples.linkednode;

import java.util.List;

/**
 * LinkedNode is a class that has many of the attributes that come with Java's LinkedList.  Each method below should
 * behave similarly to a LinkedList but using the given private class "Node".  This class is private and cannot be
 * accessed outside of this class.
 *
 * NOTE: You cannot use the java.util.LinkedList package or any other collection type except for ArrayLists
 * and Lists for this assignment!
 *
 * @author [aidan.kingston]
 *
 * @param <T> allows this class to hold any reference data type.
 */
public class LinkedNode<T> {
    // All necessary member variables are here.  No more variables are necessary.
    private int size;
    private Node<T> front;
    private Node<T> back;

    /**
     * Sets all of the member variables to default values.
     */
    public LinkedNode() {
        this.size = 0;
        this.front = null;
        this.back = null;
    }

    /**
     * Removes the element at the front of this LinkedNode.
     * @returns the item that was removed or null if this collection is empty.
     */
    public T poll() {
        if (size != 0) {
            size --;

        }

        return null;
    }

    /**
     * Removes the element at the front of this LinkedNode.
     * @returns the item that was removed or null if this collection is empty.
     */
    public T pollLast() {
        if (size != 0) {
            size--;
        }
        return null;
    }

    /**
     * Removes the first occurrence of a given item starting at the front of the LinkedNode.
     * @param item is the element that should be deleted if it exists.
     * @returns true if the element was found and removed and false otherwise.
     */
    public boolean pollFirstOccurrence(T item) {


        return false;
    }

    /**
     * Looks at the element stored at the front of the LinkedNode.  No changes are made within this collection.
     * @returns the element at the front of this collection or null if it's empty.
     */
    public T peek() {


        return null;
    }

    /**
     * Looks at the element stored at the back of the LinkedNode.  No changes are made within this collection.
     * @return
     */
    public T peekLast() {


        return null;
    }

    /**
     * Adds an element to this LinkedNode.
     * @param element is what gets added to this collection.
     */
    public void push(T element) {


    }

    /**
     * Receives a given list of data and adds every element in the LinkedNode starting from index zero to the end
     * of the list.
     * @param list is the collection that should be added to this LinkedNode
     * @return true if successful and false if the list is null or empty.
     */
    public boolean pushAll(List<T> list) {
        size += (list == null) ? (0) : (list.size());

        return true;
    }

    /**
     * The size of this LinkedNode is a stored value that increments when elements are added and decrements when items
     * are deleted.
     * @returns the size of this LinkedNode.
     */
    public int size() {


        return size;
    }

    /**
     * @returns true if the LinkedNode is empty.
     */
    public boolean isEmpty() {


        return size == 0;
    }

    /**
     * @param t is the element in question.
     * @returns true if this LinkedNode contains the given element and false otherwise.
     */
    public boolean contains(T t) {


        return false;
    }

    /**
     * Determines if all the items in the given List are contained in this LinkedNode.
     * @param list contains the elements in question.
     * @returns true if ALL of the elements are present in the LinkedNode and false if anyone or all of them are missing.
     */
    public boolean containsAll(List<T> list) {


        return false;
    }

    /**
     * @returns a List representation of this LinkedNode.  Index zero points to what is stored at the back, and
     * the final index value points to what's stored at the front.
     */
    public List<T> toList() {


        return null;
    }

    /**
     * Wipes all of the data stored in this LinkedNode.
     */
    public void clear() {

        this.size = 0;
        this.front = null;
        this.back = null;

    }

    /**
     * Converts this LinkedNode to a String representation of what is stored.
     *
     * Example result: [1, 2, 3, 4, 5]
     *   where 1 is the back of the LinkedNode and 5 is the front.
     */
    public String toString() {


        return "";
    }


    public static void main(String[] args) {
        LinkedNode<String> linkedNode = new LinkedNode<>();
        linkedNode.push("a");
        linkedNode.push("b");
        System.out.println(linkedNode);
    }

    /**
     * This class holds the structure of a single LinkedNode.  This class is complete and does not need to be updated.
     *
     * @author aidan.kingston
     *
     * @param <T> is the data type determined by the LinkedNode class.
     */
    private class Node<T> {
        private Node<T> left;
        private Node<T> right;
        private T data;

        public String toString() {
            return data.toString();
        }
    }
}

