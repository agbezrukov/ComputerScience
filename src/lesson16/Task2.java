package src.lesson16;

/**
 * Дано целое число. Определить, является ли последняя цифра этого числа - цифрой 3.
 */
public class Task2 {
    public static void main(String[] args) {

        int number = 123;
        int remainder10 = number % 10;
        if (remainder10 == 3 || remainder10 == -3) {
            System.out.println("correct");
        } else {
            System.out.println("not correct");
        }
    }
}
