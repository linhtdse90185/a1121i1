package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DemoArrayList {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("SV001", "Khoa", 19));
        studentList.add(new Student("SV002", "Man", 18));
        studentList.add(new Student("SV003", "Hung", 17));
        studentList.add(new Student("SV004", "Anh", 22));
        studentList.add(new Student("SV005", "Bao", 21));

        // muốn sửa age của SV003 thành 20
//        final String ID_FIND = "SV003";
//        Student studentDelete = null;
//        for (Student student: studentList) {
//            if (ID_FIND.equals(student.id)) {
//                student.age = 20;
//                studentDelete = student;
//            }
//        }

        // xóa phần tử có index = 4
//        studentList.remove(4);
//        studentList.remove(studentDelete);

        // Hiển thị danh sách phần tử trong list
//        studentList.stream().forEach(System.out::println);

        // tương đương với cách dùng stream ở trên
//        for (Student student: studentList) {
//            System.out.println(student);
//            System.out.println(student.toString());
//        }

//        Collections.sort(studentList,
//                Comparator.<Student>
//                        comparingInt((student1) -> {
//                            return student1.name.length();
//                        }).thenComparingInt(student2 -> student2.name.length()));
        Collections.sort(studentList,
                Comparator.comparing((stu1) -> stu1.age));
        studentList.stream().forEach(stu1 -> System.out.println(stu1));
    }
}
