package LinkedList;

import java.util.List;

public class LinkedList {
    Node head;
    int length;
    LinkedList() {
        this.head = null;
        this.length = 0;
    }

    LinkedList(Node node) {
        this.head = node;
        node.next = null;
        this.length = 1;
    }

    public void appendNode(Node appendNode) {
        Node lastNode = this.head;
        Node indexNode = this.head;

        while(indexNode != null) {
            lastNode = indexNode;
            indexNode = indexNode.next;
        }

        if(lastNode != null) {
            lastNode.next = appendNode;
        } else {
            this.head = appendNode;
        }
        appendNode.next = null;

        this.length++;
    }
    public void addNewNode(int data) {
        appendNode(new Node(data));
    }
    public void appendWithIndex(int index, Node appendNode) {
        if(index > length) {
            System.out.println("Append with out of index");
            return;
        }

        Node indexNode = this.head;
        Node preNode = indexNode;

        for(int i = 0; i < index; i++) {
            preNode = indexNode;
             indexNode = indexNode.next;
        }

        if(indexNode == null) {
            // Empty List
            preNode.next = appendNode;
            appendNode.next = null;
        } else {
            if(index == 0) {
                // Index == 0, add node to head
                appendNode.next = this.head;
                this.head = appendNode;
                return;
            }
            // Add node in middle
            preNode.next = appendNode;
            appendNode.next = indexNode;
        }

        this.length++;
    }
    public Node searchWithIndex(int index) {
        Node indexNode = this.head;

        for(int i = 0; i < index; i++) {
            if(indexNode == null) {
                System.out.println("Out of list index");
                return null;
            }
            indexNode = indexNode.next;
        }

        return indexNode;
    }
    public int searchWithData(int data) {
        Node indexNode  = this.head;
        int result = 0;
        boolean isEqual = false;

        while(indexNode != null) {
            if(indexNode.data == data) {
                isEqual = true;
                break;
            }
            indexNode = indexNode.next;
            result++;
        }

        if(isEqual) {
            return result;
        } else {
            System.out.println("No node with " + data + " as data");
            return -1;
        }
    }
    public void deleteHead() {
        if(this.length == 0) {
            return;
        }
        Node temp = this.head;
        this.head = this.head.next;
        temp.next = null;

        this.length--;
    }
    public void deleteTail() {
        if(this.length == 0) {
            return;
        }

        if(this.length == 1) {
            this.head = null;
            return;
        }

        Node indexNode = this.head;
        Node preNode = indexNode;

        while(indexNode.next != null) {
            preNode = indexNode;
            indexNode = indexNode.next;
        }

        preNode.next = null;

        this.length --;
    }
    public void deleteWithIndex(int index) {
//        if(index > this.length) {
//            System.out.println("out of index");
//            return;
//        }
//
//        if(this.length == 1) {
//            this.head.next = null;
//            this.head = null;
//            this.length --;
//            return;
//        }
//
//        if(index == 0) {
//            Node temp = this.head;
//            this.head =  this.head.next;
//            temp.next = null;
//            this.length--;
//            return;
//        }
//        Node indexNode = this.head;
//        Node preNode = indexNode;
//
//        for(int i = 0; i < index; i++) {
//            preNode = indexNode;
//            indexNode = indexNode.next;
//        }
//
//        if(index == this.length) {
//            preNode = null;
//            indexNode = null;
//            this.length--;
//        } else {
//            preNode = indexNode.next;
//            indexNode = null;
//            this.length--;
//        }
        // Check max index
        if(index >= this.length) {
            System.out.println("Input value is out of index");
            return;
        }
        // Variables set up
        Node indexNode = this.head;
        Node preNode  = indexNode;

        int loopTimes = index;
        for(int i = 0; i < loopTimes; i++) {
            preNode = indexNode;
            indexNode = indexNode.next;
        }

        if(index == 0) {
            Node node = this.head;
            this.head = head.next;
            node = null;
        } else {
            preNode.next = indexNode.next;
            indexNode = null;
        }
        this.length--;
    }
    public void deleteAll() {
        Node afNode = this.head;

        while(this.head != null) {
            afNode = this.head.next;
            this.head = null;
            this.head = afNode;
        }
        this.length = 0;
    }
    public void updateAtIndex(int data, int index) {
        if(checkEmpty()) {
            System.out.println("The List is empty");
            return;
        }
        if(checkIndexOutOfRange(index)) {
            System.out.println("Update: Index out of range");
            return;
        }

        if(index == 0) {
            this.head.data = data;
            return;
        }

        Node indexNode = this.head;
        for(int i = 0; i < index; i++) {
             indexNode = indexNode.next;
        }

        indexNode.data = data;
    }
    public void reverse() {
        if(checkEmpty()) {
            System.out.println("The List is empty");
            return;
        }

        if(this.length == 1) {return;}

        Node indexNode = this.head;
        Node preNode = null;
        Node nextNode = null;
        while(indexNode != null) {
            nextNode = indexNode.next;
            indexNode.next = preNode;
            preNode = indexNode;
            indexNode = nextNode;
        }

        this.head = preNode;
    }
    public boolean checkIndexOutOfRange(int index) {
        return (index >= this.length || index < 0);
    }
    public boolean checkEmpty() {
        return (this.length == 0);
    }
    public void print() {
        Node indexNode = this.head;
        System.out.print("LinkedList: ");

        while( indexNode != null) {
            System.out.print(indexNode.data + " - ");
            indexNode = indexNode.next;
        }
        System.out.print("\n");
    }

    public static void main(String[] args) {
        Node node1 = new Node(10);
        Node node2 = new Node(660);

        LinkedList list = new LinkedList();
        list.addNewNode(10);
        list.addNewNode(29);
        list.addNewNode(30);

        list.appendNode(node2);
        list.print();

        System.out.println("-- Search --");

        System.out.println("Seach with index: " + list.searchWithIndex(0).data);
        System.out.println("Seach with data: " + list.searchWithData(660));

        System.out.println("-- Append with index --");

        Node node3 = new Node(999);
        list.print();
        list.appendWithIndex(1, node3);
        list.print();

        System.out.println("-- Delete --");

        list.print();
        System.out.println("-- Head + Tail --");
        list.deleteHead();
        list.deleteTail();
        list.print();
        System.out.println("-- At Index --");
        list.deleteWithIndex(2);
        list.print();
        System.out.println("-- All --");
        list.deleteAll();
        list.print();

        System.out.println("-- Update --");
        list.addNewNode(11);
        list.addNewNode(22);
        list.addNewNode(33);
        list.print();
        list.updateAtIndex(999999, 3);
        list.print();

        System.out.println("-- Reverse --");
        list.print();
        list.reverse();
        list.print();
    }
}
