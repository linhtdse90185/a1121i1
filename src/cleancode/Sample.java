//package cleancode;
//
//import java.util.Scanner;
//
//public class Sample {
//    public void donGian() {
//        boolean flag;
//        if (flag == true) { //if (flag)
//            System.out.println("true");
//        } else {
//            System.out.println("false");
//        }
//
//        System.out.println(flag ? "true": "false");
//    }
//
//    public void deDoc() {
//        boolean a;
//        if (a == true) {
//        if (5 > 2) {
//        }
//        else {
//        }
//        }
//    }
//
//    public void trungLap() {
//        Scanner scanner = new Scanner(System.in);
//        int[] a = nhapMang(scanner);
//        int[] b = nhapMang(scanner);
//    }
//
//    public int[] nhapMang(Scanner scanner) {
//        System.out.println("Nhap so phan tu cua mang: ");
//        int length = scanner.nextInt();
//        int[] mang = new int[length];
//        for (int i = 0; i < length; i++) {
//            System.out.println("Nhap phan tu thu " + i + ": ");
//            mang[i] = scanner.nextInt();
//        }
//        return mang;
//    }
//
//    public boolean tachBien() {
//        boolean isDivisibleBy4 = year % 4 == 0;
//        if(isDivisibleBy4){
//            boolean isDivisibleBy100 = year % 100 == 0;
//            if (checkDivisible(isDivisibleBy100)) return true;
//        }
//        return false;
//    }
//
//    private boolean checkDivisible(boolean isDivisibleBy100) {
//        if (isDivisibleBy100){
//            boolean isDivisibleBy400 = year % 400 == 0;
//            if(isDivisibleBy400)
//                return true;
//        } else {
//            return true;
//        }
//        return false;
//    }
//}
