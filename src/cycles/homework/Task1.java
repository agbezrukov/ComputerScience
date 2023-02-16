package src.cycles.homework;

/**
 * Посчитать четные и нечетные цифры целого числа и вывести их на консоль.
 * Для решения написать 2 функции, которые будут принимать введенное целое число,
 * а возвращать количество четных цифр (вторая функция - нечетных).
 * Например: если введено число 228910, то у него 4 четные цифры (2, 2, 8, 0) и 2 нечетные (9, 1).
 */
public class Task1 {
    public static void main(String[] args) {
        int value = 3345708;
        System.out.println("четных чисел " + getEvenNumbers(value));
        System.out.println("нечетных чисел " + getOddNumbers(value));
    }

    private static int getEvenNumbers(int value) {
        int amount = 0;
        for (int i = 0, number = value; i < number; number /= 10) {
            int remainder = number % 10;
            if (remainder % 2 == 0) {
                amount++;
            }
        }
        return amount;
    }

    private static int getOddNumbers(int value) {
        int amount = 0;
        for (int i = 0, number = value; i < number; number /= 10) {
            int remainder = number % 10;
            if (remainder % 2 != 0) {
                amount++;
            }
        }
        return amount;
    }
}
