package src.cycles.practicalTask;

/**
 * Написать программу высчитывающую факториал введенного целого числа
 */
public class Task1 {
    // !5 = 1 * 2 * 3 * 4 * 5 = 120
    public static void main(String[] args) {
        int value = 5;
        System.out.println(factorialFor(value));
        System.out.println(factorialWhile(value));
    }

    public static int factorialWhile(int value){
    int result = 1;
    int currentValue = 1;

    while (currentValue <= value){
        result *= currentValue;
        currentValue++;
    }
return result;
    }

    public static int factorialFor(int value) {
        int result = 1;
        for (int i = 1; i <= value; i++) {
            result *= i;
        }
        return result;
    }
}
