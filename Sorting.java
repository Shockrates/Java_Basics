import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student>{
    int mark;
    String name;


    public Student(int mark, String name) {
        this.mark = mark;
        this.name = name;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName()+":{" +
            " mark='" + mark+ "'" +
            ", name='" + name + "'" +
            "}";
    }

    @Override
    public int compareTo(Student that) {
        if(this.mark > that.mark)
            return 1;
        else
            return -1;
    }

}

public class Sorting {
    public static void main(String[] args) {
        
        List<Integer> nums = new ArrayList<>();

        nums.add(45);
        nums.add(12);
        nums.add(76);
        nums.add(94);

        System.out.println(nums);

        Collections.sort(nums);
        System.out.println(nums);

        //INTEGER COMPARATOR
        Comparator<Integer> com = new Comparator<Integer>() {

            public int compare(Integer i, Integer j)
            {
                if(i%10 > j%10)
                    return 1;
                else
                    return -1;
            } 
        };

        //SORTS USING COM
        Collections.sort(nums, com);
        System.out.println(nums);

        List<Student> students = new ArrayList<>();
        students.add(new Student(18, "Mark"));
        students.add(new Student(15, "Dunkan"));
        students.add(new Student(17, "Andrew"));
        students.add(new Student(20, "Andrianna"));

        for(Student s: students)
            System.out.println(s);

        //STUDENTS COMPARATOR with LAMDA
        Comparator<Student> studCom =  (i, j) -> i.mark < j.mark ? 1 : -1;
          
      
        Collections.sort(students, studCom);
        for(Student s: students)
            System.out.println(s);


        Collections.sort(students);
        for(Student s: students)
            System.out.println(s);
    }
}
