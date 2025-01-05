@FunctionalInterface
interface A {
    void show(int d);
}

interface B {
    int add(int i, int j);
}

public class FunctInterface {
    
    public static void main(String[] args) {
        A obj = (d) -> System.out.println("in show interface "+d);
        B objB = (i, j) -> i+j;
        obj.show(5);
        System.out.println(objB.add(5, 6));

    }

    
}
