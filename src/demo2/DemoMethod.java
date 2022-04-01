package demo2;

import java.util.Scanner;

public class DemoMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so a: ");
        int a = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap vao so b: ");
        int b = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap vao 1 chuoi: ");
        String c = scanner.nextLine();
        DemoMethod demoMethod = new DemoMethod();
        System.out.println("So lon nhat la: " + demoMethod.findMax(a, b));
        System.out.println("Chuoi nhap vao: " + c);
    }

    public int findMax(int a, int b) {
        return a > b ? a : b;
    }
}
