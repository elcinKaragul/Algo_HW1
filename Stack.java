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
<<<<<<< HEAD

    public void push(Object val){
=======
    public void push(Object data, Node next){
>>>>>>> 452d5c3 (spdvjojv)
        //  new node with that holds val
        Node newNode = new Node(data, null);       
        // if top is null top should be newNode
        if(top == null){
            top = newNode;
        }  else {// newNode.next is top then top is newNode
<<<<<<< HEAD
            newNode.setNext(top);
            top = newNode;
=======
            Node temp= top;
            top.next = newNode; //once topun ustune yeni node ekle
            top = newNode; //sonra yeni topun yeni eklenen oldugunu belirt
            
            
>>>>>>> 452d5c3 (spdvjojv)
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
