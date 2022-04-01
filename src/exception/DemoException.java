package exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DemoException {
    public static void main(String[] args) {
        File file = new File("sample.txt");
        System.out.println(file.getAbsolutePath());
        FileReader reader = null;
        try {
            reader = new FileReader(file);
            System.out.println("Write file");
            int [] a = new int[10];
            a[12] = 1;

        } catch (IOException e) {
            System.out.println("File khong ton tai");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index lon hon do dai cua mang");
        } catch (Exception e) {
            System.out.println("Chuong trinh gap loi: " + e.getMessage());
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // try with resources
        try (FileReader reader1 = new FileReader(file)) {
            System.out.println("Write file");
            int [] a = new int[10];
            a[12] = 1;
        } catch (IOException e) {
            System.out.println("File khong ton tai");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index lon hon do dai cua mang");
        } catch (Exception e) {
            System.out.println("Chuong trinh gap loi: " + e.getMessage());
        }


//        int [] a = new int[10];
//        a[12] = 1;

        try {
            method1();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UserException e) {
            System.out.println("Chuong trinh gap loi: " + e.getMessage());
        }

        method2();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date birthday = null;
        try {
            birthday = simpleDateFormat.parse("12/04/2022");
        } catch (ParseException e) {
            e.printStackTrace();
        }

        try {
            checkDate(birthday);
        } catch (BirthdayException e) {
            e.printStackTrace();
        }
    }

    public static void method1() throws FileNotFoundException, UserException {
        FileReader reader = new FileReader("sample.txt");
        int n = -2;
        if (n < 0) {
            throw new UserException("Khong duoc nhap so am");
        }
    }

    public static void method2() {
        try {
            FileReader reader = new FileReader("sample2.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void method3() throws IOException {
        FileReader reader = null;
        try {
            reader = new FileReader("sample2.txt");
        } finally {
            reader.close();
        }
    }

    public static boolean checkDate(Date birthday) throws BirthdayException {
        if (birthday.before(new Date())) {
            return true;
        }
        throw new BirthdayException("Ngay sinh lon hon ngay hien tai");
    }
}
