package LinkedList;

public class Runner {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.insert(17);
        list.insert(45);
        list.insert(12);
        list.insertAtStart(37);

        list.insertAt(2,85);
        list.insertAt(0,81);

        list.show();
    }
}
