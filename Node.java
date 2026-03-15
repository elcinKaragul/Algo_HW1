package Algo_HW1;
//
// Title: Node class
// Author: Kayra Arı-Elçin Karagül
// ID: 10001507-10885319050
// Section: 4
// Assignment: Hw1-Q1
// Description: This class represents a single node in a linked list.
//              Each node holds a data value and a reference to the next node.
//
public class Node
{
	protected Object data; // value stored in the node
	protected Node next; // reference to the next node

	//
	// Summary: Constructor that creates a new node with given data.
	//          Next is set to null by default.
	// Precondition: data is a valid Object
	// Postcondition: new node is created with given data and next set to null
	//
	public Node(Object data) {
		this.data=data;
		this.next =null;

	}

	//
	// Summary: Returns the data stored in this node
	// Precondition: none
	// Postcondition: data is returned without modifying the node
	//
	public Object getData() {
		return data;
	}
	//
	// Summary: Sets the data of this node
	// Precondition: data is a valid Object
	// Postcondition: node's data is updated to the given value
	//
	public void setData(Object data) {
		this.data = data;
	}
	//
	// Summary: Returns the next node in the linked list
	// Precondition: none
	// Postcondition: next node is returned without modifying the node
	//
	public Node getNext() {
		return next;
	}
	//
	// Summary: Sets the next node reference
	// Precondition: next is a valid Node or null
	// Postcondition: this node's next pointer is updated to the given node
	//
	public void setNext(Node next) {
		this.next = next;
	}
	
}
