package LinkedList;

public class Demo10 {
    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        list1.addNewNode(9);
        list1.addNewNode(9);
        list1.addNewNode(1);
        LinkedList list2 = new LinkedList();
        list2.addNewNode(9);
        list2.addNewNode(0);
        list2.addNewNode(9);

        SubtractTwoNumbers(list1, list2);
    }

    public static void SubtractTwoNumbers(LinkedList list1, LinkedList list2) {
        list1.reverse();
        list2.reverse();
        LinkedList result = new LinkedList();

        Node indexNode1 = list1.head;
        Node preNode1 = indexNode1;
        Node indexNode2 = list2.head;
        Node preNode2 = indexNode2;

        int excess = 0;

        while(indexNode1 != null || indexNode2 != null) {
            preNode1 = indexNode1;
            preNode2 = indexNode2;

            int valueA;
            int valueB;
            if(indexNode1 == null) { valueA = 0; } else { valueA = indexNode1.data; }
            if(indexNode2 == null) { valueB = 0; } else { valueB = indexNode2.data; }

            if( valueA - valueB + excess < 0 ) {
                // over 10 case
                result.addNewNode(valueA + 10 - valueB + excess);
                excess = -1;
            } else {
                // Normal plus
                result.addNewNode((valueA - valueB + excess));
                excess = 0;
            }

            if(indexNode1 != null) { indexNode1 = indexNode1.next; }
            if(indexNode2 != null) { indexNode2 = indexNode2.next; }
        }

        Node indexResult = result.head;
        while(indexResult.next != null) { indexResult = indexResult.next; }
        if(indexResult.data == 0) { result.deleteTail();}
        list1.reverse();
        list2.reverse();
        result.reverse();

        System.out.println("Subtract Two Numbers");
        list1.print();
        list2.print();
        result.print();
    }
}
