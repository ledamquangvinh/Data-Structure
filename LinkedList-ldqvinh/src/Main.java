import LinkedList.MyList;
import LinkedList.Node;

public class Main {
    public static void main(String[] args) {
        MyList list = new MyList();
        MyList list2 = new MyList();
        MyList result = new MyList();
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

        list.addNode(1);
        list.addNode(2);
        list.addNode(9);

        list2.addNode(3);
        list2.addNode(2);
        list2.addNode(1);
        System.out.println(list.toString() + " | Length: " + list.getLength());
        System.out.println(list2.toString() + " | Length: " + list2.getLength());
        result = list.add2Lists(list2);
        System.out.println(result.toString() + " | Length: " + result.getLength());
    }
}