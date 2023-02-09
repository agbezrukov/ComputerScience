package src.arrays.lesson26;

/**
 * Написать программу, которая печатает массив сначала в обычном порядке, затем в обратном.
 */
public class Task1 {

    public static void main(String[] args) {

        int[] values = {4, 5, 3, 8, 6, 99, 0};
        printArrayReverse(values);
        printArrayFor(values);
        printArrayForeach(values);

    }

    public static void printArrayReverse(int[] value) {

        for (int i = value.length - 1; i >= 0; i--) {
            System.out.print(value[i] + " ");
        }
        System.out.println();
    }

    public static void printArrayFor(int[] value) {
        for (int i = 0; i < value.length; i++) {
            System.out.print(value[i] + " ");
        }
        System.out.println();
    }

    public static void printArrayForeach(int[] value) {
        for (int i : value) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
