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

        for (int i = 0; i < value; value /= 10) {
            result += value % 10;
        }
        return result;
    }
}
