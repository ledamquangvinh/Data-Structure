package LinkedList;

//Identical Linked Lists
public class Demo1 {
    public static boolean checkIdentical(LinkedList list1, LinkedList list2) {
        if(list1.length != list2.length) {
            System.out.println("The two lists have different length");
            return false;
        }

        Node indexNode1 = list1.head;
        Node indexNode2 = list2.head;

        while(indexNode1 != null) {
            if(indexNode1.data != indexNode2.data) { // Check the data of the index node
                System.out.println("Some of the nodes are different");
                return false;
            }
            // Move to next node

            indexNode1 = indexNode1.next;
            indexNode2 = indexNode2.next;
        }
        return true;
    }
    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();

        for(int i = 0; i < 5; i++) {
            list1.addNewNode(i);
            list2.addNewNode(i);
        }

        if(checkIdentical(list1, list2)) {
            System.out.println("the lists are identical");
        }
    }
}
