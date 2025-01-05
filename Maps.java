import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        
        Map<String, Integer> students = new HashMap<>();

        students.put("Uno", 12);
        students.put("Zeta", 18);
        students.put("Victo", 15);
        students.put("Septa", 17);

        System.out.println(students);
        System.out.println(students.get("Uno"));

        System.out.println(students.keySet());

        for(String key: students.keySet()){
            System.out.println(key+" : "+students.get(key));
        }
    }
}