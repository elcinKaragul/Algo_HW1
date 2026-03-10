package Algo_HW1;

public class LinkedList {

	protected Node head;
	protected long size;

	public LinkedList(Node head, long size) {
		this.head = head;
		this.size = size;
	}

	public Node gethead() { return head; }
	public long getsize() { return size; }
	public void sethead(Node head) { this.head = head; }
	public void setsize(long size) { this.size = size; }

	public void findEven(Node current) {
		Node selection = head;
		Node prev = null;

		while (selection != null) {                           // null check instead of != null cast
			if ((Integer) selection.data % 2 == 0) {
				Stack stack = new Stack(null);
				Node evenStart = selection;

				// push consecutive even nodes onto stack
				while (selection != null && (Integer) selection.data % 2 == 0) {
					stack.push(selection);
					selection = selection.getNext();
				}
				// selection is now first odd node after even segment

				// pop and relink using your stack
				Node newHead = (Node) stack.pop();
				Node rebuilder = newHead;

				while (stack.getTop() != null) {
					Node popped = (Node) stack.pop();
					rebuilder.setNext(popped);
					rebuilder = popped;              // advance rebuilder
				}
				rebuilder.setNext(selection);        // tie to rest of list

				// relink reversed segment back into main list
				if (prev == null) {
					head = newHead;                  // segment was at the start
				} else {
					prev.setNext(newHead);
				}
				prev = rebuilder;
				// don't advance selection, already moved by inner while

			} else {
				prev = selection;
				selection = selection.getNext();
			}
		}
	}

	public void insert(int val) {
		Node newNode = new Node(val);
		if (head == null) {
			head = newNode;
		} else {
			Node current = head;
			while (current.getNext() != null) {
				current = current.getNext();
			}
			current.setNext(newNode);
		}
		size++;
	}

	public void printList() {
		Node current = head;
		while (current != null) {
			System.out.print(current.getData() + " ");
			current = current.getNext();
		}
		System.out.println();
	}
}