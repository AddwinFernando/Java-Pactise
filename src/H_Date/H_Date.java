package H_Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class H_Date {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat simp = new SimpleDateFormat("E dd-MM-yyy");
        System.out.println(simp.format(date));
    }
}
