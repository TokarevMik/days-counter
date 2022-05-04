import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите дату в формате dd.mm.yyyy");
        String secDate = scn.nextLine();
        scn.close();
        System.out.println(getDay(secDate));
    }

    public static String getDay(String secDate) {
        String type;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate time1 = LocalDate.of(2022, 03, 16);//дата отсчета
        LocalDate time2 = LocalDate.parse(secDate, formatter);
        int typeOfDay = 1;
        int days = (int) time1.until(time2, ChronoUnit.DAYS);
        int nums;
        if (days > 6) {
            days %= 6;
            nums = typeOfDay + days;
        } else if (days < 6) {
            nums = typeOfDay + days;
        } else {
            nums = 1;
        }
        type = switch (nums) {
            case 1 -> "Первая дневная смена";
            case 2 -> "Вторая дневная смена";
            case 3 -> "Первая ночная смена";
            case 4 -> "Вторая ночная смена";
            case 5 -> "Первый выходной";
            case 6 -> "Второй выходной";
            default -> "Неверное значение";
        };
        return type;
    }


}
