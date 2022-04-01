package oop;

public class Test {
    public static void main(String[] args) {
//        Student student = new Student();
//        student.setId("AAAA");
//        student.setName("Thang");
//        System.out.printf("ID: %s, Name: %s\n", student.getId(), student.getName());
////        Student student1 = new Student("CGDN10001", "Hang");
////        System.out.printf("ID: %s, Name: %s\n", student1.id, student1.name);
//        Student student2 = new Student("CGDN10001", "Hang", 20);
//        student.studyMath();
//        System.out.println("Finish");

        Student a = new Student();
        Student b = new Student();
        a.setId("AAA");
        a.count = 2;
        a.name = "Thanh";
        a.age = 20;
        a.studyMath();
        a.toString();
        System.out.println("Count " + b.count);
        Student.count = 10;
        System.out.println(Student.getClassInfo());
        System.out.println("Count of class: " + a.count);
    }
}
