package Algo_HW1;
//
// Title: Stack class
// Author: Kayra Arı-ELçin Karagül
// ID: 10001507-10885319050
// Section: 4
// Assignment: Hw1-Q1
// Description: This class implements a stack using linked nodes.
//              It is used by the LinkedList class to reverse even-valued
//              segments by pushing and popping nodes in LIFO order.
//
public class Stack {
    Node top; //top node of stack
    int size; //number of elements in stack
    //
    // Summary: Constructor that initializes the stack with a given top node.
    // Precondition: top is a Node object or null
    // Postcondition: stack is initialized with size 0
    //
    public Stack(Node top) {
        this.top = top;
        size = 0;
    }
    //
    // Summary: Returns the top node of the stack
    // Precondition: none
    // Postcondition: top node is returned without modifying the stack
    //
    public Node getTop() {
        return top;
    }
    //
    // Summary: Sets the top node of the stack
    // Precondition: top is a valid Node or null
    // Postcondition: top is updated to the given node
    //
    public void setTop(Node top) {
        this.top = top;
    }
    //
    // Summary: Pushes a new value onto the top of the stack.
    // Precondition: data is a valid Object
    // Postcondition: new node added to top, size incremented by 1
    //
    public void push(Object data) {
        Node newNode = new Node(data,null);
        if (top == null) {
            top = newNode; //stack was empty
        } else {
            newNode.setNext(top); // new node points to old top
            top = newNode; // new node is now the top

        }
        size++;
    }
    //
    // Summary: Removes and returns the top element of the stack.
    //          Returns null if the stack is empty.
    // Precondition: none
    // Postcondition: top element removed and returned, size decremented by 1.
    //                returns null if stack was empty.
    //
    public Object pop() {
        if (top == null) {
            return null;           // null instead of -1
        }
        Object val = top.getData(); //save top value
        top = top.getNext(); //now next of top is top old top is second top
        size--;
        return val;
    }
    //
    // Summary: Prints all elements in the stack from top to bottom.
    // Precondition: none
    // Postcondition: all elements printed, stack is unchanged
    //
    public void printStack() {
        Node current = top;
        while (current != null) {
            System.out.print(current.getData() + " ");
            current = current.getNext();
        }
    }
}