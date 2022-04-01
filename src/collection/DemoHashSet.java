package collection;

import java.util.HashSet;
import java.util.Set;

public class DemoHashSet {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();
        students.add(new Student("SV001", "Khoa", 19));
        students.add(new Student("SV002", "Man", 19));
        students.add(new Student("SV003", "Hung", 19));
        students.add(new Student("SV003", "Hung", 20));

        students.stream().forEach(System.out::println);
    }
}
