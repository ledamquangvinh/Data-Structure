package LinkedList;

public class dLinkedList {
    dNode head;

    dLinkedList() {
        this.head = null;
    }
    dLinkedList(int data) {
        dNode node = new dNode(data);
        this.head = node;
        node.next = null;
        node.prev = null;
    }
    public void addHead(int data) {
        dNode newNode = new dNode(data);
        if(this.head == null) {
            this.head = newNode;
            newNode.next = null;
            newNode.prev = null;
        } else {
            newNode.next = this.head;
            this.head.prev = newNode;
            this.head = newNode;
        }
    }
    public void print() {
        dNode indexNode = this.head;
        System.out.print("List: ");
        while(indexNode != null) {
            System.out.print(indexNode.data + " ");
            indexNode = indexNode.next;
        }


        System.out.print("\n");
    }

    public static void main(String[] args) {
//        dLinkedList list = new dLinkedList();
//        list.addHead(1);
//        list.print();
//        list.addHead(2);
//        list.print();
//        list.addHead(3);
//        list.print();
    }
}
