package Queue;

public class Runner {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enQueue(11);
        q.enQueue(5);
        q.enQueue(7);
        q.enQueue(3);
        q.show();
        q.deQueue();
        q.deQueue();
        q.show();
        q.enQueue(9);
        q.enQueue(1);
        q.show();
    }
}
