import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;

import javax.swing.text.DateFormatter;

public class A2 {
    public static void main(String[] args) {
        String string = "January 2, 2010";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);
        LocalDate date = LocalDate.parse(string, formatter);
        System.out.println(date); // 2010-01-02
    }
}