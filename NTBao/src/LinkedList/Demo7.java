package LinkedList;

public class Demo7 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addNewNode(1);
        list.addNewNode(2);
        list.addNewNode(3);
        list.addNewNode(4);
        list.addNewNode(5);
        list.print();
        deleteAlternates(list);
        list.print();
    }

    public static void deleteAlternates(LinkedList list) {
        if(list.checkEmpty()) {
            System.out.println("Empty list");
            return;
        }

        if(list.length == 1) {
            return;
        }

        Node indexNode = list.head;
        Node preNode = indexNode;

        while(indexNode != null) {
            // Pre
            preNode = indexNode;
            // Jump (if == null)
            indexNode = indexNode.next;
            if(indexNode == null) {break;}
            // .Next
            preNode.next = indexNode.next;
            // Delete
            indexNode.next = null;
            indexNode = null;
            // Save
            indexNode = preNode.next;
        }
    }
}
