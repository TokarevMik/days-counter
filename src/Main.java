import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter formatter =  DateTimeFormatter.ofPattern("dd.MM.yy");
        String secDate = "31.12.21";
//        Scanner scn = new Scanner(System.in);
        LocalDate time1 = LocalDate.now(); // сегодняшняя дата
        LocalDate time2  = LocalDate.parse(secDate,formatter);
        System.out.println(time1.until(time2, ChronoUnit.DAYS));
    }


}
