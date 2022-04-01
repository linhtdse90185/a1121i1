package oop;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi ban nhap vao 1 chuoi bat ky");
        String str = scanner.nextLine();
//        System.out.println("Nhap vao ky tu tim kiem");
//        char c = scanner.nextLine().charAt(0);
//        int count = 0;
//        for (int i = 0; i < str.length(); i++) {
//            if ((c + "").equalsIgnoreCase(str.charAt(i)+ "")) {
//                count++;
//            }
//        }
//
//        boolean isCase = c < 97;
//        for (int i = 0; i < str.length(); i++) {
//            if (c == str.charAt(i)) {
//                count++;
//            } else {
//                if (isCase) {
//                    if (c + 32 == str.charAt(i)) {
//                        count++;
//                    }
//                } else {
//                    if (c - 32 == str.charAt(i)) {
//                        count++;
//                    }
//                }
//            }
//        }

        int[] count = new int[26];
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 65 && c <= 90) {
                count[str.charAt(i) - 65]++;
            } else if (c >= 97 && c <= 122) {
                count[str.charAt(i) - 97]++;
            }

        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0) {
                System.out.printf("Ky tu %c xuat hien %d lan\n", (char) (i + 65), count[i]);
            }
        }
    }
}
