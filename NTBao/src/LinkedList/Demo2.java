package LinkedList;
// Print the middle of a given linked list
public class Demo2 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        printMiddle(list);
        list.addNewNode(1);
        printMiddle(list);
        list.addNewNode(2);
        list.addNewNode(3);
        printMiddle(list);
    }

    public static void printMiddle(LinkedList list) {
        if(list.length == 0) {
            System.out.println("empty list");
            return;
        }

        int index = list.length / 2;

        Node indexNode = list.head;

        for(int i = 0; i < index; i++) {
            indexNode = indexNode.next;
        }

        System.out.println("Middle of this list is: " + indexNode.data);
        indexNode.next = null;
        indexNode = null;
    }
}
