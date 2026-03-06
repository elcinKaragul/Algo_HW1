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
        Node newNode = new Node(val, null, null);       
        // if top is null top should be newNode
        if(top == null){
            top = newNode;
        }  else {// newNode.next is top then top is newNode
            newNode.setNext(top);
            top.setPrev(newNode);
            top = newNode;
        }   
    }
    public void pop(){
        // if top is null, return
        if(top == null){
            return;
        } else {
            top = top.getNext();
            if(top != null){
                top.setPrev(null);
            }
        }


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
