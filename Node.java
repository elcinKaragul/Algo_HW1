package Algo_HW1;

public class Node {
	protected Object data;
	protected Node next;
	protected Node prev;

	public Node(int data,Node next, Node prev) {
		this.data=data;
		this.next =null;
		this.prev=prev;
	}

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
	public Node getPrev(){
		return prev;
	}
	public void setPrev(Node prev){
		this.prev=prev;
	}
}
