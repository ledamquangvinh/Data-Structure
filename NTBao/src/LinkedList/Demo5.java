package LinkedList;

public class Demo5 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addNewNode(1);
        list.addNewNode(2);
//        list.print();
//        moveTailToHead(list);
        list.print();

        list.addNewNode(3);
        list.print();
//        moveTailToHead(list);
//        list.print();
//
        list.addNewNode(4);
        list.print();
        moveTailToHead(list);
        list.print();
    }

    public static void moveTailToHead(LinkedList list) {
        if(list.checkEmpty()) {
            System.out.println("Empty list");
            return;
        }

        if(list.length == 1) {return;}

        Node indexNode = list.head;
        while(indexNode.next.next != null) {
            indexNode = indexNode.next;
        }

        Node tempTail = indexNode.next;
        indexNode.next = null;

        tempTail.next = list.head;
        list.head = tempTail;

    }
}
