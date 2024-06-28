package InterfaceNdAbstraction;
import java.util.*;


// write your code here
public class Node {

    private int data;
    private Node next;
    public Node(int x){
        this.data=x;
    }
    public Node(int x, Node K){
        this.data=x;
        this.next=K;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }



}
