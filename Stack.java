public class Stack {
    Node top;


    public Stack(Node top){
        this.top=top;
    }
    public Node getTop(){
        return top;     
    
}   
    public void setTop(Node top){
        this.top=top;
    }
    public void push(int val){
        //  new node with that holds val
        Node newNode = new Node(val, null);       
        // if top is null top should be newNode
        if(top == null){
            top = newNode;
        }  else {// newNode.next is top then top is newNode
            newNode.setNext(top);
            top.setPrev(newNode);
            top = newNode;
        }   
    }
    public int pop(){
        // if top is null, return
        if(top == null){
            return -1; //sentinel value, to show that there is an error while the stack is empty
        } 
        int val=(Integer) top.getData();
        top=top.getNext();
        return val;


        // else top = top.next
    }
    public void printStack(){
        // traverse from top and print each node's data
        Node current = top;
        while(current != null){
            System.out.print(current.getData() + " ");
            current = current.getNext();        
    }
}
