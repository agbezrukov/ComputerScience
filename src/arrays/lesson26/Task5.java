package src.arrays.lesson26;

/**
 * Определить сумму элементов целочисленного массива, расположенных между минимальным и максимальным значениями.
 */
public class Task5 {
    public static void main(String[] args) {

        int[] values = {1, 7, 0, 28, -24, 66, 109, 5};

        System.out.println("Sum: " + sum(values));
        System.out.println("Sum2: " + sum2(values));
    }

    public static int sum2(int[] values) {
        int result = 0;
        int minIndex = Task4.getMinIndex(values);
        int maxIndex = Task4.getMaxIndex(values);
        if (maxIndex < minIndex) {
            int temp = maxIndex;
            maxIndex = minIndex;
            minIndex = temp;
        }
        for (int i = minIndex + 1; i < maxIndex; i++) {
            result += values[i];
        }
        return result;
    }

    public static int sum(int[] values) {
        int result = 0;
        int minIndex = Task4.getMinIndex(values);
        int maxIndex = Task4.getMaxIndex(values);
        int startIndex = Math.min(minIndex, maxIndex);
        int endIndex = Math.max(minIndex, maxIndex);
        for (int i = startIndex + 1; i < endIndex; i++) {
            result += values[i];
        }
        return result;
    }
}
