package src.arrays.homework;

import java.util.Arrays;

/**
 * Задание 1
 * Дан одномерный массив целых чисел.
 * Написать функцию, удаляющую из него все отрицательные элементы
 * (удалить - значит создать новый массив с только положительными элементами).
 * После удаления - умножить каждый элемент массива на его длину.
 * Например: [3, 5, -6, 3, 2, -9, 0, -123] -> [15, 25, 15, 10, 0]
 * <p>
 * Не забывать, что всю логику приложения нужно выносить в отдельные функции.
 * main - только для тестирования написанного функционала.
 */
public class Task1 {

    public static void main(String[] args) {
        int[] values = {3, 5, -6, 3, 2, -9, 0, -123};
        System.out.println(Arrays.toString(removeNegativeNumbers(values)));
    }

    private static int[] removeNegativeNumbers(int[] values) {
        int index = 0;
        int[] removeArray = new int[calculateArraySize(values)];
        for (int value : values) {
            if (value >= 0) {
                removeArray[index] = value;
                index++;
            }
        }
        return multiplyByFive(removeArray);
    }

    private static int calculateArraySize(int[] values) {
        int size = 0;
        for (int value : values) {
            if (value >= 0) {
                size++;
            }
        }
        return size;
    }

    private static int[] multiplyByFive(int[] values) {
        for (int i = 0; i < values.length; i++) {
            values[i] *= values.length;
        }
        return values;
    }
}
