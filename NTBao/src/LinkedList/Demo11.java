package LinkedList;

public class Demo11 {
    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        list1.addNewNode(1);
        sumOfNthLastNodes(1, list1);
    }

    public static void sumOfNthLastNodes(int nth, LinkedList list) {
        int loopTimes = list.length - nth;

        Node indexNode = list.head;
        for(int i = 0; i < loopTimes; i++) {
            indexNode = indexNode.next;
        }

        int sum = 0;
        while(indexNode != null) {
            sum += indexNode.data;
            indexNode = indexNode.next;
        }

        System.out.println("Sum of " + nth + " values of the list: " + sum);
    }
}
