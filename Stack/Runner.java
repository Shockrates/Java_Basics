package Stack;

public class Runner {
    
    public static void main(String[] args) {

        Stack nums = new Stack();
        System.out.println(nums.isEmpty());
        nums.push(152);
        nums.push(4);
        nums.push(80);
        nums.push(91);

        nums.show();

        int pop =nums.pop();
        System.out.println(pop);

        int peek =nums.peek();
        System.out.println(peek);

        System.out.println("Size is "+nums.size());
        nums.show();
        System.out.println(nums.isEmpty());

        DynamicStack dnums = new DynamicStack();
        dnums.push(4);
        dnums.show();
        dnums.push(80);
        dnums.show();
        dnums.push(91);
        dnums.show();
        dnums.pop();
        dnums.show();
        dnums.pop();
        dnums.show();
    }
}
