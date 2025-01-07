package Queue;

public class Queue {
    
    int queue[] = new int[5];
    int size;
    int front;
    int rear;

    public void enQueue(int data){
        queue[rear] = data;
        rear = (rear+1)%5;
        size++;
    }

    public int deQueue(){
        int data = queue[front];
        front = (front+1)%5;
        size--;
        return data;
    }

    public void show(){
        System.out.print("Queue Elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front+i)%5]+" ");
        }
        System.out.println();
    }
}
