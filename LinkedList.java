package Algo_HW1;

public class LinkedList {
	
	protected Node head;
	
	public void insert(int val) {
        // create new node
        // if head is null, head = newNode
        // else traverse to end and add there
		Node newNode = new Node();
		
       
			
			if(head==null) {
			newNode= head.next;
			head= newNode;
			
			
			
		}else {
			Node current = head;
	        while (current.getNext() != null) {
	        	
	        }
			
			
	}
		
		
		
    

    public void printList() {
        // traverse from head and print each node's data
    }

    public void reverseEvenSubparts() {
        //  add this after insert and print work
    }
}

}
