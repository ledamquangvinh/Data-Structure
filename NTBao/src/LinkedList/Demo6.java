package LinkedList;

public class Demo6 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addNewNode(1);
        list.addNewNode(2);
        list.addNewNode(3);
        list.addNewNode(4);
        list.print();
        moveMiddleToHead(list);
        list.print();
    }

    public static void moveMiddleToHead(LinkedList list) {
        if(list.checkEmpty()) {
            System.out.println("Empty list");
            return;
        }

        if(list.length == 1) {
            return;
        }

        int loopTimes = (list.length / 2) - 1;

        Node indexNode = list.head;
        for(int i = 0; i < loopTimes; i++) {
            indexNode = indexNode.next;
        }
        // Bring middle to head

        Node tempMid = indexNode.next;
        indexNode.next = indexNode.next.next;

        tempMid.next = list.head;
        list.head = tempMid;
    }
}
