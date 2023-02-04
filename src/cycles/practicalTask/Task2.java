package src.cycles.practicalTask;

/**
 * имеется число, посчитать сумму цифр данного числа
 */
public class Task2 {

    public static void main(String[] args) {

        int value = 12345;
        System.out.println(sumDigits(value));

    }

    public static int sumDigits(int value) {

        int result = 0;

        for (int i = 0, currentValue = value; i < currentValue; currentValue /= 10) {
            result += currentValue % 10;
        }
        return result;
    }
}
