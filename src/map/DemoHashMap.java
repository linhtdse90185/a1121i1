package map;

import collection.Student;

import java.util.*;
import java.util.Map.Entry;

public class DemoHashMap {
    public static void main(String[] args) {
        Map<String, Student> studentMap = new HashMap<>();
        studentMap.put("SV001", new Student("SV001", "Nam", 19));
        studentMap.put("SV002", new Student("SV002", "Thao", 20));
        studentMap.put("SV003", new Student("SV003", "Khanh", 21));
        studentMap.put("SV004", new Student("SV004", "Hung", 18));
        studentMap.put("SV005", new Student("SV005", "Ly", 22));

        // sử dụng entry
//        Set<Entry<String, Student>> entries = studentMap.entrySet();
//        for (Entry<String, Student> entry: entries) {
//            System.out.println(entry.getKey());
//            System.out.println(entry.getValue());
//        }

        // sử dụng list key từ map
//        Set<String> keys = studentMap.keySet();
//        for (String key: keys) {
//            System.out.println(key);
//            System.out.println(studentMap.get(key));
//        }

        // sử dụng list value
        Collection<Student> studentList = studentMap.values();
        for (Student student: studentList) {
            System.out.println(student);
        }

    }
}
