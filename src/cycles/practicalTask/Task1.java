package src.cycles.practicalTask;

/**
 * Написать программу высчитывающую факториал введенного целого числа
 */
public class Task1 {
    // !5 = 1 * 2 * 3 * 4 * 5 = 120
    public static void main(String[] args) {
        int value = 5;
        System.out.println(factorial(value));
    }

    public static int factorial(int value) {
        int result = 1;
        for (int i = 1; i <= value; i++) {
            result *= i;
        }
        return result;
    }
}
