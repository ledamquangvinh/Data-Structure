package LinkedList;

public class Demo8 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addNewNode(8);

        list.print();
        add1ToNumInList(list);
        list.print();

    }
    public static void add1ToNumInList(LinkedList list) {
        list.reverse();
        Node indexNode = list.head;
        Node preNode = indexNode;
        int excess = 1;

        while(indexNode != null) {
            preNode = indexNode;
            // Check and Add excess
            if(indexNode.data + excess == 10) {
                indexNode.data = 0;
                excess = 1;
            } else {
                indexNode.data = indexNode.data + excess;
                excess = 0;
            }
            // Jump
            indexNode = indexNode.next;
        }

        System.out.println("- Add 1 -");
        if(excess == 1) {
            if(preNode.data == 0) {

                list.addNewNode(1);
            } else {
                preNode.data = preNode.data + 1;
            }
        }
        list.reverse();
    }
}
