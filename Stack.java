package Algo_HW1;

public class Stack {
    Node top;
    int size;

    public Stack(Node top) {
        this.top = top;
        size = 0;
    }

    public Node getTop() {
        return top;
    }

    public void setTop(Node top) {
        this.top = top;
    }

    public void push(Object data) {
        Node newNode = new Node(data);
        if (top == null) {
            top = newNode;
        } else {
            newNode.setNext(top);
            top = newNode;
        }
        size++;
    }

    public Object pop() {          // Object instead of int
        if (top == null) {
            return null;           // null instead of -1
        }
        Object val = top.getData();
        top = top.getNext();
        size--;
        return val;
    }

    public void printStack() {
        Node current = top;
        while (current != null) {
            System.out.print(current.getData() + " ");
            current = current.getNext();
        }
    }
}