package src.cycles.homework;

/**
 * Дано целое число.
 * Написать функцию, которая принимает целое число, а возвращает целое число обратное этому (не строку!).
 * Результат вывести на консоль.
 * Например: 4508 -> 8054, 4700 -> 74, 1234567 -> 7654321
 * <p>
 * Примечание: для решения может понадобится функция возведение числа в степень: Math.pow(число, степень)
 */
public class Task2 {

    public static void main(String[] args) {
        int value = 1234567;
        System.out.println(isFlipNumber(value));
    }

    public static int isFlipNumber(int value) {
        int result = 0;
        for (int i = 0, number = value; i < number; number /= 10) {
            result *= 10;
            result += (number % 10);
        }
        return result;
    }
}
