package NTNguyen.src;

class Node  {
    int data;
    Node next;

    Node (int d) {
        data = d;
        next = null;
    }
}
class LinkedList {
    Node head;

    LinkedList() {
        head = null;
    }

    void addNodeHead(int num) {

        Node newNode = new Node(num);
        newNode.next = head;
        head = newNode;
    }

    void addNodeTail(int num) {
        Node newNode = new Node(num);
        Node temp = this.head;
        Node last = temp;
        while(temp != null) {
            last = temp;
            temp = temp.next;
        }
        if(last != null){
            last.next = newNode;
        }
        else{
            addNodeHead(num);
        }


    }

    void printList() {
        Node node = this.head;
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
//        list.addNodeHead(5);
//        list.addNodeHead(10);
//        list.addNodeHead(15);
        list.addNodeTail(20);
        list.addNodeTail(30);
        list.printList();

    }
}




