package LinkedList;

import java.security.PublicKey;

public class MyList {
    private Node head;
    private int length;

    public MyList(Node head, int length) {
        this.head = head;
        this.length = length;
    }

    public MyList() {
        this.head = null;
        this.length = 0;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void addNodeHead(int num) {
        Node newNode = new Node(num);
        newNode.next = head;
        head = newNode;
    }

    public void addNode(int data) {
        Node currNode = this.head;
        Node newNode = new Node(data);
        if(this.head == null) {
            this.head = newNode;
            newNode.next = null;
            this.length++;
            return;
        }
        while(currNode.next != null) {
            currNode = currNode.next;
        }

        currNode.next = newNode;
        newNode.next = null;
        this.length++;
    }

    public void addNodeAt(int index, int data) {
        Node newNode = new Node(data);
        Node current = this.head;
        int i = 0;
        while(i < index - 1) {
            i++;
            current = current.next;
        }
        Node temp = current.next;
        current.next = newNode;
        newNode.next = temp;
        this.length++;
    }

    public void deleteTail() {
        Node current = this.head;
        while(current.next.next != null) {
            current = current.next;
        }

        current.next = null;
        this.length--;
    }

    public void deleteHead() {
        Node current = this.head;
        this.head = current.next;
        current = null;
        this.length--;
    }

    public void deleteNodeAt(int index) {
        Node current = this.head;
        int i = 0;
        while(i < index - 1) {
            i++;
            current = current.next;
        }
        Node temp = current.next;
        current.next = current.next.next;
        temp = null;
        this.length--;
    }

    public void deleteAll() {
        Node current = this.head;
        while(current.next != null) {
            current = current.next;
            deleteHead();
        }
        deleteHead();
    }

    public Node update(int data, int index) {
        if(index < 0 || index > this.length) {
            return null;
        }
        Node current = this.head;
        if(index == 0) {
            current.setData(data);
            return current;
        }
        int i = 0;
        while(i < index) {
            i++;
            current = current.next;
        }
        current.setData(data);
        return current;
    }

    public String toString() {
        String result = "" ;
        Node current = this.head;
        if(this.length == 0) {
            result = "List is empty";
        }
        else {
            while(current.next != null) {
                result += current.getData() + " - ";
                current = current.next;
            }
            result += current.getData();
        }
        return result;
    }
}
