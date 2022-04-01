package generic_stack_queue;

import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        System.out.println("Chuong trinh chuyen so thap phan sang so nhi phan");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so thap phan can chuyen doi: ");
        int n = scanner.nextInt();
        Stack<Integer> results = new Stack<>();

        while (n != 0) {
            results.push(n % 2);
            n = n/2;
        }

        System.out.println("So nhi phan cua " + n + " : ");
        while (!results.empty()) {
            System.out.print(results.pop());
        }
    }

    public void sort() {
        List<Student> students = new ArrayList<>();

        Collections.sort(students);
        Collections.sort(students, new CompareStudentByAge());
    }

}
