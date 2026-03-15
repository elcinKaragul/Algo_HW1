package Algo_HW1;

public class Stack {
    Node top; //top node of stack
    int size; //number of elements in stack
//constructer
    public Stack(Node top) {
        this.top = top;
        size = 0;
    }
//get-set
    public Node getTop() {
        return top;
    }

    public void setTop(Node top) {
        this.top = top;
    }

    //pushes a new value onto the top of the stack
    public void push(Object data) {
        Node newNode = new Node(data);
        if (top == null) {
            top = newNode; //stack was empty
        } else {
            newNode.setNext(top); // new node points to old top
            top = newNode; // new node is now the top

        }
        size++;
    }
    // removes and returns the top element, returns null if stack is empty
    public Object pop() {
        if (top == null) {
            return null;           // null instead of -1
        }
        Object val = top.getData(); //save top value
        top = top.getNext(); //now next of top is top old top is second top
        size--;
        return val;
    }
    // prints all elements from top to bottom
    public void printStack() {
        Node current = top;
        while (current != null) {
            System.out.print(current.getData() + " ");
            current = current.getNext();
        }
    }
}