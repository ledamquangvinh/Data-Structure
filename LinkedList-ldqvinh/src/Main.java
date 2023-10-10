import LinkedList.MyList;
import LinkedList.Node;

public class Main {
    public static void main(String[] args) {
        MyList list = new MyList();
        Node node = new Node(99);
//        list.addNode(1);
//        list.addNode(2);
//        list.addNode(3);
//        list.addNode(4);
//        //list.addNode(node);
//        list.addNode(5);
//        list.addNode(6);
//        list.addNode(7);
//        list.addNode(8);
//        list.addNode(9);

        list.addNode(9);
        list.addNode(9);
        list.addNode(9);
        list.addNode(9);
        System.out.println(list.toString() + " | Length: " + list.getLength());
        list.addOne();

        System.out.println(list.toString() + " | Length: " + list.getLength());
    }
}