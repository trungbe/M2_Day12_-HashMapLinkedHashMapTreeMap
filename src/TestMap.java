import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TestMap {
    public static void main(String[] args) {

//        Map<String, Integer> hashMap = new HashMap<>();
//        hashMap.put("Smith", 30);
//        hashMap.put("Anderson", 31);
//        hashMap.put("Lewis", 29);
//        hashMap.put("Cook", 29);
//        System.out.println("Display entries in HashMap");
//        System.out.println(hashMap + "\n");
//
//        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
//        System.out.println("Display entries in ascending order of key");
//        System.out.println(treeMap);
//
//        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
//        linkedHashMap.put("Smith", 30);
//        linkedHashMap.put("Anderson", 31);
//        linkedHashMap.put("Lewis", 29);
//        linkedHashMap.put("Cook", 29);
//        System.out.println("\nThe age for " + "Lewis is " + linkedHashMap.get("Lewis"));
        Student student1 = new Student("Nam", 20, "HN");
        Student student2 = new Student("Hung", 21, "HN");
        Student student3 = new Student("Ha", 22, "HN");
        // write your code here
        Map<Integer, Student> studentMap = new HashMap<Integer, Student>();
        studentMap.put(1, student1);
        studentMap.put(2, student2);
        studentMap.put(3, student3);
        studentMap.put(4, student1);

        for (Map.Entry<Integer, Student> student : studentMap.entrySet()) {
            System.out.println(student.toString());
        }
        System.out.println("...........Set");
        Set<Student> students = new HashSet<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student1);

        for (Student student : students) {
            System.out.println(student.toString());
        }
    }
}

