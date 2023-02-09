package src.arrays.lesson25;

public class Array3D {
    public static void main(String[] args) {

        int[][][][] rookie = {{{{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}},
                {{10, 11, 12},
                        {13, 14, 15},
                        {16, 17, 18}},
                {{19, 20, 21},
                        {22, 23, 24},
                        {25, 26, 27}}},
        {{{1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}},
            {{10, 11, 12},
                {13, 14, 15},
                {16, 17, 18}},
            {{19, 20, 21},
                {22, 23, 24},
                {25, 26, 27}}}};

        for (int[][][] ints : rookie) {
            System.out.println();
            for (int[][] anInt : ints) {
                System.out.println();
                for (int[] ints1 : anInt) {
                    System.out.println();
                    for (int i : ints1) {
                        System.out.print(i + " ");
                    }
                }
            }
        }
    }
}
