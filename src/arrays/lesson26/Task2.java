package src.arrays.lesson26;

/**
 * Написать программу, заносящую в массив первые 100 целых чисел, делящихся на 13 или на 17, и печатающую его.
 */
public class Task2 {
    public static void main(String[] args) {

        int [] value = new int[100];
        fillArray(value);
        Task1.printArrayFor(value);

    }

    private static void fillArray(int[] value) {
        int currentIndex = 0;
        for (int currentValue = 1; currentIndex < value.length; currentValue++) {
            if (currentValue % 13 == 0 || currentValue % 17 == 0){
                value[currentIndex] = currentValue;
                currentIndex++;
            }
        }
    }
}
