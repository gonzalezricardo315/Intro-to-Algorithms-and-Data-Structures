
// LinkedList class
//
// CONSTRUCTION: with no initializer
// Access is via LinkedListIterator class
//
// ******************PUBLIC OPERATIONS*********************
// boolean isEmpty( )     --> Return true if empty; else false
// void makeEmpty( )      --> Remove all items
// LinkedListIterator zeroth( )
//                        --> Return position to prior to first
// LinkedListIterator first( )
//                        --> Return first position
// void insert( x, p )    --> Insert x after current iterator position p
// void remove( x )       --> Remove x
// LinkedListIterator find( x )
//                        --> Return position that views x
// LinkedListIterator findPrevious( x )
//                        --> Return position prior to x
// ******************ERRORS********************************
// No special errors

/**
 * Linked list implementation of the list using a header node. Access to the
 * list is via LinkedListIterator.
 * 
 * @author Mark Allen Weiss
 * @see LinkedListIterator
 */
public class LinkedList<AnyType> {
	/**
	 * Construct the list
	 */
	public LinkedList() {
		header = new ListNode<AnyType>(null);
	}

	/**
	 * Test if the list is logically empty.
	 * 
	 * @return true if empty, false otherwise.
	 */
	public boolean isEmpty() {
		return header.next == null;
	}

	/**
	 * Make the list logically empty.
	 */
	public void makeEmpty() {
		header.next = null;
	}

	/**
	 * Return an iterator representing the header node.
	 */

	/**
	 * Return an iterator representing the first node in the list. This operation is
	 * valid for empty lists.
	 */


	/**
	 * Insert after p.
	 * 
	 * @param x the item to insert.
	 * @param p the position prior to the newly inserted item.
	 */


	/**
	 * Return iterator corresponding to the first node containing an item.
	 * 
	 * @param x the item to search for.
	 * @return an iterator; iterator is not valid if item is not found.
	 */
	// 17.8


	/**
	 * Return iterator prior to the first node containing an item.
	 * 
	 * @param x the item to search for.
	 * @return appropriate iterator if the item is found. Otherwise, the iterator
	 *         corresponding to the last element in the list is returned.

	/**
	 * Remove the first occurrence of an item.
	 * 
	 * @param x the item to remove.
	 */
	// 17.9


	// Simple print method

	private ListNode<AnyType> header;

	// In this routine, LinkedList and LinkedListIterator are the
	// classes written in Section 17.2.

}
