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
    Node insertBeforeGiven (int num, int index) {
        Node newNode = new Node(num);
        Node temp = head;
        Node prev = head;
        for (int i = 0; i < index; i++){



            // Insert at 1st position, assign head to new node
            if (i == 0 && index == 1){
                newNode.next = head;
                head = newNode;

            }
            else {
                if (i == index - 1) {
                    prev.next = newNode;
                    newNode.next = temp;
                }

            }
            prev = temp;
            temp = temp.next;

        }
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

    //region DELETE GIVEN INDEX
    // This function used to Delete a node at given index.
    void deleteGivenIndex(int index) {
        Node current = head;
        Node prev = current;
        if (index == 1) {
            deleteHead();
        }
        for (int i = 0; i < index; i++) {
            if (i == index - 1) {
                prev.next = current.next;
                current.next = null;
                return;
            }
            prev = current;
            current = current.next;
        }
    }
    //endregion

    //endregion

    // This function used to update node data at given index
    public void updateData (int newData, int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            if (i == index - 1) {
                temp.data = newData;
                return;
            }
            temp = temp.next;
        }
    }

    // This function used to reverse the list
    void reverseList () {
        Node current = head;
        Node prev = null;
        Node next = current;


        while (next != null) {
            current = next;
            next = next.next;
            current.next = prev;
            prev = current;
        }
        head = current;
    }

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

        list.addNodeHead(10);
        list.addNodeTail(20);
        list.addNodeTail(25);
        list.printList();
//        list.insertBeforeGiven(9995, 2);
//        list.insertBeforeGiven(30, 4);
//        list.deleteHead();
//        list.deleteLast();
//        list.deleteGivenIndex(5);
//        list.updateData(555, 2);
        list.reverseList();
        list.printList();

    }
}




