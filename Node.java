package Algo_HW1;

public class Node // represents a single element in the linked list
{
	protected Object data; // value stored in the node
	protected Node next; // reference to the next node

	// creates a new node with given data, next is null by default
	public Node(Object data) {
		this.data=data;
		this.next =null;

	}

	//get-set
	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
}
