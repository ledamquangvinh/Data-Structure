import LinkedList.MyList;

public class Main {
    public static void main(String[] args) {
        MyList list = new MyList();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        list.addNode(5);
        System.out.println(list.toString() + " | Length: " + list.getLength());
        list.update(99, 2);
        System.out.println(list.toString() + " | Length: " + list.getLength());
    }
}