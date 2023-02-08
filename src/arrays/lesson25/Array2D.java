package src.arrays.lesson25;

public class Array2D {

    public static void main(String[] args) {

        int[][] values = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                System.out.print(values[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int[] value : values) {
            for (int i : value) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
