import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;



@FunctionalInterface
interface A {
    void show(int d);
}

interface B {
    int add(int i, int j);
}

public class Demo {
    
    public static void main(String[] args) {
        A obj = (d) -> System.out.println("in show interface "+d);
        B objB = (i, j) -> i+j;
        obj.show(5);
        //System.out.println(objB.add(5, 6));


        //COLLECTIONS
        //Set<Integer> nums = new HashSet<Integer>();
        Set<Integer> nums = new TreeSet<Integer>();
        nums.add(17);
        nums.add(57);
        nums.add(87);
        nums.add(227);

        for(int n: nums){
            //System.out.println(n);
        }

        Iterator<Integer> values = nums.iterator();

        while (values.hasNext()) {
            System.out.println(values.next());
        }


    }

    
}
