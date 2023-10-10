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

    public void addNode(Node newNode) {
        Node currNode = this.head;
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
        if (index == 0) {
            deleteHead();
            return;
        }
        if(index == this.length - 1) {
            deleteTail();
            return;
        }
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

    public void deleteNode(Node node) {
        Node current = this.head;
        if(node == this.head) {
            deleteHead();
            return;
        }
        while(current.next.next != node) {
            current = current.next;
        }

        if(current.next == null) {
            deleteTail();
            return;
        }
        current.next = node.next;
        node = null;

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

    public Node findMiddle() {
        Node current = this.head;
        int i = 0;
        while(i < this.length / 2) {
            i++;
            current = current.next;
        }
        return current;
    }

    public Node searchByIndex(int index) {
        int i = 0;
        if(index < 0 | index > this.length) {
            return null;
        }
        Node current = this.head;
        while(i < index) {
            i++;
            current = current.next;
        }
        return current;
    }
    public Node searchFromTail(int n) {
        int index = this.length - n;
        return searchByIndex(index);
    }

    public void lastToFront() {
        Node current = this.head;
        while(current.next.next != null) {
            current = current.next;
        }

        Node temp = current.next;
        current.next = null;
        temp.next = this.head;
        this.head = temp;
    }

    public void middleToFront() {
        Node current = this.head;
        int i = 0;
        while(i < (this.length % 2 == 0 ? this.length / 2 - 1 : this.length / 2) - 1) {
            i++;
            current = current.next;
        }
        Node temp = current.next;
        current.next = current.next.next;
        temp.next = this.head;
        this.head = temp;
    }

    public void deleteAlternative() {
        int i = 0;
        Node current = this.head;
        int count = 0;
        while(i < (this.length + count - 1)) {
            if(i % 2 == 0) {
                Node temp = current.next;
                current.next = current.next.next;
                temp = null;
                this.length--;
                System.out.println(toString());
                count++;
            }
            else
                current = current.next;
            i++;
        }
    }

    public void reverse() {
        Node prev = null;
        Node current = this.head;
        Node next = null;

        while(current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        this.head = prev;
    }

    public void addOne() {
        this.reverse();
        Node current = this.head.next;
        int carry = 0;
        if(this.head.getData() == 9) {
            carry += 1;
            this.head.setData(0);
        }
        else {
            this.head.setData(this.head.getData() + 1);
        }


        while(current.next != null) {
            if(current.getData() + carry > 9) {
                carry = 1;
                current.setData(0);
            }
            else {
                current.setData(current.getData() + carry);
                carry = 0;
            }

            current = current.next;
        }
        if(current.getData() == 9) {
            current.setData(0);
            this.addNode(1);
        }
        else
            current.setData(current.getData() + carry);
        this.reverse();
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
