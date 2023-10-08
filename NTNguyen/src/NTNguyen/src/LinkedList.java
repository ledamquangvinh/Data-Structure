package NTNguyen.src;


public class LinkedList {
    Node head;

    LinkedList() {
        head = null;
    }
    //region ADD NODE HEAD
    // This function used to add node at the beginning of the list
    Node addNodeHead(int num) {
        Node newNode = new Node(num);
        newNode.next = head;
        head = newNode;

        return newNode;
    }
    //endregion

    //region ADD NODE TAIL
    // This function used to append node at the end of the list
    Node addNodeTail(int num) {

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


        return newNode;
    }
    //endregion


    //region ADD NODE MIDDLE
    // This function used to add a node after a given node
    // in the middle of the list.
    void insertAfterGiven (int num, Node prev_node) {
        Node newNode = new Node(num);
        newNode.next = prev_node.next;
        prev_node.next = newNode;

    }
    //endregion

    void printList() {
        Node node = this.head;
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Node node1 = list.addNodeHead(10);
        Node node2 = list.addNodeTail(20);
        list.insertAfterGiven(15, node1);
        list.insertAfterGiven(25, node2);
        list.printList();

    }
}




