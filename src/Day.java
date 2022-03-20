import java.security.PrivateKey;
import java.time.LocalDate;

public class Day {
    private int numOfType;

    public Day(int numOfType) {
        this.numOfType = numOfType;
    }

    private String typeOfDay =
            switch (numOfType) {
                case 1 -> "Первая дневная смена";
                case 2 -> "Вторая дневная смена";
                case 3 -> "Первая ночная смена";
                case 4 -> "Вторая ночная смена";
                case 5 -> "Первый выходной";
                case 6 -> "Второй выходной";
                default -> "Неверное значение";
            };

    public String getTypeOfDay() {
        return typeOfDay;
    }
}
