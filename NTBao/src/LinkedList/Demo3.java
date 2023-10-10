package LinkedList;

public class Demo3 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        getNthNode(list, 0);
        list.addNewNode(1);
        list.addNewNode(2);
        list.addNewNode(3);
        getNthNode(list, 2);
    }

    public static void getNthNode(LinkedList list, int index) {
        if(list.length == 0) {
            System.out.println("empty list");
            return;
        }

        if(index > list.length - 1) {
            System.out.println("Index out of range");
            return;
        }

        Node indexNode = list.head;

        if(index == 0) {
            System.out.println("Nth: " + indexNode.data);
            indexNode.next = null;
            indexNode = null;
            return;
        }

        for(int i = 0; i < index; i++) {
            indexNode = indexNode.next;
        }

        System.out.println("Nth: " + indexNode.data);
        indexNode.next = null;
        indexNode = null;
    }
}
