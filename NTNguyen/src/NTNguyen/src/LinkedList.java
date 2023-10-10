package NTNguyen.src;
public class LinkedList {
    Node head;

    LinkedList() {
        head = null;
    }
    //region ADD NODE

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
    Node insertAfterGiven (int num, Node prev_node) {
        Node newNode = new Node(num);
        newNode.next = prev_node.next;
        prev_node.next = newNode;
        return newNode;
    }
    //endregion
    //endregion

    //region DELETE NODE

    //region DELETE HEAD

    // This function used to Delete node at the beginning.
    void deleteHead () {
        Node temp = head;
        head = head.next;
    }
    //endregion

    //region DELETE LAST

    // This function used to Delete node at the end.
    void deleteLast() {
        Node last = head;
        Node prev = last;
        while(last.next != null)  {
            prev = last;
            last = last.next;
        }
        prev.next = null;

    }

    //endregion

    // This function used to Delete given node.
    void deleteGivenNode(Node givenNode) {
        Node current = head;
        Node prev = current;
        while(current != givenNode) {
            prev = current;
            current = current.next;
        }

        current = givenNode.next;

        prev.next = current;


    }

    //endregion

    //region PRINT THE LIST
    // This function used to print the list
    void printList() {
        Node node = this.head;
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
    //endregion
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Node node1 = list.addNodeHead(10);
        Node node2 = list.addNodeTail(20);
        Node node3 = list.addNodeTail(25);
        Node node4 = list.insertAfterGiven(15, node1);
        Node node5 = list.insertAfterGiven(30, node2);
        list.deleteHead();
        list.deleteLast();
        list.deleteGivenNode(node2);
        list.printList();

    }
}




