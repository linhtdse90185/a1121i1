package file;

import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID = 1L;

    public String id;
    public String name;
    public int age;
    public boolean sex;
    public static String note;

    public Student(){}

    public Student(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", note=" + note +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Student) {
            Student st = (Student) o;
            return this.id.equals(st.id);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
