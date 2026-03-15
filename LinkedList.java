package Algo_HW1;

public class LinkedList {

	protected Node head; // first node of the linked list
	protected long size;//number of nodes in the list

	// Constructor
	public LinkedList(Node head, long size) {
		this.head = head;
		this.size = size;
	}
//getter-setter
	public Node gethead() { return head; }
	public long getsize() { return size; }
	public void sethead(Node head) { this.head = head; }
	public void setsize(long size) { this.size = size; }

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