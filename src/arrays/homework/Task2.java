package src.arrays.homework;

/**
 * Дан одномерный массив символов..
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
        getArrayNumbers(values);
    }

    private static void getArrayNumbers(char[] values) {
        int sumArray = getSumArray(values);
        double average = getAverageSum(sumArray, values.length);

        int[] intValues = new int[values.length];

        for (int i = 0; i < values.length; i++) {
            intValues[i] = values[i];
        }

        for (int intValue : intValues) {
            if (intValue > average) {
                System.out.print(intValue + " ");
            }
        }
    }

    private static int getSumArray(char[] values) {
        int sumArray = 0;

        for (char value : values) {
            sumArray += (int) value;
        }
        return sumArray;
    }


    private static double getAverageSum(int value, int size) {
        return (double) value / size;
    }
}
