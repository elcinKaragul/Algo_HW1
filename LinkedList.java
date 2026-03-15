package Algo_HW1;
//
// Title: LinkedList class
// Author: Kayra Arı-Elçin Karagül
// ID: 10001507-10885319050
// Section: 4
// Assignment: Hw1-Q1
// Description: This class implements a singly linked list that supports
//              inserting nodes, printing the list, and reversing even-valued
//              segments using a stack.
//
public class LinkedList {

	protected Node head; // first node of the linked list
	protected long size;//number of nodes in the list

	//
	//    // Summary: Constructor that initializes the linked list with a given
	//    //          head node and size.
	//    // Precondition: head is a Node object or null, size is a valid long value
	//    // Postcondition: linked list is initialized with given head and size
	//    //
	public LinkedList(Node head, long size) {
		this.head = head;
		this.size = size;
	}
	//
	// Summary: Returns the head node of the linked list
	// Precondition: none
	// Postcondition: head node is returned without modifying the list
	//
	public Node gethead() { return head; }
	//
	// Summary: Returns the number of nodes in the linked list
	// Precondition: none
	// Postcondition: size is returned without modifying the list
	//
	public long getsize() { return size; }
	//
	// Summary: Sets the head node of the linked list
	// Precondition: head is a valid Node object or null
	// Postcondition: head is updated to the given node
	//
	public void sethead(Node head) { this.head = head; }
	//
	// Summary: Sets the size of the linked list
	// Precondition: size is a valid long value
	// Postcondition: size is updated to the given value
	//
	public void setsize(long size) { this.size = size; }
	//
	// Summary: Finds all consecutive even-valued segments in the list and
	//          reverses each segment in place using a stack.
	//          For example {1, 2, 8, 9} becomes {1, 8, 2, 9}
	// Precondition: list contains integer values
	// Postcondition: all even segments are reversed, odd nodes stay in place
	//
	public void findEven(Node current) {
		Node selection = head; // Start checking from the  head
		Node prev = null; // tracks the node just before the current even

		while (selection != null) {
			if ((Integer) selection.data % 2 == 0) {//we find the start of even part
				Stack stack = new Stack(null);
				Node evenStart = selection; // mark  the even segment begins

				// push all consecutive even nodes onto the stack
				// after this loop, stack holds the even part in reverse order
				while (selection != null && (Integer) selection.data % 2 == 0) {
					stack.push(selection); // it pushes the Node itself not data
					selection = selection.getNext();//next node is now selection
				}
				// selection is now first odd node after even segment

				// pop and relink them in reverse order
				Node newHead = (Node) stack.pop();//pop nodes from stack, its stack so reverse order(filo)
				Node rebuilder = newHead;

				while (stack.getTop() != null) // keep popping and link nodes until stack is empty
				{
					Node popped = (Node) stack.pop();
					rebuilder.setNext(popped);// link current node to next popped node
					rebuilder = popped;
				}
				rebuilder.setNext(selection);        // tie to rest of list

				// relink reversed segment back into main list
				if (prev == null) {
					head = newHead;                  // segment started at the beginning of the  list
				} else {
					prev.setNext(newHead);// connect previous part to reversed
				}
				prev = rebuilder;// update prev to the last node of the reversed


			} else {
				//current node is odd move forward
				prev = selection;
				selection = selection.getNext();
			}
		}
	}
	//
	// Summary: Inserts a new node with the given value at the end of the list.
	// Precondition: val is a valid integer
	// Postcondition: new node added at the tail, size incremented by 1
	//
	public void insert(int val) {
		Node newNode = new Node(val);
		if (head == null) {
			head = newNode; //list is empty new node becomes head now
		} else {
			Node current = head;
			while (current.getNext() != null) { // goes to last node
				current = current.getNext();
			}
			current.setNext(newNode);// add new node at the end
		}
		size++;
	}
	//
	// Summary: Prints all nodes in the list from head to tail.
	// Precondition: none
	// Postcondition: all node values printed, list is unchanged
	//
	public void printList() // prints all nodes from head to tail

	{
		Node current = head;
		while (current != null) {
			System.out.print(current.getData() + " ");
			current = current.getNext();
		}
		System.out.println();
	}
}