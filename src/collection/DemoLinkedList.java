package collection;

import java.util.LinkedList;
import java.util.List;

public class DemoLinkedList {
    public static void main(String[] args) {
        List<Student> studentLinkedList = new LinkedList<>();
        studentLinkedList.add(new Student("SV001", "Khoa", 19));
        studentLinkedList.add(new Student("SV002", "Man", 19));
        studentLinkedList.add(new Student("SV003", "Hung", 19));
        studentLinkedList.add(new Student("SV004", "Anh", 19));
        studentLinkedList.add(new Student("SV005", "Bao", 19));

        studentLinkedList.remove(3);
        studentLinkedList.stream().forEach(System.out::println);
    }
}
