package LinkedList;

public class Demo4 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addNewNode(1);
        list.addNewNode(2);
        list.addNewNode(3);
        getNthFromTheEnd(list, 0);
        getNthFromTheEnd(list, 1);
        getNthFromTheEnd(list, 2);

    }

    public static void getNthFromTheEnd(LinkedList list, int index) {
        if(list.checkIndexOutOfRange(index)) {
            System.out.println("Index out of range");
            return;
        }

        if(list.checkEmpty()) {
            System.out.println("Empty list");
            return;
        }

        int loopTimes = (list.length - 1) - index;
        Node indexNode = list.head;
        for(int i = 0; i < loopTimes; i++) {
            indexNode = indexNode.next;
        }

        System.out.println(indexNode.data);
        indexNode.next = null;
        indexNode = null;
    }
}
