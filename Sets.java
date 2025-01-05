import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;



public class Sets {
    
    public static void main(String[] args) {



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
