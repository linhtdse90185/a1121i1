package string;

public class TestString {
    public static void main(String[] args) {
        String str1 = "Hello to java";
        String str2 = new String("Welcome");
        String str3 = str1.concat(str2);

        // so sánh chuỗi
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");
        if (s1 == s2) {
            System.out.println("S1 = S2");
        }
        if (s1 == s3) {
            System.out.println("S1 = S3");
        }

        if (s1.equals(s3)) {
            System.out.println("S1 equals S3");
        }

        s1 = "Welcome to Java";
        System.out.println(s1.substring(5, 11));

        StringBuilder builder = new StringBuilder(s1);
        builder.append(" and C#");
        builder.reverse();
        System.out.println(builder.toString());
    }
}
