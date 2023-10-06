package LinkedList;

public class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }

    Node(int data, Node nextNode) {
        this.data = data;
        this.next = nextNode;
    }

    Node(Node copyNode) {
        this.data = copyNode.data;
        this.next = copyNode.next;
    }
}


