package demo2;

import java.util.ArrayList;
import java.util.List;

public class ForDemo {
    public static void main(String[] args) {
        for (int i = 1; i <= 0; i++) {
            //statement
        }
//        boolean a = true, b = false, c = true;
//        if (a & c) {
//            System.out.println(a & c);
//        }
//        if (a || c) {
//            System.out.println(a || c);
//        }
//        System.out.println(5&9);
//        List<Integer> listInteger = new ArrayList<>();
//        listInteger.add(1);
//        listInteger.add(5);
//        listInteger.add(3);
//        for (int x: listInteger) {
//            System.out.println(x);
//        }
//        int [] array = {1, 6, 9, 2};
//        for(int x : array) {
//            System.out.println(x);
//        }

//        label1:
//        for (int i = 0; i < 5; i++) {
//            for (int j = 5; j >= 0; j--) {
//                if (j == 2) {
//                    break;
//                }
//                System.out.println("i : " + i + ", j : " + j);
//            }
//        }

        int count=2,n=3;
        System.out.print("2  3");
        while (count<10) {
            n++;
            boolean checkSNT=true;
            for(int i=2; i<n; i++){
                if(n%i==0) {
                    checkSNT =false;
                }
            }
            if(checkSNT) {
//                System.out.print("  "+n);
                System.out.printf("  %d", n);
                count++;
            }
        }
        // %d số, %s chuỗi, %f số thập phân (%5.2f)
        System.out.printf("\nCount = %4d, n = %10d\n", count, n);

        int a = 2 < 3 ? 2 : 3;
        System.out.println(a);
    }
}
