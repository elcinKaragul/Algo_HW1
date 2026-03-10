package Algo_HW1;

import Algo_HW1.Node;

public class LinkedList {
	
	protected Node head;
	protected long size;
	
	
	public LinkedList(Node head, long size){
		this.head=head;
		this.size=size;
	}
	public Node gethead(){
		return head;
	}
	public long getsize(){
		return size;
	}
	public void sethead(Node head){
		this.head=head;
	}
	public void setsize(long size){
		this.size=size;
	}

	public void findEven(Node current) {
		Node selection = head; //
		while ((Integer) selection.data !=null){

				if ((Integer) selection.data % 2 == 0) {  //casting yapip evenligi kontrol ettik
					Stack stack = new Stack(null); //stack actik
					Node evenStart = selection;
					//stack.push(selection.data); // puhed even node
					while ((Integer) selection.data != null&&(Integer) selection.data % 2 == 0) { //checks if other nodes are even or not if even ads in stack
						stack.push(selection);
						selection = selection.getNext();

					}


				}
				selection = selection.getNext();

	}
	}


	public void insert(int val) {
       
		// create new node
        // if head is null, head = newNode
        // else traverse to end and add there	
	}
		
    public void printList() {
        // traverse from head and print each node's data
    }
}


