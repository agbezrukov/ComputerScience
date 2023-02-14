package src.arrays.homework;

/**
 * Дан одномерный массив символов.
 * Преобразовать его в одномерный массив чисел, где число -
 * это код символа (любой символ - это число в памяти компьютера).
 * Например: [‘a’, ‘6’, ‘y’, ‘P’, ‘T’, ‘q’, ‘9’, ‘+’] -> [97, 54, 121, 80, 84, 113, 57, 43]
 * <p>
 * Далее определить среднее арифметическое всех элементов целочисленного массива и
 * вывести на консоль только те элементы, которые больше этого среднего арифметического.
 */
public class Task2 {
    public static void main(String[] args) {
        char[] values = {'a', '6', 'y', 'P', 'T', 'q', '9', '+'};
        isArrayNumbers(values);
    }

    private static void printArrayNumbers(char[] values) {
        int sumArray = sumArray(values);
        int average = isAverage(sumArray, values.length);
        for (char value : values) {
            if (value > average) {
                System.out.println(value + " - " + (int) value);
            }
        }
    }

    private static int sumArray(char[] values) {
        int sumArray = 0;
        for (char value : values) {
            sumArray += (int) value;
        }
        return sumArray;
    }

    private static int isAverage(int value, int size) {
        return value / size;
    }
}
