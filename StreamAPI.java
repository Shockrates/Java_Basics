import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPI {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(4,5,7,3,6,2);

        // for(int i: nums)
        //     System.out.println(i);

        nums.forEach(n-> System.out.println(n));
        System.out.println();


        //A STREAM CAN BE USED ONLY ONCE
        Stream<Integer> s1 = nums.stream();
        Stream<Integer> s2 =s1.filter(n -> n%2 == 0);
        Stream<Integer> s3 =s2.map(n -> n*2);
        //s3.forEach(n-> System.out.println(n));
        int result = s3.reduce(0, (c,e) -> c+e);
        System.out.println();
        System.out.println(result);


        int result2 = nums.stream()
            .filter(n -> n%2 == 0)
            .map(n -> n*2)
            .reduce(0, (c,e) -> c+e);

        System.out.println(result2);
    
    }

   
}
