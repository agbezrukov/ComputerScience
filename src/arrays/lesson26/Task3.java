package src.arrays.lesson26;

/**
 * Написать метод equals, который определяет, равны ли между собой соответствующие элементы 2-х двумерных массивов
 */
public class Task3 {
    public static void main(String[] args) {

        int[][] values1 = {
                {1, 2, 3},
                {4, 5, 6, 7},
                {7, 8}
        };
        int[][] values2 = {
                {1, 2, 3},
                {4, 5, 6, 7},
                {7, 8}
        };

        System.out.println(equals(values1,values2));
    }

    public static boolean equals(int[][] value1, int[][] value2) {

        if (value1.length != value2.length) {
            return false;
        }

        for (int i = 0; i < value1.length; i++) {
            int[] array1 = value1[i];
            int[] array2 = value2[i];
            if (array1.length != array2.length) {
                return false;
            }
            for (int j = 0; j < array1.length; j++) {
                if (array1[j] != array2[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
