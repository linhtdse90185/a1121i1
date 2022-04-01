package oop;

public class Student {
    private String id;
    protected String name;
    int age;
    private String className;
    public static int count = 0;

    public Student(){
        System.out.println("Khong tham so");
    };

    public Student(String id, String name) {
        System.out.println("Co 2 tham so");
        this.id = id;
        this.name = name;
    }


    public Student(String id, String className, int age) {
        this(id, null);
        System.out.println("Co 3 tham so");
        this.age = age;
        this.className = className;
        count++;
    }

    static {
        count = 10;
        System.out.println("Count in class: " + count);
    }

    public static String getClassInfo() {
        return "Student.class";
    }

    public void studyMath() {
        System.out.println("Studying Math");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
