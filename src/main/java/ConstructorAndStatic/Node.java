package ConstructorAndStatic;

public class Node {
    // write the code of node class here
    int data;
    Node next;
    public Node(int X){
        this.data=X;

    }
    public Node(Node node){
        this.data= node.data;
        this.next=node.next;
    }
}