package file;

import java.util.ArrayList;
import java.util.List;

public class TestBinary {
    public static void main(String[] args) {
        FileBinaryUtils utils = new FileBinaryUtils();
//        utils.writeFile("data2.dat");
//        System.out.println("Write file success");
//        utils.readFile("data2.dat");
//        utils.writeFileData("data3.mp3");
//        System.out.println("Write file success");
//        utils.readFileData("data3.mp3");
        List<Student> students = new ArrayList<>();
//        students.add(new Student("STU001", "Hoai An", 18));
//        students.add(new Student("STU002", "Thang", 19));
//        students.add(new Student("STU003", "Hieu", 20));
//        students.add(new Student("STU004", "Hung", 18));
//        students.add(new Student("STU005", "Nam", 20));
//        utils.writeFileObject("data4.ini", students);
//        Student.note = "aaa";
//        System.out.println("Write file success");
        students = utils.readFileObject("data4.ini");
        students.forEach(System.out::println);
    }
}
