package Algo_HW1;

public class Node {
	protected Object data;
	protected Node next;
	protected long size;
	
	public Node(int data,long size) {
		this.data=data;
		this.next =null;
		this.size=0;
		
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
	
}
