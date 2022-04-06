package string;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

public class DemoPattern {
    public static void main(String[] args) {
        String phone = "0[\\d]{9}";
        if (Pattern.matches(phone, "0981234567")) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        // SPxxx-xx trong đó x là số
        String pattern1 = "SP[\\d]{3}-[\\d]{2}";
        // validate biển số xe Đà Nẵng 43H-12345
        String pattern2 = "43[A-Z]-[\\d]{4,5}";

        String date1 = "31/04/2022";
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        format.setLenient(false);
        try {
            Date date = format.parse(date1);
            System.out.println(date.toString());
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
