package Stack;

public class Stack {
    
    int stackSize = 5;
    int stack[] = new int[stackSize ];
    int top = 0;

    public void push(int data) {
        if (top == stackSize) {
           System.out.println("Stack s full"); 
        } else {
            stack[top] = data;
            top++;
        }
        
    }

    public void show() {
       for(int n : stack)
        System.out.print(n+" ");
       System.out.println(); 
    }

    public int pop() {

        int data =0;
        if (isEmpty()) {
            System.out.println("Stack is Empty"); 
        } else {
            top--;
            data = stack[top];
            stack[top]=0;
           
        }
        return data;
      

    }
    public int peek() {

        int data = stack[top-1];
        return data;

    }

    public int size(){
        return top;
    } 

    public boolean isEmpty(){
        return top<=0;
    }


    
}
