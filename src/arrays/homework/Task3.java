package src.arrays.homework;

import java.util.Arrays;

/**
 * Дан одномерный массив целых чисел.
 * <p>
 * Написать функцию, которая принимает этот массив и разбивает на 3 других:
 * с только отрицательными числами, только положительными и только нули.
 * Если для какого-то из массивов не будет значений, то должен быть создан пустой массив.
 * Возвращает функция эти три массива в виде одного двумерного.
 * <p>
 * Пример:
 * <p>
 * [-4, -18]
 * <p>
 * [-4, 0, 1, 9, 0, -18, 3] -> [0, 0]
 * <p>
 * [1, 9, 3]
 */
public class Task3 {
    public static void main(String[] args) {

        int[] values = {-4, 0, 1, 9, 0, -18, 3};
        int[][] array = isArray2D(values);

        printArray2D(array);
    }

    private static void printArray2D(int[][] array) {
        for (int[] ints : array) {
            System.out.println(Arrays.toString(ints));
        }
    }

    private static int[][] isArray2D(int[] values) {

        int[][] array = new int[3][];

        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                array[i] = getNegativeArray(values);
            } else if (i == 1) {
                array[i] = getZeroArray(values);
            } else {
                array[i] = getPositiveArray(values);
            }
        }
        return array;
    }

    private static int[] getPositiveArray(int[] values) {

        int[] array = new int[calculatePositiveArraySize(values)];
        int index = 0;

        for (int i = 0; i < values.length; i++) {
            if (0 < values[i]) {
                array[index] = values[i];
                index++;
            }
        }
        return array;
    }

    private static int[] getNegativeArray(int[] values) {

        int[] array = new int[calculateNegativeArraySize(values)];
        int index = 0;

        for (int i = 0; i < values.length; i++) {
            if (values[i] < 0) {
                array[index] = values[i];
                index++;
            }
        }
        return array;
    }

    private static int[] getZeroArray(int[] values) {

        int[] array = new int[calculateZeroArraySize(values)];
        int index = 0;

        for (int i = 0; i < values.length; i++) {
            if (values[i] == 0) {
                array[index++] = values[i];
            }
        }
        return array;
    }

    private static int calculatePositiveArraySize(int[] values) {

        int size = 0;

        for (int value : values) {
            if (0 < value) {
                size++;
            }
        }
        return size;
    }

    private static int calculateNegativeArraySize(int[] values) {

        int size = 0;

        for (int value : values) {
            if (value < 0) {
                size++;
            }
        }
        return size;
    }

    private static int calculateZeroArraySize(int[] values) {

        int size = 0;

        for (int value : values) {
            if (value == 0) {
                size++;
            }
        }
        return size;
    }
}
