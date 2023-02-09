package src.arrays.lesson26;

/**
 * Написать 2 метода, которые определяют индекс минимального и максимального значения
 * одномерного массива соответственно.
 */
public class Task4 {
    public static void main(String[] args) {

        int[] values = {1, 7, 0, 28, -24, 109, 5};
        System.out.println(getMinIndex(values));
        System.out.println(getMaxIndex(values));
    }

    public static int getMinIndex(int[] values) {
        int minIndex = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] < values[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static int getMaxIndex(int[] values) {
        int maxIndex = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[maxIndex] < values[i]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
